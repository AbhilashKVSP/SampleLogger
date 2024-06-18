package com.JenkinsLearn.sample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SampleApplication {

//	static Logger logger =LoggerFactory.getLogger(SpringApplication.class);
	
	@PostConstruct
	public void init() {
		logger.info("Application Started ....");
	}
	
	public static void main(String[] args) {
		logger.info("Application Executed...");
		logger.info("Application Executed Second Log ...");
		SpringApplication.run(SampleApplication.class, args);
		logger.info("Application Ended...");
	}

}
