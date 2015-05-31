package se.package0;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JButton;

public class RegisterForCourseFrame extends JFrame {

	private JPanel contentPane;
	private JList CourseList;
	private JButton CourseInfoButton;
	private JButton btnRegister;
	private Student s;
	
	public RegisterForCourseFrame(Student st) {
		setVisible(true);
		setTitle("Makedonia IS - Register");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 317, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		DefaultListModel model = new DefaultListModel();
		ArrayList<Course> course = FileOperations.readCourses();
		for(Course c:course){
			if(!st.getRegisteredCourses().contains(c))
				model.addElement(c.getName());
		}
		
		CourseList = new JList(model);
		CourseList.setBounds(69, 48, 159, 175);
		contentPane.add(CourseList);
		
		JLabel lblAvailableCourses = new JLabel("Available Courses");
		lblAvailableCourses.setBounds(106, 23, 109, 14);
		contentPane.add(lblAvailableCourses);
		
		btnRegister = new JButton("Register");
		btnRegister.setBounds(189, 234, 89, 23);
		contentPane.add(btnRegister);
		
		CourseInfoButton = new JButton("Course Info");
		CourseInfoButton.setBounds(28, 234, 100, 23);
		contentPane.add(CourseInfoButton);
		
		s = st;
		 
		ButtonListener b = new ButtonListener();
		CourseInfoButton.addActionListener(b);
		btnRegister.addActionListener(b);
	}

	class ButtonListener implements ActionListener{
		String courseName;
		Course currCourse ;
		public void actionPerformed(ActionEvent e) {
			courseName = (String) CourseList.getSelectedValue();
			ArrayList<Course> course = FileOperations.readCourses();
			for(Course c:course){
				if(courseName.equals(c.getName()))
					currCourse = c;
			}
			if(e.getSource() == btnRegister){
				ArrayList<Course> courses;
				ArrayList<Student> students = FileOperations.readStudents();
				for(Student stud:students){
					if(stud.getEmail().equals(s.getEmail())){
						courses = stud.getRegisteredCourses();
						courses.add(currCourse);
						stud.setRegisteredCourses(courses);
						System.out.println(stud.getRegisteredCourses().size());
					}
				}
				FileOperations.writeStudents(students);				
			}
			else{
				if(!(courseName == null))
					new MsgFrame("Course Info",currCourse.getAdditionalInfo());
				else
					new MsgFrame("Warning","Please select a course to view its' additional info");
				
			}
				
		}
		
	}
}
