package com.ulugbekcodes.studentSystem.service;

import com.ulugbekcodes.studentSystem.model.Student;

import java.util.List;

public interface StudentService  {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
