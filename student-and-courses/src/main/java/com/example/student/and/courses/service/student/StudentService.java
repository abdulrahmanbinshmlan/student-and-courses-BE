package com.example.student.and.courses.service.student;

import com.example.student.and.courses.data.course.Course;
import com.example.student.and.courses.data.student.Student;
import com.example.student.and.courses.model.course.CourseModel;
import com.example.student.and.courses.model.student.StudentModel;

import java.util.List;

public interface StudentService {

    void saveStudent(Student student);

    List<StudentModel> getAllStudents();

    void deleteStudentByStudentId(int studentId);

    void updateStudent(int studentId, String name, List<CourseModel> courses);

}
