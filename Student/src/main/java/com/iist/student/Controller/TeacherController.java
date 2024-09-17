package com.iist.student.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iist.student.Model.Student;
import com.iist.student.Service.TeacherService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    // Endpoint to create a new student
    @PostMapping("/{teacherId}/students")
    public Student createStudent(@PathVariable Long teacherId, @RequestBody Student student) {
    	System.out.println(student);
        return teacherService.create(teacherId, student);
    }

    // Endpoint to delete a student by ID
    @DeleteMapping("/students/{studentId}")
    public void deleteStudent(@PathVariable Long studentId) {
        teacherService.deleteStudent(studentId);
    }

    // Endpoint to find a student by ID
    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id) {
        return teacherService.findStudentById(id);
    }

    // Endpoint to find a student by name
    @GetMapping("/students/name/{name}")
    public Optional<Student> getStudentByName(@PathVariable String name) {
        return teacherService.findStudentByName(name);
    }

    // Endpoint to update student details
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        return teacherService.updateStudent(id, studentDetails);
    }

    // Endpoint to update student grade
    @PutMapping("/students/{id}/grade")
    public Student updateStudentGrade(@PathVariable Long id, @RequestParam String grade) {
        return teacherService.updateStudentGrade(id, grade);
    }
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return teacherService.getAllStudents();
    }
}