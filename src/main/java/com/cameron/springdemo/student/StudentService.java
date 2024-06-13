package com.cameron.springdemo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
    return List.of(new Student(
            "Steve",
            "Bob",
            LocalDate.now(),
            "test@test.org",
            23),

            new Student(
            "Stu",
            "Johnson",
            LocalDate.now(),
            "stu@test.org",
            23));

    }

}
