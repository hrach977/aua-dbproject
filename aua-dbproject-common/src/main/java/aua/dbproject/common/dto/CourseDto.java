package aua.dbproject.common.dto;

import java.util.Date;
import java.util.List;

/**
 * Created by hrachyayeghishyan on 11/16/17.
 */
public class CourseDto {

    private String subject_code;
    private int course_code;
    private String section;
    private String title;
    private int crn;
    private int capacity;
    private int credits;
    private Date start_date;
    private Date end_date;
    private List<String> week_days;
    private Date start_time;
    private Date end_time;
    private String building;
    private String room;
    private String instructor_name;


}
