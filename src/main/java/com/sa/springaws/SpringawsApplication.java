package com.sa.springaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//@EnableJpaAuditing
@SpringBootApplication
public class SpringawsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringawsApplication.class, args);
	}

}
