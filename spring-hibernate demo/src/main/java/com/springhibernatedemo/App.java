package com.springhibernatedemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new 
         		AnnotationConfigApplicationContext(AppConfig.class);
    	AppService appService = context.getBean("appService",AppService.class);
    	Student student = new Student();
    	student.setName("shreya");
    	student.setAddress("hyderabad");
    	appService.saveStudent(student);
    }
}
