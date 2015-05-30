package se.package0;

import java.io.File;
import java.io.Serializable;

public class Note  implements Serializable {

	private static final long serialVersionUID = 1L;
	private Course OwnerCourse;
	private File Data;
	
	public Note (Course OwnerCourse, File Data) {
		
		this.OwnerCourse = OwnerCourse;
		this.Data = Data;
		
	}
	
	public String getAbsPath() {
		
		return Data.getAbsolutePath();
		
	}
	
}
