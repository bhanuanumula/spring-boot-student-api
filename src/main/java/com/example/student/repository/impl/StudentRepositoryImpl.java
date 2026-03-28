package com.example.student.codes.repository.impl;

import com.example.student.codes.model.Student;
import com.example.student.codes.repository.StudentRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class StudentRepositoryImpl implements StudentRepository {

    private List<Student> students;

    public StudentRepositoryImpl(){
        students = new ArrayList<>();
    }


    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public Student findById(int id) {
        return students.stream().filter(s->s.getId() == id).findFirst().orElse(null);
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public boolean deleteById(int id) {

        Student student = findById(id);
        if(student == null){
            return false;
        }
        students.remove(student);
        return true;
    }
}
