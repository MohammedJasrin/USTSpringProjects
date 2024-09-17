package com.iist.student.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

import jakarta.persistence.Entity;

@Entity
@Table(name = "students")

public class Student {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String rollNumber;
    private LocalDate dateOfBirth;
    private String studentClass;
    private boolean pendingFees;
    private String grade;
    private Long teacherId; 

	public Student(Long id, String name, String rollNumber, LocalDate dateOfBirth, String studentClass,
			boolean pendingFees, Long teacherId,String grade) {
		super();
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
		this.dateOfBirth = dateOfBirth;
		this.studentClass = studentClass;
		this.pendingFees = pendingFees;
		this.teacherId = teacherId;
		this.grade=grade;
	}
public Student() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + ", dateOfBirth=" + dateOfBirth
			+ ", studentClass=" + studentClass + ", pendingFees=" + pendingFees + ", grade=" + grade + ", teacherId="
			+ teacherId + "]";
}

public String getGrade() {
	return grade;
}
public void setGrade(String grade) {
	this.grade = grade;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRollNumber() {
	return rollNumber;
}
public void setRollNumber(String rollNumber) {
	this.rollNumber = rollNumber;
}
public LocalDate getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getStudentClass() {
	return studentClass;
}
public void setStudentClass(String studentClass) {
	this.studentClass = studentClass;
}
public boolean isPendingFees() {
	return pendingFees;
}
public void setPendingFees(boolean pendingFees) {
	this.pendingFees = pendingFees;
}
public Long getTeacherId() {
	return teacherId;
}
public void setTeacherId(Long teacherId) {
	this.teacherId = teacherId;
}

    
}
	


