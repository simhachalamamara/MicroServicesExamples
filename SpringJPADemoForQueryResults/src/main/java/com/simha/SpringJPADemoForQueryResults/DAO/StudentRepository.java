package com.simha.SpringJPADemoForQueryResults.DAO;

import java.util.List;

import javax.persistence.LockModeType;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.simha.SpringJPADemoForQueryResults.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	
	Student findByFirstNameAndLastName(String firstName, String lastName);

	Student findByAge(int age);
	@Lock(LockModeType.READ)
	Student findByAgeGreaterThan(int age);

	List<Student> findByAgeIsNotNull();

	

	List<Student> findByAgeOrderByLastNameDesc(int age);
	
	@Modifying
@Transactional
@Query("update Student s set s.age=43 where s.firstName=:firstName and s.lastName=:lastName")
	int findBylastNamesbyusingfirstName(@Param("firstName") String firstName,@Param("lastName") String lastName);

	

}
