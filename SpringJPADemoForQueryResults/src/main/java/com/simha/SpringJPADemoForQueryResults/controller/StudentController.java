package com.simha.SpringJPADemoForQueryResults.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simha.SpringJPADemoForQueryResults.DTO.StudentDto;
import com.simha.SpringJPADemoForQueryResults.Exception.NOdataFoundException;
import com.simha.SpringJPADemoForQueryResults.Service.StudentServices;
import com.simha.SpringJPADemoForQueryResults.model.Student;

@RestController
public class StudentController {

	private static final int T = 0;
	@Autowired
	private StudentServices studentServices;

	@RequestMapping("/student/insertStudent")
	@PostMapping
	public Student insertStudent(@RequestBody StudentDto studentDto) {
		Student student = new Student();
		student.setAddress(studentDto.getAddress());
		student.setAge(studentDto.getAge());
		student.setFirstName(studentDto.getFirstName());
		student.setLastName(studentDto.getLastName());
		student.setSalary(studentDto.getSalary());
		
		Student studentret = studentServices.insertStudentData(student);
		return studentret;

	}

	@GetMapping
	@RequestMapping("/student/getStudent")
	public List<Student> getStudent() {

		List<Student> student = studentServices.getStudentData();

		return student;
	}

	@RequestMapping("getStudentsByid/{id}")
	@GetMapping
	public Student getStudentDataById(@PathVariable("id") int id) throws NOdataFoundException {
		ResponseEntity<Student> st = null;
		Student student = null;

		Student students = studentServices.getStudentDataByID(id);

		Optional optName = Optional.ofNullable(students.getFirstName());
		if (!optName.isPresent()) {
			throw new NOdataFoundException("No data Found Exception");
		}
		return students;

	}
	@RequestMapping("getStudentsByFirstNameAndLastName/{firstName}/{lastName}")
	@GetMapping
	public int updateStudent(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
		
		int count=studentServices.getStudentDataBasedOnFirstNameAndLastName(firstName,lastName);
		
		return count;
		
	}
	
	@RequestMapping("getStudentsByAge/{age}/{lastName}")
	@GetMapping
	public List<Student> updateStudent(@PathVariable("age") int age,
			@PathVariable("lastName") String lastName) {
		
		List<Student> student=studentServices.getStudentDataByAgeGreaterThan(age,lastName);
		
		return student;
		
	}
	
	

}
