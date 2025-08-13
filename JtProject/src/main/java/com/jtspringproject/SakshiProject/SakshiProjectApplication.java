package com.jtspringproject.SakshiProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class SakshiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SakshiProjectApplication.class, args);
	}

}
