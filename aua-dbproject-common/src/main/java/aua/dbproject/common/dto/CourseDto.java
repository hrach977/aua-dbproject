package aua.dbproject.common.dto;

import java.util.Date;
import java.util.List;
import java.util.GregorianCalendar;

/**
 * Created by hrachyayeghishyan on 11/16/17.
 */
public class CourseDto {

    private String subject_code;
    private Integer course_code;
    private String section;
    private String title;
    private Integer crn;
    private Integer capacity;
    private Integer credits;
    private String start_date;  // maybe use just string?
    private String end_date;
    private String week_days;  // remeber to put back List<String>
    private String start_time;
    private String end_time;
    private String building;
    private String room;
    private String instructor_name;

    public CourseDto(){

    }

    public CourseDto(String subject_code, Integer course_code, String section, String title, Integer crn, Integer capacity, Integer credits, String start_date, String end_date, String week_days, String start_time, String end_time, String building, String room, String instructor_name) {
        this.subject_code = subject_code;
        this.course_code = course_code;
        this.section = section;
        this.title = title;
        this.crn = crn;
        this.capacity = capacity;
        this.credits = credits;
        this.start_date = start_date;
        this.end_date = end_date;
        this.week_days = week_days;
        this.start_time = start_time;
        this.end_time = end_time;
        this.building = building;
        this.room = room;
        this.instructor_name = instructor_name;
    }

    public String getSubject_code() {
        return subject_code;
    }

    public void setSubject_code(String subject_code) {
        this.subject_code = subject_code;
    }

    public Integer getCourse_code() {
        return course_code;
    }

    public void setCourse_code(Integer course_code) {
        this.course_code = course_code;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCrn() {
        return crn;
    }

    public void setCrn(Integer crn) {
        this.crn = crn;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String  start_date) {
        this.start_date = start_date;
    }

    public String  getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String  end_date) {
        this.end_date = end_date;
    }

    public String  getWeek_days() {
        return week_days;
    }

    public void setWeek_days(String  week_days) {
        this.week_days = week_days;
    }

    public String  getStart_time() {
        return start_time;
    }

    public void setStart_time(String  start_time) {
        this.start_time = start_time;
    }

    public String  getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String  end_time) {
        this.end_time = end_time;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getInstructor_name() {
        return instructor_name;
    }

    public void setInstructor_name(String instructor_name) {
        this.instructor_name = instructor_name;
    }
}
