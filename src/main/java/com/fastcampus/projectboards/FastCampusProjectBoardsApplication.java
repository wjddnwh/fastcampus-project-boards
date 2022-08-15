package com.fastcampus.projectboards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastCampusProjectBoardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastCampusProjectBoardsApplication.class, args);
	}

}
