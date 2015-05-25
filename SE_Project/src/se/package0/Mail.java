package se.package0;

import java.io.Serializable;

public class Mail  implements Serializable{

	private String Smail; 
	private String Rmail; 
	private String Title; 
	private String Contents;
	
	public Mail (String Smail, String Rmail, String Title, String Contents) {
		
		this.Smail = Smail;
		this.Rmail = Rmail;
		this.Title = Title;
		this.Contents = Contents;
		
	}
	
}
