package com.example.student.and.courses.model.course;

import java.io.Serializable;

public class CourseModel implements Serializable {

    private int courseId;
    private String name;

    public CourseModel() {
    }

    public CourseModel(int courseId, String name) {
        this.courseId = courseId;
        this.name = name;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
