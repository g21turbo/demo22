package com.example.demo22;

import com.example.demo22.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController // class now serves REST endpoints
public class Demo22Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo22Application.class, args);
	}

	// REST endpoint
	@GetMapping
	public List<Student> hello() {
		return List.of(new Student(
							1L,
							"Bob",
							"Bob@gmail.com",
							LocalDate.of(1985, Month.DECEMBER, 5),
							21
		));
	}
}
