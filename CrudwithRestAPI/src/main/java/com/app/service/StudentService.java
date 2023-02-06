package com.app.service;

import java.util.List;

import com.app.pojo.Student;

public interface StudentService {
List<Student> getAllStudents();
Student addStudent(Student student);
Student editStudent(Student student);
String deleteStudent(Long id);
}
