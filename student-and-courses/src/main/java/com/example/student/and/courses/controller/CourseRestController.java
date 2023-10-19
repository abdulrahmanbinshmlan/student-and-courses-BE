package com.example.student.and.courses.controller;

import com.example.student.and.courses.controller.dto.course.CourseDto;
import com.example.student.and.courses.controller.dto.student.StudentDto;
import com.example.student.and.courses.data.course.Course;
import com.example.student.and.courses.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/courses")
public class CourseRestController {

    @Autowired
    CourseService courseService;

    @GetMapping
    public ResponseEntity<List<CourseDto>> getAllCourses() {
        return new ResponseEntity<>(this.courseService.getAllCourses().stream().map(courseModel -> new CourseDto(courseModel.getCourseId(), courseModel.getName())).collect(Collectors.toList()), HttpStatus.OK);
    }

    @PostMapping
    public void saveCourse(@RequestBody CourseDto courseDto) {
        Course course = new Course(courseDto.getCourseId(),courseDto.getName());
        this.courseService.saveCourse(course);
    }

    @DeleteMapping
    public void deleteCourse(@PathVariable int courseId) {
        this.courseService.deleteCourseByCourseId(courseId);
    }

    @PutMapping
    public void updateCourse(@RequestBody StudentDto studentDto) {
        this.courseService.updateCourse(studentDto.getStudentId(),studentDto.getName());
    }
}
