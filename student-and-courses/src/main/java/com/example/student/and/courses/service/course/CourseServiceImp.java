package com.example.student.and.courses.service.course;

import com.example.student.and.courses.data.course.Course;
import com.example.student.and.courses.data.course.CourseRepository;
import com.example.student.and.courses.model.course.CourseModel;

import java.util.List;
import java.util.stream.Collectors;

public class CourseServiceImp implements CourseService{

    private CourseRepository courseRepository;
    @Override
    public void saveCourse(Course course) {
        this.courseRepository.save(course);
    }

    @Override
    public List<CourseModel> getAllCourses() {
        List<Course> courses = this.courseRepository.findAll();
        return courses.stream().map(course -> new CourseModel(course.getCourseId(),course.getName())).collect(Collectors.toList());
    }

    @Override
    public void deleteCourseByCourseId(int courseId) {
        this.courseRepository.deleteByCourseId(courseId);
    }

    @Override
    public void updateCourse(int courseId, String name) {
        this.courseRepository.updateAllByCourseId(courseId, name);
    }
}
