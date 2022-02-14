package com.example.postrosnja_struje;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages={"com.example.postrosnja_struje"})
@ComponentScan(basePackages = {"com.example.postrosnja_struje"})
public class PostrosnjaStrujeApplication{

	public static void main(String[] args) {
		SpringApplication.run(PostrosnjaStrujeApplication.class, args);
	}

}
