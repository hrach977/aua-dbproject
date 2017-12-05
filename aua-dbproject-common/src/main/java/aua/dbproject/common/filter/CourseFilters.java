package aua.dbproject.common.filter;

/**
 * Created by hrachyayeghishyan on 11/16/17.
 */
public class CourseFilters {
    private String department;
    private String title;
//    private Boolean upper;
//
    public CourseFilters(){}

    public CourseFilters(String department, String title) {
        this.department = department;
        this.title = title;
       // this.upper = upper;
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

    //    public Boolean getUpper() {
//        return upper;
//    }
//
//    public void setUpper(Boolean upper) {
//        this.upper = upper;
//    }
}
