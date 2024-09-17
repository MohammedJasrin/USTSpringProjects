package com.progress.ProgressService.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Progress {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long progressId;
    private Long userId;
    private Long courseId;
    private String status;
    public Progress() {
		// TODO Auto-generated constructor stub
	}
	public Long getProgressId() {
		return progressId;
	}
	public void setProgressId(Long progressId) {
		this.progressId = progressId;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Progress [progressId=" + progressId + ", userId=" + userId + ", courseId=" + courseId + ", status="
				+ status + "]";
	}
	public Progress(Long progressId, Long userId, Long courseId, String status) {
		super();
		this.progressId = progressId;
		this.userId = userId;
		this.courseId = courseId;
		this.status = status;
	}
    
}
