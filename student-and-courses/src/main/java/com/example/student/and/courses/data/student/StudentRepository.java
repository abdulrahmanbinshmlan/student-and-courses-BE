package com.example.student.and.courses.data.student;

import com.example.student.and.courses.model.course.CourseModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student,String> {
    List<Student> findAll();

    void deleteByStudentId(int studentId);

    void updateAllByStudentId(int studentId, String name, List<CourseModel> courses);
}
