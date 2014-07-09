package com.hackbulgaria.javacore.structureddata;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CoreJavaCourse {

    private List<Student> enrolledStudents;
    private int courseId;
    private String courseName;

    public CoreJavaCourse() {
    }

    public CoreJavaCourse(List<Student> enrolledStudents, int courseId, String courseName) {
        super();
        this.enrolledStudents = enrolledStudents;
        this.courseId = courseId;
        this.courseName = courseName;
    }


    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "CoreJavaCourse [enrolledStudents=" + enrolledStudents + ", courseId=" + courseId + ", courseName="
                + courseName + "]";
    }
}
