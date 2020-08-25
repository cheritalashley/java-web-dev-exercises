package src.org.launchcode.java.demos.lsn3classes1.school;

import java.util.HashMap;

public class Course {

    private HashMap<String, String> courseNameDesc;
    private int courseId;
    private String coursePreRecs;

    public Course(HashMap<String, String> courseNameDesc, int courseId, String coursePreRecs) {
        this.courseNameDesc = courseNameDesc;
        this.courseId = courseId;
        this.coursePreRecs = coursePreRecs;
    }

    public HashMap<String, String> getCourseNameDesc() {
        return courseNameDesc;
    }

    public void setCourseNameDesc(HashMap<String, String> courseNameDesc) {
        this.courseNameDesc = courseNameDesc;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCoursePreRecs() {
        return coursePreRecs;
    }

    public void setCoursePreRecs(String coursePreRecs) {
        this.coursePreRecs = coursePreRecs;
    }
}
