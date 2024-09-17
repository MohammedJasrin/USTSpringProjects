package com.iist.student.Model;
import jakarta.persistence.*;

import jakarta.persistence.Entity;

@Entity
@Table(name = "teachers")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String subject;

    public Teacher() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}

	public Teacher(Long id, String name, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
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

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
    
}
