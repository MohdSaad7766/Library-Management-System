package com.s.d.Library_Management_System.controller;

import com.s.d.Library_Management_System.model.Student;
import com.s.d.Library_Management_System.requestdto.StudentDto;
import com.s.d.Library_Management_System.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<Student> addStudent(@RequestBody StudentDto studentDto){
        Student student = studentService.addStudent(studentDto);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }
}
