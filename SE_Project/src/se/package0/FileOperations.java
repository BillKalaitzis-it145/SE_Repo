package se.package0;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public final class FileOperations {

	public static void writeProfessors(ArrayList<Professor> obj) {		
		
		try{
		FileOutputStream fos = new FileOutputStream("Data/Professors.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(obj);
		oos.close();
		System.out.println("Data saved!");
		}catch (Exception e){
			e.printStackTrace();
		}

	}
	
	public static ArrayList<Professor> readProfessors() {
		
		try{
		FileInputStream fis = new FileInputStream("Data/Professors.ser");
		ObjectInputStream ois = new ObjectInputStream (fis);
		ArrayList<Professor> pr = (ArrayList<Professor>) ois.readObject();
		ois.close();
		return pr;
	
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void writeNotes(ArrayList<Note> obj) {		
		
		try{
		FileOutputStream fos = new FileOutputStream("Data/Notes.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(obj);
		oos.close();
		System.out.println("Data saved!");
		}catch (Exception e){
			e.printStackTrace();
		}

	}
	
	public static ArrayList<Note> readNotes() {
		
		try{
		FileInputStream fis = new FileInputStream("Data/Notes.ser");
		ObjectInputStream ois = new ObjectInputStream (fis);
		ArrayList<Note> pr = (ArrayList<Note>) ois.readObject();
		ois.close();
		return pr;
	
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void writeCourses(ArrayList<Course> obj) {		
	
		try{
		FileOutputStream fos = new FileOutputStream("Data/Courses.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(obj);
		oos.close();
		System.out.println("Data saved!");
		}catch (Exception e){
			e.printStackTrace();
		}

	}

	public static ArrayList<Course> readCourses() {
	
	try{
	FileInputStream fis = new FileInputStream("Data/Courses.ser");
	ObjectInputStream ois = new ObjectInputStream (fis);
	ArrayList<Course> pr = (ArrayList<Course>) ois.readObject();
	ois.close();
	return pr;

	}catch(Exception e){
		e.printStackTrace();
	}
	return null;
	
	}
	
	public static void writeAnnouncements(ArrayList<Announcement> obj) {		
		
		try{
		FileOutputStream fos = new FileOutputStream("Data/Announcements.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(obj);
		oos.close();
		System.out.println("Data saved!");
		}catch (Exception e){
			e.printStackTrace();
		}

	}
	
	public static ArrayList<Announcement> readAnnouncements() {
		
	try{
	FileInputStream fis = new FileInputStream("Data/Announcements.ser");
	ObjectInputStream ois = new ObjectInputStream (fis);
	ArrayList<Announcement> pr = (ArrayList<Announcement>) ois.readObject();
	ois.close();
	return pr;

	}catch(Exception e){
		e.printStackTrace();
	}
	return null;
	
	}
	
	public static void writeEmails(ArrayList<Mail> obj) {		
//		
		ArrayList<Mail> em = FileOperations.readEmails();
		em.addAll(obj);
//		
		try{
		FileOutputStream fos = new FileOutputStream("Data/Emails.ser",false);
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(em);
		oos.close();
		System.out.println("Data saved!");
		}catch (Exception e){
			e.printStackTrace();
		}

	}
	
	public static ArrayList<Mail> readEmails() {
		
		try{
		FileInputStream fis = new FileInputStream("Data/Emails.ser");
		ObjectInputStream ois = new ObjectInputStream (fis);
		ArrayList<Mail> pr = (ArrayList<Mail>) ois.readObject();
		ois.close();
		return pr;

		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
		}
	
	public static void writeStudents(ArrayList<Student> obj) {		
		
		try{
		FileOutputStream fos = new FileOutputStream("Data/Students.ser");
		ObjectOutputStream oos = new ObjectOutputStream (fos);
		oos.writeObject(obj);
		oos.close();
		System.out.println("Data saved!");
		}catch (Exception e){
			e.printStackTrace();
		}

	}
	
	public static ArrayList<Student> readStudents() {
		
		try{
			FileInputStream fis = new FileInputStream("Data/Students.ser");
			ObjectInputStream ois = new ObjectInputStream (fis);
			ArrayList<Student> pr = (ArrayList<Student>) ois.readObject();
			ois.close();
			return pr;

			}catch(Exception e){
				e.printStackTrace();
			}
			return null;
		
	}
		
}
