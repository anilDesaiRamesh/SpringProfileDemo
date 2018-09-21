/**
 * 
 */
package com.anil.profile.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author Anil_Ramesh
 *
 */
@Service
@Primary
@Profile("en")
public class GreetingServiceEnProfileImpl implements GreetingService {

	public static final String PROFILE_EXM = "En profile controller!!!!";

	public String profileExample() {
		return PROFILE_EXM;

	}

}
