package aua.dbproject.service.repository;

import aua.dbproject.common.dto.CourseDto;
import aua.dbproject.common.filter.CourseFilters;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Repository
public class CourseRepository {

    @Autowired
    private Client client;

    private CourseFilters courseFilters;


    public BoolQueryBuilder filtering(CourseFilters courseFilters) throws IllegalArgumentException {
        BoolQueryBuilder bquery = QueryBuilders.boolQuery();

        if(!courseFilters.getDepartment().isEmpty()){
            bquery.filter(QueryBuilders.termsQuery("subject_code", courseFilters.getDepartment()));
        }
        if(!courseFilters.getInstructor().isEmpty()){
            bquery.filter(QueryBuilders.matchQuery("instructor_name", courseFilters.getInstructor()));
        }
        if(!courseFilters.getBegin().isEmpty() && !courseFilters.getFinish().isEmpty()){
            bquery.must(QueryBuilders.rangeQuery("start_time").gte(courseFilters.getBegin()).lt("23:00"));
            bquery.must(QueryBuilders.rangeQuery("end_time").gte("00:00").lte(courseFilters.getFinish()));
        }
        if(!courseFilters.getTitle().isEmpty()){
            bquery.filter(QueryBuilders.matchQuery("title", courseFilters.getTitle()));
        }
        if(!courseFilters.getWeekDays().isEmpty()){
            bquery.should(QueryBuilders.matchQuery("week_days", courseFilters.getWeekDays()));
        }
        if(!courseFilters.getClusters().isEmpty()){
            bquery.should(QueryBuilders.matchQuery("cluster", courseFilters.getClusters()));
        }
        if(courseFilters.getBusyTime().length!=0){
            bquery.mustNot(QueryBuilders.termsQuery("start_time", courseFilters.getBusyTime()));
        }


//        if(courseFilters.getUpper()){
//            bquery.filter(QueryBuilders.prefixQuery("course_code", "2"));
//        }
//        if(!courseFilters.getUpper()){
//            bquery.filter(QueryBuilders.prefixQuery("course_code", "1"));
//        }

        return bquery;
    }


    private SearchResponse getCS(CourseFilters courseFilters){
        return client.prepareSearch("aua2")
                .setQuery(filtering(courseFilters))
                .setSize(3000)
                .get();
    }

    public List<CourseDto> getCSres(CourseFilters courseFilters){
        SearchResponse searchResponse = getCS(courseFilters);
        SearchHit[] searchHits = searchResponse.getHits().getHits();
        //List<String> weekdays = new ArrayList<>();
        List<CourseDto> result = new ArrayList<>();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat format = new SimpleDateFormat("HH:MM");

        for(SearchHit sh : searchHits){
            String subjectCode = (String) sh.getSource().get("subject_code");
            Integer courseCode = (Integer) sh.getSource().get("course_code");
            String section = (String) sh.getSource().get("section");
            String title = (String) sh.getSource().get("title");
            Integer crn = (Integer) sh.getSource().get("crn");
            Integer capacity = (Integer) sh.getSource().get("capacity");
            Integer credits = (Integer) sh.getSource().get("credits");
            String  start = (String) sh.getSource().get("start_date");
            Date startDate = new Date();
            try {
                startDate = df.parse(start);
            } catch (ParseException e){
                e.printStackTrace();
            }
            String  end = (String) sh.getSource().get("end_date");
            Date endDate = new Date();
            try{
                endDate = df.parse(end);
            } catch (ParseException e){
                e.printStackTrace();
            }

            String weekdays = (String) sh.getSource().get("week_days");
//            for (Object wd : (List) sh.getSource().get("week_days")) {
//                weekdays.add((String) wd);
//            }

            String  startTime = (String) sh.getSource().get("start_time");
            //LocalTime startTime = parse(sTime);
            String  endTime = (String) sh.getSource().get("end_time");
            //LocalTime endTime = parse(eTime);
            String building = (String) sh.getSource().get("building");
            String room = (String) sh.getSource().get("room");
            String cluster = (String) sh.getSource().get("cluster");
            String instructorName = (String) sh.getSource().get("instructor_name");

            result.add(new CourseDto(subjectCode, courseCode, section, title, crn, capacity, credits, startDate, endDate, weekdays, startTime, endTime, building, room, instructorName, cluster));
        }
        return result;
    }


}
