package com.enrolment.EnrolmentService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Enrolment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enrol_id;
    private Long userId;
    private Long courseId;
    private LocalDate startDate;
    public Enrolment() {
		// TODO Auto-generated constructor stub
	}
	public Long getEnrol_id() {
		return enrol_id;
	}
	public void setEnrol_id(Long enrol_id) {
		this.enrol_id = enrol_id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getCourseId() {
		return courseId;
	}
	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public Enrolment(Long enrol_id, Long userId, Long courseId, LocalDate startDate) {
		super();
		this.enrol_id = enrol_id;
		this.userId = userId;
		this.courseId = courseId;
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Enrolment [enrol_id=" + enrol_id + ", userId=" + userId + ", courseId=" + courseId + ", startDate="
				+ startDate + "]";
	}
    
}
