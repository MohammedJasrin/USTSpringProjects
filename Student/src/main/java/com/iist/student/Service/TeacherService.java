package com.iist.student.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iist.student.Model.Student;
import com.iist.student.Repository.StudentRepository;
import com.iist.student.Repository.TeacherRepository;
//import java.lang.RuntimeException;


@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    @Autowired
    private StudentRepository studentRepository;

    public Student create(Long teacherId, Student student) {
        student.setTeacherId(teacherId);
        System.out.println(student);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    public Optional<Student> findStudentByName(String name) {
        return studentRepository.findByName(name);
//        		.orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Optional<Student> findStudentById(Long id) {
        return studentRepository.findById(id);
//        		.orElseThrow(() -> new RuntimeException("Student not found"));
    }

    public Student updateStudent(Long id, Student studentDetails) {
        Optional<Student> stu = studentRepository.findById(id);
        if(stu.isPresent()) {
        	Student student = stu.get();
//        		.orElseThrow(() -> new RuntimeException("Student not found"));
        student.setName(studentDetails.getName());
        student.setRollNumber(studentDetails.getRollNumber());
        student.setDateOfBirth(studentDetails.getDateOfBirth());
        student.setStudentClass(studentDetails.getStudentClass());
        student.setPendingFees(studentDetails.isPendingFees());
        student.setTeacherId(studentDetails.getTeacherId());
        student.setGrade(studentDetails.getGrade());
        }
        return studentRepository.save(stu.get());

    }

    

    public Student updateStudentGrade(Long studentId, String grade) {
        Optional<Student> student = studentRepository.findById(studentId);
//        		.orElseThrow(() -> new RuntimeException("Student not found"));
        student.get().setGrade(grade);
        return studentRepository.save(student.get());
    }
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
