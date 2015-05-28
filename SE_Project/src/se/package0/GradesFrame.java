package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;

public class GradesFrame extends JFrame{

	private JPanel contentPane;
	private JList PassedCoursesList;
	private JLabel PassedCourses;
	private JLabel Passed;
	private JLabel PassedLabel;
	private JLabel GPA;

	public GradesFrame() {
		setVisible(true);
		setTitle("Makedonia IS - Grades");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PassedCoursesList = new JList();
		PassedCoursesList.setBounds(23, 39, 155, 185);
		contentPane.add(PassedCoursesList);
		
		PassedCourses = new JLabel("Passed Courses");
		PassedCourses.setBounds(63, 14, 76, 14);
		contentPane.add(PassedCourses);
		
		Passed = new JLabel("Passed: ");
		Passed.setFont(new Font("Tahoma", Font.BOLD, 11));
		Passed.setBounds(213, 69, 46, 14);
		contentPane.add(Passed);
		
		PassedLabel = new JLabel("add count");
		PassedLabel.setBounds(272, 69, 60, 14);
		contentPane.add(PassedLabel);
		
		GPA = new JLabel("GPA: ");
		GPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		GPA.setBounds(213, 95, 46, 14);
		contentPane.add(GPA);
		
		JLabel GPALabel = new JLabel("add GPA");
		GPALabel.setBounds(249, 94, 46, 14);
		contentPane.add(GPALabel);
		
		JLabel lblRemaining = new JLabel("Remaining:");
		lblRemaining.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRemaining.setBounds(213, 120, 70, 14);
		contentPane.add(lblRemaining);
		
		JLabel RemainingLabel = new JLabel("add rem");
		RemainingLabel.setBounds(286, 120, 46, 14);
		contentPane.add(RemainingLabel);
	}
	
}
