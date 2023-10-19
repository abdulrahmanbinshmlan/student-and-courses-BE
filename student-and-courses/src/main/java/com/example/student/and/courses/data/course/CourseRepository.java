package com.example.student.and.courses.data.course;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends MongoRepository<Course,String> {

    List<Course> findAll();
    void deleteByCourseId(int courseId);

    void updateAllByCourseId(int courseId, String name);

}
