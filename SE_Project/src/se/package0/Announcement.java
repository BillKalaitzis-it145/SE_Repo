package se.package0;

import java.io.Serializable;

public class Announcement  implements Serializable{

	private static final long serialVersionUID = 1L;
	private String Content; 
	private String Title;
	private Professor Creator; 
	private String TimeStamp;
	private Course Course;
	
	public Announcement(String Content, String Title, Professor Creator, String TimeStamp,Course Course){
		
		this.Course = Course;
		this.Content = Content;
		this.Title = Title;
		this.Creator = Creator;
		this.TimeStamp = TimeStamp;
		
	}
	
	public Course getCourse(){
		return Course;
	}

	public String getContent() {
		return Content;
	}

	public String getTitle() {
		return Title;
	}

	public Professor getCreator() {
		return Creator;
	}

	public String getTimeStamp() {
		return TimeStamp;
	}
	
	
}
