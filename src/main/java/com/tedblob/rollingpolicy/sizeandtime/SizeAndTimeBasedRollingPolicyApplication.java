package com.tedblob.rollingpolicy.sizeandtime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SizeAndTimeBasedRollingPolicyApplication {


	private static final Logger logger = LoggerFactory.getLogger(SizeAndTimeBasedRollingPolicyApplication.class);

	public static void main(String[] args) {
		logger.debug("SpringBootApplication main START");
		SpringApplication.run(SizeAndTimeBasedRollingPolicyApplication.class, args);
		logger.debug("SpringBootApplication main method END");
	}


}
