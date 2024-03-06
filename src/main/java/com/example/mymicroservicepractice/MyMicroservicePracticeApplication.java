package com.example.mymicroservicepractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class MyMicroservicePracticeApplication {

	public static void main(String[] args) {
//		JdbcTemplate jdbcTemplate= new JdbcTemplate();
//		jdbcTemplate.execute("select * from employee");
		SpringApplication.run(MyMicroservicePracticeApplication.class, args);
	}

}
