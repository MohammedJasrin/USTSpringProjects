package com.iist.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iist.student.Model.Teacher;



@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
