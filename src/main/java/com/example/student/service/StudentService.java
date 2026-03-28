package com.example.student.codes.service;

import com.example.student.codes.model.Student;

import java.util.List;

public interface StudentService {

    void addStudent(Student student);

    Student findStudentById(int id);

    List<Student> findAll();

    boolean deleteStudentById(int id);

}
