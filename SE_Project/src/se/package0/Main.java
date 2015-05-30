package se.package0;

import java.io.File;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		
		ArrayList<Student> s1 = FileOperations.readStudents();
		System.out.println(s1.get(0).getUsername()+" " + s1.get(0).getPassword());
		new CoursesFrame(s1.get(0));
		
		
		/*Populate Professors.ser*/
//		
//		Professor p1 = new Professor("Alexandros","Chatzigeorgiou","achat@uom.gr",null);
//		Professor p2 = new Professor("Nikolaos","Samaras","samaras@uom.gr",null);
//		Professor p3 = new Professor("Georgios","Evaggelidis","gevan@uom.gr",null);
//		Professor p4 = new Professor("Georgios","Stephanidis","steph@uom.gr",null);
//		Professor p5 = new Professor("Ioannis","Mavridis","mavridis@uom.gr",null);
//		ArrayList<Professor> o = new ArrayList<Professor>();
//
//		o.add(p5);
//		o.add(p1);
//		o.add(p2);
//		o.add(p3);
//		o.add(p4);
//		FileOperations.writeProfessors(o);
		
		/*Populate SENotes*/
		
//		File f1 = new File("Data/SENotes.txt");
//		File f2 = new File("Data/LPNotes.txt");
//		File f3 = new File("Data/DBNotes.txt");
//		File f4 = new File("Data/AMNotes.txt");
//		File f5 = new File("Data/SECNotes.txt");
//		
//		Note SEnotes = new Note(null,f1);
//		Note LPnotes = new Note(null,f2);
//		Note DBnotes = new Note(null,f3);
//		Note AMnotes = new Note(null,f4);
//		Note SECnotes = new Note(null,f5);
//		
//		ArrayList<Note> n = new ArrayList<Note>();
//		n.add(SEnotes);
//		n.add(LPnotes);
//		n.add(DBnotes);
//		n.add(AMnotes);
//		n.add(SECnotes);
//		
//		FileOperations.writeNotes(n);
//		
		/*Populate Courses*/
		
//		ArrayList<Professor> pr = FileOperations.readProfessors();
//		ArrayList<Note> n = FileOperations.readNotes();
//		
//		Course SE = new Course("Software Engineering",pr.get(0),n.get(0),null,"No description available");
//		Course LP = new Course("Linear Programming",pr.get(1),n.get(1),null,"In this course we will solve linear problems");
//		Course DB = new Course("Databases", pr.get(2),n.get(2),null,"No description available");
//		Course AM = new Course("Applied Maths",pr.get(3),n.get(3),null,"We are going to learn mathematics!");
//		Course SC = new Course("Security",pr.get(4),n.get(4),null,"No description available");
//		
//		ArrayList<Course> c = new ArrayList<Course>();
//		c.add(SE);
//		c.add(LP);
//		c.add(DB);
//		c.add(AM);
//		c.add(SC);
//		
//		FileOperations.writeCourses(c);
		
		/*Populate Announcements*/
	
//		ArrayList<Professor> pr = FileOperations.readProfessors();
//		Announcement a1 = new Announcement("Tomorrow we won't be having a class","[Attention] Class update",pr.get(1),new Date(0).toString());
//		Announcement a2 = new Announcement("Be sure to check the updated notes","[Update]New notes",pr.get(0),new Date(0).toString());
//		
//		ArrayList<Announcement> a = new ArrayList<Announcement>();
//		a.add(a1);
//		a.add(a2);
//		FileOperations.writeAnnouncements(a);
//		
		/*Populate Students*/
//		ArrayList<Course> courses = FileOperations.readCourses();
//		HashMap<Course,Integer> map = new HashMap<Course,Integer>();
//		map.put(courses.get(3), 7);
//		map.put(courses.get(2), 5);
//		ArrayList<Course> c = new ArrayList<Course>();
//		c.add(courses.get(1));
//		c.add(courses.get(0));
//		
//		Student S1 = new Student("Bill","Kalaitzis","it145","pass","it","it145@uom.edu.gr","it145",map,c,null);
//		ArrayList<Student> s = new ArrayList<Student>();
//		s.add(S1);
//		FileOperations.writeStudents(s);


		
		
		
	}

}
