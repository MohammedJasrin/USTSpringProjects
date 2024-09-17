package com.course.CourseService.Model;

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
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Course_id;
    private String title;
    private String description;
    private String duration;
    private Long module;
	/*
	 * public Long getCourse_id() { return Course_id; }
	 * 
	 * public long getModule() { return module; }
	 * 
	 * public void setModule(long module) { this.module = module; }
	 * 
	 * public void setCourse_id(Long course_id) { Course_id = course_id; } public
	 * String getTitle() { return title; } public void setTitle(String title) {
	 * this.title = title; } public String getDescription() { return description; }
	 * public void setDescription(String description) { this.description =
	 * description; } public String getDuration() { return duration; } public void
	 * setDuration(String duration) { this.duration = duration; }
	 * 
	 * @Override public String toString() { return "Course [Course_id=" + Course_id
	 * + ", title=" + title + ", description=" + description + ", duration=" +
	 * duration + ", model=" + module + "]"; }
	 * 
	 * 
	 * public Course(Long course_id, String title, String description, String
	 * duration, Long module) { super(); Course_id = course_id; this.title = title;
	 * this.description = description; this.duration = duration; this.module =
	 * module; }
	 * 
	 * public Course() { // TODO Auto-generated constructor stub }
	 */
}
