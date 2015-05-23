package se.package0;

import java.util.ArrayList;
import java.util.HashMap;

public class PostGraduate extends Student{
	
	private Professor Supervisor;
	
	public PostGraduate(String Name, String Surname, String Username, String Password, String Dept, 
			   String Email, String ID,HashMap<Course,Integer> PassedCourses, 
			   ArrayList<Course> RegisteredCourses, ArrayList<Request> Requests, Professor Supervisor){
		
		super(Name,Surname,Username,Password,Dept,Email,ID,PassedCourses,RegisteredCourses,Requests);
		this.Supervisor = Supervisor;
		
	}

}
