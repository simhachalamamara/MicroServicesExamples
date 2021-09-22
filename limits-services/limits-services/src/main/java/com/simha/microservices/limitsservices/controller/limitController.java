package com.simha.microservices.limitsservices.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simha.microservices.limitsservices.bean.Limits;
import com.simha.microservices.limitsservices.configuration.Configuration;

@RestController
public class limitController {
	
	@Autowired
	private Configuration configuration;
	@GetMapping("/limits")
	public Limits retriveLimits()
	{
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}

}
