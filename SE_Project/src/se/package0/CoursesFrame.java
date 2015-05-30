package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class CoursesFrame extends JFrame{

	private JPanel contentPane;
	private JLabel AvailableActions;
	private JList CoursesJList;
	private JList AAList;
	private JButton RegisterButton;
	private JButton CAButton;
	private JLabel ArrowIcon;
	private JList RCList;
	private Student s;


	public CoursesFrame(Student st) {
		setVisible(true);
		setTitle("Makedonia IS - Courses");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 416, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel RegisteredCourses = new JLabel("Registered Courses");
		RegisteredCourses.setBounds(29, 27, 123, 14);
		contentPane.add(RegisteredCourses);
		
		ArrayList<Course> courses = st.getRegisteredCourses();
		DefaultListModel model = new DefaultListModel();
		for(Course c:courses)
			model.addElement(c.getName());
		
		CoursesJList = new JList(model);
		CoursesJList.setBounds(27, 51, 136, 157);
		contentPane.add(CoursesJList);
		
		AvailableActions = new JLabel("Available Actions");
		AvailableActions.setBounds(265, 27, 116, 14);
		contentPane.add(AvailableActions);
		
//		RCList = new JList();
//		RCList.setBounds(255, 51, 1, 1);
//		contentPane.add(RCList);
		
		DefaultListModel model2 = new DefaultListModel();
		model2.addElement("Download Notes");
		model2.addElement("Download Exercises");
		model2.addElement("Course info");
		model2.addElement("Contant Professor");
		model2.addElement("Unregister from course");
		
		AAList = new JList(model2);
		AAList.setBounds(245, 51, 136, 157);
		contentPane.add(AAList);
		
		RegisterButton = new JButton("Register for course");
		RegisterButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		RegisterButton.setBounds(15, 232, 143, 23);
		contentPane.add(RegisterButton);
		
		CAButton = new JButton("Complete Action");
		CAButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CAButton.setBounds(250, 232, 126, 23);
		contentPane.add(CAButton);
		
		ArrowIcon = new JLabel("ArrowIcon");
		ArrowIcon.setBounds(172, 116, 46, 14);
		contentPane.add(ArrowIcon);
		
		s = st;
		
		ButtonListener b = new ButtonListener();
		CAButton.addActionListener(b);
		RegisterButton.addActionListener(b);
	}
	
	class ButtonListener implements ActionListener {

		String courseName;
		String action;
		Course currCourse;
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == CAButton){
				courseName = (String) CoursesJList.getSelectedValue(); 
				action = (String) AAList.getSelectedValue();
				if(!(courseName == null) && !(action == null)){
					currCourse = identifyCourse(courseName);
					System.out.println(currCourse.getAdditionalInfo());
					
					if (action.equals("Download Notes")) {
						;//add window to select path to save notes
					}
					else if(action.equals("Download Exercises")){
						;//same as above
					}
					else if(action.equals("Contact Professor")){
						;//todo: create ContactProfessorFrame class
						//new ContanctProfessorFrame(s,currCourse);
					}
					else if(action.equals("Unregister From Course")){
						;
//						unregisterFromCourse(s,currCourse);
					}
					else
						new MsgFrame("Course Info",currCourse.getAdditionalInfo());
				}
				else
					new MsgFrame("Warning","Please select both a course and an action.");
			}
			else ;
				//todo: create  RegisterToCoursesFrame();
			
		}
		
	}
	
	public Course identifyCourse(String name){
		
		ArrayList<Course> course = FileOperations.readCourses();
		for(Course c:course){
			if(c.getName().equals(name))
				return c;
		}
		return null;
	}
	
	public void unregisterFromCourse(Student st, Course c){
		Student s1 = st;
//		s1.setRegisteredCourses(); = s1.getRegisteredCourses().remove(c);
	}
}
