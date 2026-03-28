package com.example.student.model;

public class Student {

    private static int genId = 1;

    private int id;

    private String name;

    public Student(){

    }

    public Student(String name) {
        this.id = genId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
