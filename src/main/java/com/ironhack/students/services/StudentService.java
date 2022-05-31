package com.ironhack.students.services;

import com.ironhack.students.model.Student;
import com.ironhack.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        // SELECT * FROM students;
        return studentRepository.findAll();
    }

    public List<Student> getStudentsStartingWithA() {
        List<Student> studentsWithA = new ArrayList<>();
        for (Student student : studentRepository.findAll()) {
            if(student.getFirstName().charAt(0) == 'a') {
                studentsWithA.add(student);
            }
        }
        return studentsWithA;
    }

    public Student findStudentByName(String name) {
        return studentRepository.findStudentByFirstName(name);

    }

    public List<Student> findStudentsWhoPassed() {
        return studentRepository.findStudentsByGradeBetween(5, 10);

    }
}
