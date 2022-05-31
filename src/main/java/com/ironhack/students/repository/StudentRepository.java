package com.ironhack.students.repository;

import com.ironhack.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    //En el futuro añadiremos funcionalidad extra a nuestra aplicación

    public Student findStudentByFirstName(String firstName);
    public List<Student> findStudentsByGradeBetween(int i, int x);
    public List<Student> findStudentsByLastNameContains(char a);
    public List<Student> findStudentsByLastNameContainsAndAndFirstNameAndAndGradeGreaterThan(
            String lastName, String firstName, int grade);



}
