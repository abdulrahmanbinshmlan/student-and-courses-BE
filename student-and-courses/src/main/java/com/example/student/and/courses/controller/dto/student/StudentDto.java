package com.example.student.and.courses.controller.dto.student;

import com.example.student.and.courses.model.course.CourseModel;

import java.util.List;

public class StudentDto {

    private int studentId;
    private String name;
    private List<CourseModel> courses;

    public StudentDto() {
    }

    public StudentDto(int studentId, String name, List<CourseModel> courses) {
        this.studentId = studentId;
        this.name = name;
        this.courses = courses;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseModel> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseModel> courses) {
        this.courses = courses;
    }
}
