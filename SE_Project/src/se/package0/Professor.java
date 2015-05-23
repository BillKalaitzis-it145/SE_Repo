package se.package0;

import java.util.ArrayList;

public class Professor {
	
	private String Name;
	private String Surname; 
	private String Email; 
	private ArrayList<Course> TeachingCourses;
	
	public Professor(String Name, String Surname, String Email, ArrayList<Course> TeachingCourses) {
		
		this.Name = Name;
		this.Surname = Surname; 
		this.Email = Email;
		this.TeachingCourses = TeachingCourses;
		
	}	
	
	public String getEmail() {
		
		return this.Email;
		
	}

}

