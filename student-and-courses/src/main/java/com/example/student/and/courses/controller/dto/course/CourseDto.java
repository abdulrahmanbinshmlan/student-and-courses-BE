package com.example.student.and.courses.controller.dto.course;

public class CourseDto {
    private int courseId;
    private String name;

    public CourseDto() {
    }

    public CourseDto(int courseId, String name) {
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
