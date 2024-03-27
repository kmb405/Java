package com.coding_dojo.student_roster.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coding_dojo.student_roster.models.Student;
import com.coding_dojo.student_roster.repositories.StudentRepo;

@Service
public class StudentServ {
	@Autowired
	StudentRepo studentRepo;
	
	public List<Student> allStudents() {
		return studentRepo.findAll();
	}
	
	public Student createStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public Student updateStudent(Student student) {
		return studentRepo.save(student);
	}
	
	public List<Student> dormStudents(Long dormId) {
		return studentRepo.findByDormIdIs(dormId);
	}
	
	public void removeFromDorm(Student student) {
		student.setDorm(null);
		studentRepo.save(student);
	}
	
	public Student findStudent(Long id) {
		Optional<Student> optionalStudent = studentRepo.findById(id);
		if(optionalStudent.isPresent()) {
			return optionalStudent.get();
		} else {
			return null;
		}
	}
	
	public List<Student> allStudentsInDorm(Long dormId) {
		List<Student> students = studentRepo.findAllByForeignId(dormId);
		return students;
	}
}
