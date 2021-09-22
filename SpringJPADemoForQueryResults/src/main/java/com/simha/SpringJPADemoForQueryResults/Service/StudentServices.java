package com.simha.SpringJPADemoForQueryResults.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.simha.SpringJPADemoForQueryResults.DAO.StudentRepository;
import com.simha.SpringJPADemoForQueryResults.Exception.NOdataFoundException;
import com.simha.SpringJPADemoForQueryResults.model.Student;

@Service
public class StudentServices {
	@Autowired
	private StudentRepository studentRepository;

	public Student insertStudentData(Student student) {
		Student students = studentRepository.save(student);
		return students;
	}

	
	public List<Student> getStudentData() {
		// TODO Auto-generated method stub
		List<Student> students = studentRepository.findAll();
		List<Student> listStream = students.stream().filter(s -> s.getFirstName().equalsIgnoreCase("amara"))
				.collect(Collectors.toList());
		return listStream;
	}
	@Cacheable(key="#id",value="students")
	public Student getStudentDataByID(int id) throws NOdataFoundException {
		// TODO Auto-generated method stub
		Optional<Student> studentData = studentRepository.findById(id);

		return studentData.orElseThrow(() -> new NOdataFoundException("No data found Exception"));
	}

	public int getStudentDataBasedOnFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		int count=studentRepository.findBylastNamesbyusingfirstName(firstName,lastName);
		return count;
	}
	public Student getStudentDataByAge(int age) {
		// TODO Auto-generated method stub
		Student student=studentRepository.findByAgeGreaterThan(age);
		return student;

	}

	public List<Student> getStudentDataByAgeGreaterThan(int age,String lastName) {
		// TODO Auto-generated method stub
		List<Student> student=studentRepository.findByAgeOrderByLastNameDesc(age);
		return student;

	}

}
