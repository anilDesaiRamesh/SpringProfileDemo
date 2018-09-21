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
@Profile("es")
public class GreetingServiceEsProfileImpl implements GreetingService {

	public static final String PROFILE2_EXP="Es profile Impl!!!!!";
	/* (non-Javadoc)
	 * @see com.anil.profile.services.GreetingService#profileExample()
	 */
	@Override
	public String profileExample() {
		// TODO Auto-generated method stub
		return PROFILE2_EXP;
	}

}
