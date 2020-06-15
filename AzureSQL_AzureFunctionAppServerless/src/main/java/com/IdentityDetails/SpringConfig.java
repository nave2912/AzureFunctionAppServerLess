package com.IdentityDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.IdentityDetails*"})
@EntityScan("com.IdentityDetails*")
@EnableJpaRepositories("com.IdentityDetails*")
public class SpringConfig {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringConfig.class, args);
	}

}
