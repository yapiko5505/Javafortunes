package com.example.fortuneforms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackageClasses = Fortune.class)
public class FortuneformsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FortuneformsApplication.class, args);
	}

}
