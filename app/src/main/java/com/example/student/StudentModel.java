package com.example.student;

public class StudentModel {
    Integer id;
    String name, studentId, major;

    // Constructor untuk tambah data baru (tanpa ID)
    public StudentModel(String name, String studentId, String major) {
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    // Constructor untuk ambil data dari database (dengan ID)
    public StudentModel(Integer id, String name, String studentId, String major) {
        this.id = id;
        this.name = name;
        this.studentId = studentId;
        this.major = major;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return this.major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}