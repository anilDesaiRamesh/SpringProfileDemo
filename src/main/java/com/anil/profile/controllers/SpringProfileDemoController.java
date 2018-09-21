/**
 * 
 */
package com.anil.profile.controllers;

import org.springframework.stereotype.Controller;

import com.anil.profile.services.GreetingService;

/**
 * @author Anil_Ramesh
 *
 */
@Controller
public class SpringProfileDemoController {

	private GreetingService greetingService;

	public SpringProfileDemoController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}

	public String getProfile() {
		return greetingService.profileExample();
	}
}
