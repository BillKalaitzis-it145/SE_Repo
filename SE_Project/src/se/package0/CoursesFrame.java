package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Font;


public class CoursesFrame extends JFrame{

	private JPanel contentPane;
	private JLabel AvailableActions;
	private JList CoursesJList;
	private JList AAList;
	private JButton RegisterButton;
	private JButton CAButton;
	private JLabel ArrowIcon;
	private JList RCList;


	public CoursesFrame() {
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
		
		CoursesJList = new JList();
		CoursesJList.setBounds(27, 51, 116, 157);
		contentPane.add(CoursesJList);
		
		AvailableActions = new JLabel("Available Actions");
		AvailableActions.setBounds(265, 27, 116, 14);
		contentPane.add(AvailableActions);
		
		RCList = new JList();
		RCList.setBounds(255, 51, 1, 1);
		contentPane.add(RCList);
		
		AAList = new JList();
		AAList.setBounds(255, 51, 116, 157);
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
	}
	
}
