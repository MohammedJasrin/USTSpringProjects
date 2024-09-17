package com.iist.student.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iist.student.Model.Student;
	
	@Repository
	public interface StudentRepository extends JpaRepository<Student, Long> {
		Optional<Student> findByName(String name);
	}


