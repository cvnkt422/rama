package com.vnkt.rama;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class RamaApplication {

	static Logger logger = LoggerFactory.getLogger(RamaApplication.class);

	@PostConstruct
	public void init()
	{
		logger.info("Application Started");
	}


	public static void main(String[] args) {

		logger.info("Application Executed");
		SpringApplication.run(RamaApplication.class, args);

	}

	@GetMapping
	public ResponseEntity<String> showHome(){

		logger.info("Coming inside Controller");

		return new ResponseEntity<>("Welcome Sri Rama Chandra", HttpStatus.OK);

	}

}
