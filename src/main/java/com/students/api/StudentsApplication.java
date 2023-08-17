package com.students.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@RestController
public class StudentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsApplication.class, args);
	}
//	@GetMapping
//	public List<Student> hello (){
//		return List.of(
//				new Student(
//						1L,
//						"Sara",
//						"sara@gmail.com",
//						LocalDate.of(2000, Month.JULY, 9),
//						23
//
//				)
//		);
//	}
}
