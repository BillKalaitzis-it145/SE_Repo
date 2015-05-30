package se.package0;

import java.io.Serializable;

public class Request  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private String Type; 
	private String Comments; 
	private Student Sender;
	
	public Request(String Type, String Comments, Student Sender){
		
		this.Type = Type; 
		this.Comments = Comments;
		this.Sender = Sender;
		
	}
	

}
