package com.cameron.springdemo.student;

import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/v1/students")

public class StudentController {
    
    private StudentService service;

    
    
    public StudentController(StudentService service) {
        this.service = service;
    }



    @GetMapping()
    public List<Student> findAllStudents() {
        return service.findAllStudents();
    }
}