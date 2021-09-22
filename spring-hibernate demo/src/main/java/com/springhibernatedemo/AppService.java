package com.springhibernatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class AppService {
	
	@Autowired
	AppDAO appDAO;
	
    @Transactional
    public void saveStudent(Student student) {
    	appDAO.saveStudent(student);
    }
	
	

}
