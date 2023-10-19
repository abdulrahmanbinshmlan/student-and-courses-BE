package com.example.student.and.courses.controller;

import com.example.student.and.courses.controller.dto.student.StudentDto;
import com.example.student.and.courses.data.student.Student;
import com.example.student.and.courses.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/student")
public class StudentRestController {

    @Autowired
    StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudents() {
        return new ResponseEntity<>(this.studentService.getAllStudents().stream().map(studentModel -> new StudentDto(studentModel.getStudentId(),studentModel.getName(),studentModel.getCourses())).collect(Collectors.toList()), HttpStatus.OK);
    }

    @PostMapping
    public void saveStudent(@RequestBody StudentDto studentDto) {
        Student student = new Student(studentDto.getStudentId(),studentDto.getName(),studentDto.getCourses());
        this.studentService.saveStudent(student);
    }

    @DeleteMapping
    public void deleteStudent(@PathVariable int studentId) {
        this.studentService.deleteStudentByStudentId(studentId);
    }

    @PutMapping
    public void updateStudent(@RequestBody StudentDto studentDto) {
        this.studentService.updateStudent(studentDto.getStudentId(),studentDto.getName(),studentDto.getCourses());
    }
}
