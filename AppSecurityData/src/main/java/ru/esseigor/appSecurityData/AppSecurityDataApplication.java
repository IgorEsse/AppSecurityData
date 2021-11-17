package ru.esseigor.appSecurityData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("ru.esseigor.appSecurityData.repo") 
@EntityScan("ru.esseigor.appSecurityData.model")
//@ComponentScan ("ru.esseigor.persistence.repo")
@SpringBootApplication
public class AppSecurityDataApplication {

	public static void main(String[] args) throws Throwable {
		SpringApplication.run(AppSecurityDataApplication.class, args);
	}

}
