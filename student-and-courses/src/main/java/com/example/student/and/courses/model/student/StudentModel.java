package com.example.student.and.courses.model.student;

import com.example.student.and.courses.model.course.CourseModel;

import java.io.Serializable;
import java.util.List;

public class StudentModel implements Serializable {
    private int studentId;
    private String name;
    private List<CourseModel> courses;

    public StudentModel() {
    }

    public StudentModel(int studentId, String name, List<CourseModel> courses) {
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
