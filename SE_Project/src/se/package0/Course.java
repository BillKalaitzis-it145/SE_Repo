package se.package0;

import java.io.Serializable;

public class Course  implements Serializable {
	
	private String Name;
	private Professor Teacher;
	private Note CourseNotes;
	private Exercise CourseExercises;
	private String AdditionalInfo;
	
	public Course(String Name, Professor Teacher, Note CourseNotes, Exercise CourseExercises, String AdditionalInfo){
		
		this.Name = Name;
		this.Teacher = Teacher;
		this.CourseNotes = CourseNotes;
		this.CourseExercises = CourseExercises;
		this.AdditionalInfo = AdditionalInfo;
		
	}
	
	public Note getCourseNotes() {
		
		return CourseNotes;
		
	}
	
	public Exercise getCourseExercises() {
		
		return CourseExercises;
		
	}

}
