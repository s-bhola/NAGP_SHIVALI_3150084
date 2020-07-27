package com.nagp.NAGP_SHIVALI_3150084;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NagpShivali3150084Application {

	public static void main(String[] args) {
		SpringApplication.run(NagpShivali3150084Application.class, args);
	}
	
	@GetMapping("/hello")
	public String greeting() {
		return "Hello!!";
	}


}
