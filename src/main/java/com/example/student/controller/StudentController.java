package com.example.student.controller;

import com.example.student.exception.StudentNotFoundException;
import com.example.student.model.Student;
import com.example.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService service;

    @Autowired
    public StudentController(StudentService service){
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudent(@PathVariable int id){
        Student student = service.findStudentById(id);
        if(student == null){
            throw new StudentNotFoundException("Student not found with id "+id);
        }
        return ResponseEntity.ok(student);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        service.addStudent(student);
        return ResponseEntity.status(HttpStatus.CREATED).body(student);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudentFull(@PathVariable int id,@RequestBody Student theStudent){
        Student student = service.findStudentById(id);
        if(student == null){
            throw new StudentNotFoundException("Student not found with id "+id);
        }
        student.setName(theStudent.getName());
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(student);
    }


    @PatchMapping("/{id}")
    public ResponseEntity<Student> updateStudentPartial(@PathVariable int id,
                                              @RequestBody Map<String,String> updates){
        Student student = service.findStudentById(id);

        if(student == null){
            throw new StudentNotFoundException("Student not found with id "+id);
        }
        if(updates.containsKey("name")){
            student.setName(updates.get("name"));
        }

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(student);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable int id){
        boolean isDeleted = service.deleteStudentById(id);
        if(!isDeleted){
            throw new StudentNotFoundException("Student not found with id "+id);
        }else{
            return ResponseEntity.ok("Deleted - "+id);
        }
    }

}
