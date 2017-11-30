package aua.dbproject.service.repository;

import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import aua.dbproject.common.dto.CourseDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by hrachyayeghishyan on 11/23/17.
 */
@Repository
public class CourseRepository {

    @Autowired
    private Client client;


    private SearchResponse getCS(){
        return client.prepareSearch("aua")
                .setQuery(
                        QueryBuilders.matchQuery("subject_code", "CS")
                )
                .get();
    }

    public List<CourseDto> getCSres(){
        SearchResponse searchResponse = getCS();
        SearchHit[] searchHits = searchResponse.getHits().getHits();
        //List<String> weekdays = new ArrayList<>();
        List<CourseDto> result = new ArrayList<>();

        for(SearchHit sh : searchHits){
            String subjectCode = (String) sh.getSource().get("subject_code");
            Integer courseCode = (Integer) sh.getSource().get("course_code");
            String section = (String) sh.getSource().get("section");
            String title = (String) sh.getSource().get("title");
            Integer crn = (Integer) sh.getSource().get("crn");
            Integer capacity = (Integer) sh.getSource().get("capacity");
            Integer credits = (Integer) sh.getSource().get("credits");
            String  startDate = (String) sh.getSource().get("start_date");
            String  endDate = (String) sh.getSource().get("end_date");

            String weekdays = (String) sh.getSource().get("week_days");
//            for (Object wd : (List) sh.getSource().get("week_days")) {
//                weekdays.add((String) wd);
//            }

            String  startTime = (String) sh.getSource().get("start_time");
            String  endTime = (String) sh.getSource().get("end_time");
            String building = (String) sh.getSource().get("building");
            String room = (String) sh.getSource().get("room");
            String instructorName = (String) sh.getSource().get("instructor_name");

            result.add(new CourseDto(subjectCode, courseCode, section, title, crn, capacity, credits, startDate, endDate, weekdays, startTime, endTime, building, room, instructorName));
        }
        return result;
    }


}
