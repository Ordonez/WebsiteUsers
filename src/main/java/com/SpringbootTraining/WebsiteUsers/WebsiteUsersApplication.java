package com.SpringbootTraining.WebsiteUsers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EnableJpaRepositories(basePackages = "com.SpringbootTraining.WebsiteUsers.repository") //specifying the packages to scan for annotated components
@SpringBootApplication
public class WebsiteUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteUsersApplication.class, args);
	}

}
