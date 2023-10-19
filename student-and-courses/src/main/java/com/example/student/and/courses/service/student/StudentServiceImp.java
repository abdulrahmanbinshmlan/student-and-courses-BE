package com.example.student.and.courses.service.student;

import com.example.student.and.courses.data.course.Course;
import com.example.student.and.courses.data.student.Student;
import com.example.student.and.courses.data.student.StudentRepository;
import com.example.student.and.courses.model.course.CourseModel;
import com.example.student.and.courses.model.student.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentServiceImp implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        this.studentRepository.save(student);
    }

    @Override
    public List<StudentModel> getAllStudents() {
        List<Student> students = this.studentRepository.findAll();
        return students.stream().map(student -> new StudentModel(student.getStudentId(), student.getName(), student.getCourses())).collect(Collectors.toList());
    }

    @Override
    public void deleteStudentByStudentId(int studentId) {
        this.studentRepository.deleteByStudentId(studentId);
    }

    @Override
    public void updateStudent(int studentId, String name, List<CourseModel> courses) {
        this.studentRepository.updateAllByStudentId(studentId, name, courses);
    }
}
