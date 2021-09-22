package com.simha.SpringJPADemoForQueryResults.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class StudentControllerAdviceException {
	
	@ExceptionHandler
	@ResponseBody
	public String nOdataFoundException(NOdataFoundException ex)
	{
		
		return ex.getMessage();
		
	}

}
