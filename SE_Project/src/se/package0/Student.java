package se.package0;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;

public class Student implements Serializable{
	
	protected String Name;
	protected String Surname;
	protected String Username;
	protected String Password;
	protected String Dept;
	protected String Email;
	protected String ID;
	protected HashMap<Course, Integer> PassedCourses;
	protected ArrayList<Course> RegisteredCourses;
	protected ArrayList<Request> Requests;
	
	public Student(String Name, String Surname, String Username, String Password, String Dept, 
				   String Email, String ID,HashMap<Course,Integer> PassedCourses, 
				   ArrayList<Course> RegisteredCourses, ArrayList<Request> Requests) {
		
		this.Name = Name;
		this.Surname = Surname;
		this.Password = Password;
		this.Dept = Dept;
		this.Email = Email;
		this.ID = ID;
		this.PassedCourses = PassedCourses;
		this.RegisteredCourses = RegisteredCourses;
		this.Requests = Requests;
		
		
	}
	
	
	
	public void registerToCourse(Course course) {
		
		RegisteredCourses.add(course);
		//todo: save changes
	}
	
	public void unregisterFromCourse(Course course) {
		
		if(RegisteredCourses.contains(course)) {
			RegisteredCourses.remove(course);
		}
		else
			System.out.println("Error: Student isn't registered to the selected course.");
		//todo: save changes
		
	}
	
	public void sendMail(Professor professor, String content, String title) {
		
		Mail mail = new Mail(this.Email,professor.getEmail(),content,title);
		//todo: save mail 
		
	}
	
	
	public void modifyProfile(String Name,String Surname, String Password) {
		
		this.Name = Name;
		this.Surname = Surname;
		this.Password = Password;
		//todo: save changes
		
	}
	
	public void downloadContent(Course course, int choice,File targetDir) {
		
		File original;
		
		if(choice == 0)//: if Download Exercises button is pressed
			 original = new File(course.getCourseExercises().getAbsPath());
		else //: if Download Notes button is pressed
			original = new File(course.getCourseNotes().getAbsPath());
		
		try{
			FileUtils.copyDirectory(original, targetDir);
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}



	public String getName() {
		return Name;
	}



	public String getSurname() {
		return Surname;
	}



	public String getUsername() {
		return Username;
	}



	public String getPassword() {
		return Password;
	}



	public String getDept() {
		return Dept;
	}



	public String getEmail() {
		return Email;
	}



	public String getID() {
		return ID;
	}



	public HashMap<Course, Integer> getPassedCourses() {
		return PassedCourses;
	}



	public ArrayList<Course> getRegisteredCourses() {
		return RegisteredCourses;
	}



	public ArrayList<Request> getRequests() {
		return Requests;
	}
	
	

}
