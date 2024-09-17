package com.feedback.FeedbackService.Model;

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
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;
    private Long userId;
    private Long courseId;
    private String description;
    private Integer rating;
    public Feedback() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", userId=" + userId + ", courseId=" + courseId + ", description="
				+ description + ", rating=" + rating + "]";
	}
	public Feedback(Long feedbackId, Long userId, Long courseId, String description, Integer rating) {
		super();
		this.feedbackId = feedbackId;
		this.userId = userId;
		this.courseId = courseId;
		this.description = description;
		this.rating = rating;
	}
	public Long getFeedbackId() {
		return feedbackId;
	}
	public void setFeedbackId(Long feedbackId) {
		this.feedbackId = feedbackId;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
    
}
