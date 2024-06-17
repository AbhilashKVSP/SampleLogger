package com.JenkinsLearn.sample;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class SampleApplicationTests {

	Logger log = LoggerFactory.getLogger(SampleApplicationTests.class);
	
	@Test
	void contextLoads() {
		log.info("Test Case Executing...");
		assertEquals(true,true);
	}

}
