package com.augustproject.augustproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class AugustprojectApplication {

	public static void main(String[] args) {

		SpringApplication.run(AugustprojectApplication.class, args);
	}

	@GetMapping(value ="/button")			//button is the URL to be interacted
	public String getdata(){
		return "Hello world";				// Hello world will be printed on the URL button on the browser
	}
}