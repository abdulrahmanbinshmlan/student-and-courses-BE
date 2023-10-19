package com.example.student.and.courses.data.course;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Course {

    @Id
    private int courseId;
    private String name;

    public Course() {
    }

    public Course(int courseId, String name) {
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
