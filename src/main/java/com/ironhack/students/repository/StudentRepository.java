package com.ironhack.students.repository;

import com.ironhack.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    //En el futuro añadiremos funcionalidad extra a nuestra aplicación


}
