package aua.dbproject.common.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalTime;
import java.util.List;

/**
 * Created by hrachyayeghishyan on 11/16/17.
 */
public class CourseFilters {
    private String department;
    private String begin;
    private String finish;
    private String title;
    private String instructor;
    private String weekDays;
    private String clusters;
    //@JsonProperty("busyTime")
    private String[] busyTime;
//    private Boolean upper;
//
    public CourseFilters(){}

    public CourseFilters(String department, String begin, String finish, String title, String instructor, String weekDays, String clusters, String[] busyTime) {
        this.department = department;
        this.begin = begin;
        this.finish = finish;
        this.title = title;
        this.instructor = instructor;
        this.weekDays = weekDays;
        this.clusters = clusters;
        this.busyTime = busyTime;
    }

    public String getClusters() {
        return clusters;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }

    public void setClusters(String clusters) {
        this.clusters = clusters;
    }

    public String getWeekDays() {
        return weekDays;
    }

    public void setWeekDays(String weekDays) {
        this.weekDays = weekDays;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String[] getBusyTime() {
        return busyTime;
    }

    public void setBusyTime(String[] busyTime) {
        this.busyTime = busyTime;
    }

    //    public Boolean getUpper() {
//        return upper;
//    }
//
//    public void setUpper(Boolean upper) {
//        this.upper = upper;
//    }
}
