package com.example.demo.student;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class StudentService {
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
