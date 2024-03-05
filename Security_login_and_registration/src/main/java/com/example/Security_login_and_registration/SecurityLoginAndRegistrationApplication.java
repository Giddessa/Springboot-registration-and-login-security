package com.example.Security_login_and_registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan (basePackages = "com.example.Security_login_and_registration.model")
@SpringBootApplication
public class SecurityLoginAndRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityLoginAndRegistrationApplication.class, args);
	}

}
