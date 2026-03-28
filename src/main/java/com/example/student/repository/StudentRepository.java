package com.example.student.repository;

import com.example.student.model.Student;

import java.util.List;

public interface StudentRepository {

    void save(Student student);

    Student findById(int id);

    List<Student> findAll();

    boolean deleteById(int id);

}
