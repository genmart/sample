package com.spring.project.sample.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@RestController()
public class MainController {

	private static final Logger logger = LogManager.getLogger(MainController.class);
	
	@GetMapping("/main")
	public String index() {
		logger.info("MainController log: ");
		return "<h1>Controller</h1>";
	}
}
