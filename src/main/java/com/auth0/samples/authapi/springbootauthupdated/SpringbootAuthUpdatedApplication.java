package com.auth0.samples.authapi.springbootauthupdated;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringbootAuthUpdatedApplication {

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
<<<<<<< HEAD
<<<<<<< HEAD
		return new BCryptPasswordEncoder();
	}
	
=======
		return new BCryptPasswordEncoder;
	}

>>>>>>> 7238483... add ApplicationUserRepository with an on-disk DB
=======
		return new BCryptPasswordEncoder;
	}

>>>>>>> 72384839068c8198cc18fbe188e331abae1d6417
	public static void main(String[] args) {
		SpringApplication.run(SpringbootAuthUpdatedApplication.class, args);
	}
}
