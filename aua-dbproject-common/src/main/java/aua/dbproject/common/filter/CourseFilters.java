package aua.dbproject.common.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalTime;
import java.util.List;

/**
 * Created by hrachyayeghishyan on 11/16/17.
 */
public class CourseFilters {
    private String department;
    private String title;
    private String instructor;
    //@JsonProperty("busyTime")
    private String[] busyTime;
//    private Boolean upper;
//
    public CourseFilters(){}

    public CourseFilters(String department, String title, String instructor, String[] busyTime) {
        this.department = department;
        this.title = title;
        this.instructor = instructor;
        this.busyTime = busyTime;
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
