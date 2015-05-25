package se.package0;

import java.io.Serializable;

public class Announcement  implements Serializable{

	private String Content; 
	private String Title;
	private Professor Creator; 
	private String TimeStamp;
	
	public Announcement(String Content, String Title, Professor Creator, String TimeStamp){
		
		this.Content = Content;
		this.Title = Title;
		this.Creator = Creator;
		this.TimeStamp = TimeStamp;
		
	}
	
}
