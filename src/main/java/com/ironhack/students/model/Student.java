package com.ironhack.students.model;

import javax.persistence.*;
// La etiqueta entity hace referencia al modelado de una tabla
@Entity
//Hace Referencia al nombre de la tabla
@Table(name="students")
public class Student {

    //Id especifica cuál es la primary key
    @Id
    //Utilizamos el decorador generated value para establecer
    // una estrategia de generación automática de ids
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    // Podemos definir de manera explícita el nombre de cada columna
    @Column(name = "first_name")
    private String firstName;
    private String lastName;
    private int grade;

    public Integer getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
