package com.example.demo;

import java.time.Month;
import java.util.List;
import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.student.Student;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
				// new Student()
				new Student(
						// id:1L, name:"Mariam", email:"mariam.jamal@gmail.com", dob:
						// LocalDate.of(year:2000, Month.JANUARY, dayOfMonth:5), age:21

						1L,
						"Mariam",
						"mariam.jamal@gmail.com",
						LocalDate.of(2000, Month.JANUARY, 5),
						21));
	}

}
