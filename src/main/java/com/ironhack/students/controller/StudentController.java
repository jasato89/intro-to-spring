package com.ironhack.students.controller;

import com.ironhack.students.model.Student;
import com.ironhack.students.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students-a")
    public List<Student> getStudentsStartingWithA() {
        return studentService.getStudentsStartingWithA();
    }

    @GetMapping("/student-maya")
     public Student findStudentNamedMaya() {
        String name = "Jaume";
        return studentService.findStudentByName(name);
    }

    @GetMapping("/estudiantes-aprobados")
    public List<Student> encontrarEstudiantesAprobados() {
        return studentService.findStudentsWhoPassed();
    }

}
