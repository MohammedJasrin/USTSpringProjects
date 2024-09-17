package com.iist.student.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.iist.student.Model.Student;
import com.iist.student.Service.StudentService;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Endpoint to get student details by ID
    @GetMapping("/{id}")
    public Optional<Student> getStudentDetails(@PathVariable Long id) {
        return studentService.getStudentDetails(id);
//                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }
}