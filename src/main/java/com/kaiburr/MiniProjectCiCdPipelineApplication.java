package com.kaiburr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootConfiguration
@RestController
public class MiniProjectCiCdPipelineApplication<Public> {

	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome to Task 5. CI-CD Pipeline !";
	}
	
	public static void main(String[] args) {
		
		
		SpringApplication.run(MiniProjectCiCdPipelineApplication.class, args);
	}


}
