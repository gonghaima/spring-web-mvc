package com.example.demo.student;

import java.time.Month;
import java.util.List;
import java.time.LocalDate;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> geStudents() {
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