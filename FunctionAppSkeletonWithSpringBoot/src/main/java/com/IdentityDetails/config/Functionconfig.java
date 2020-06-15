package com.IdentityDetails.config;

import java.util.function.Function;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.IdentityDetails.model.Greeting;
import com.IdentityDetails.model.IdentificationIdDetails;

@Configuration
public class Functionconfig {
	@Bean
    public Function<IdentificationIdDetails, Greeting> hello() {
        return identificationiddetails -> new Greeting("Welcome, " + identificationiddetails.getCardId());
    }
}
