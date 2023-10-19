package com.example.student.and.courses.service.course;

import com.example.student.and.courses.data.course.Course;
import com.example.student.and.courses.model.course.CourseModel;

import java.util.List;

public interface CourseService {

    void saveCourse(Course course);

    List<CourseModel> getAllCourses();

    void deleteCourseByCourseId(int courseId);

    void updateCourse(int courseId, String name);


}
