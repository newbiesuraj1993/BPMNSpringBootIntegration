package com.infy.activitinew;

import javax.sql.DataSource;

import org.activiti.engine.HistoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan
public class Activiti7Application {

	public static void main(String[] args) {
		SpringApplication.run(Activiti7Application.class, args);
	}
	@Bean
	public DataSource database() {
	    return DataSourceBuilder.create()
	        .url("jdbc:mysql://localhost:3306/activitiseven?verifyServerCertificate=false&useSSL=false&requireSSL=false&allowPublicKeyRetrieval=true")
	        .username("root")
	        .password("root")
	        .driverClassName("com.mysql.jdbc.Driver")
	        .build();
	}
	

	 
}
