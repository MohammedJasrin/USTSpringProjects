package com.iist.student.Service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iist.student.Model.Student;
import com.iist.student.Repository.StudentRepository;

import java.util.Optional;
@Service
public class StudentService {
	@Autowired
    private StudentRepository studentRepository1;

    public Optional<Student> getStudentDetails(Long id) {
        return studentRepository1.findById(id);
    }
}


