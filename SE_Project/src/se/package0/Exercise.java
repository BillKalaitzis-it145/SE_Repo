package se.package0;

import java.io.File;

public class Exercise {

	private Course OwnerCourse;
	private File Data;
	
	public Exercise(Course OwnerCourse, File Data) {
		
		this.OwnerCourse = OwnerCourse;
		this.Data = Data;
		
	}
	
	public String getAbsPath(){
		
		return Data.getAbsolutePath();
		
	}
	
}
