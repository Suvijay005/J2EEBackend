package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojo.Student;
import com.app.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
private StudentService studentservice;
	@GetMapping
	public List<Student> allStudents(){
		return studentservice.getAllStudents();
	}
	@PostMapping
	public Student addStud(@RequestBody Student stud) {
		return studentservice.addStudent(stud);
	}
	@PutMapping
	public Student modifyStudent(@RequestBody Student stud) {
		return studentservice.editStudent(stud);
	}
	@DeleteMapping("/{sid}")
	public String deleteStudent(Long sid) {
		return studentservice.deleteStudent(sid);
	}
	
}
