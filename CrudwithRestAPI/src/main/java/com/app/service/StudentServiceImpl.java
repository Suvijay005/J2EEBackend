package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.exception.CustomException;
import com.app.pojo.Student;
import com.app.repository.StudentRepository;
@Service
@Transactional
public class StudentServiceImpl implements StudentService{
@Autowired
	private StudentRepository studentrepo;
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}
	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}
	@Override
	public Student editStudent(Student student) {
		// TODO Auto-generated method stub
		if(studentrepo.existsById(student.getId())) {
			return studentrepo.save(student);
		}
		throw new CustomException("Id not found!");
	}
	@Override
	public String deleteStudent(Long id) {
		// TODO Auto-generated method stub
		if(studentrepo.existsById(id)) {
		 studentrepo.deleteById(id);
		 return "Deleted successfully";
		}
		return "Id not found!";
	}
	

}
