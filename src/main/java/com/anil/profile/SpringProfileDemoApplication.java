package com.anil.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.profile.controllers.SpringProfileDemoController;

@SpringBootApplication
public class SpringProfileDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringProfileDemoApplication.class, args);

		System.out.println("Primary Configuration - " + run.getBean(SpringProfileDemoController.class).getProfile());
	}
}
