package aua.dbproject.common.filter;

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
    private String[] busyTimeMWF;
    private String[] busyTimeTR;
//    private Boolean upper;
//
    public CourseFilters(){}

    public CourseFilters(String department, String begin, String finish, String title, String instructor, String weekDays, String clusters, String[] busyTimeMWF, String[] busyTimeTR) {
        this.department = department;
        this.begin = begin;
        this.finish = finish;
        this.title = title;
        this.instructor = instructor;
        this.weekDays = weekDays;
        this.clusters = clusters;
        this.busyTimeMWF = busyTimeMWF;
        this.busyTimeTR = busyTimeTR;
    }

    public String[] getBusyTimeMWF() {
        return busyTimeMWF;
    }

    public void setBusyTimeMWF(String[] busyTimeMWF) {
        this.busyTimeMWF = busyTimeMWF;
    }

    public String[] getBusyTimeTR() {
        return busyTimeTR;
    }

    public void setBusyTimeTR(String[] busyTimeTR) {
        this.busyTimeTR = busyTimeTR;
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


    //    public Boolean getUpper() {
//        return upper;
//    }
//
//    public void setUpper(Boolean upper) {
//        this.upper = upper;
//    }
}
