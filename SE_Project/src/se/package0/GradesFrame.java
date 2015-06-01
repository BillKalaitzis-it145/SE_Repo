package se.package0;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.html.HTMLDocument.Iterator;
import javax.swing.JList;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GradesFrame extends JFrame{

	private JPanel contentPane;
	private JList PassedCoursesList;
	private JLabel PassedCourses;
	private JLabel Passed;
	private JLabel PassedLabel;
	private JLabel GPA;

	public GradesFrame(Student st) {
		
		setVisible(true);
		setTitle("Makedonia IS - Grades");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 350, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<String> info = new ArrayList<String>();
		int sum = 0;
		for(Map.Entry<Course, Integer> e:st.getPassedCourses().entrySet()){
			info.add(e.getKey().getName()+" - "+e.getValue());
			sum += e.getValue();
		}
		DefaultListModel model = new DefaultListModel();
		for(String s:info)
			model.addElement(s);
		
		PassedCoursesList = new JList(model);
		JScrollPane scroll = new JScrollPane(PassedCoursesList,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scroll.setBounds(23, 39, 155, 185);
		contentPane.add(scroll);
		
		PassedCourses = new JLabel("Passed Courses");
		PassedCourses.setBounds(53, 14, 96, 14);
		contentPane.add(PassedCourses);
		
		Passed = new JLabel("Passed: ");
		Passed.setFont(new Font("Tahoma", Font.BOLD, 11));
		Passed.setBounds(213, 69, 46, 14);
		contentPane.add(Passed);
		
		PassedLabel = new JLabel(Integer.toString(info.size()));
		PassedLabel.setBounds(272, 69, 60, 14);
		contentPane.add(PassedLabel);
		
		GPA = new JLabel("GPA: ");
		GPA.setFont(new Font("Tahoma", Font.BOLD, 11));
		GPA.setBounds(213, 95, 46, 14);
		contentPane.add(GPA);
		
		double GPA = 0;
		int count = info.size();
		int remaining = 52 - count;
		if(count != 0)
			GPA = sum/count;
		else
			GPA = 0;
			
		JLabel GPALabel = new JLabel(Double.toString(GPA));
		GPALabel.setBounds(249, 94, 46, 14);
		contentPane.add(GPALabel);
		
		JLabel lblRemaining = new JLabel("Remaining: ");
		lblRemaining.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRemaining.setBounds(213, 120, 70, 14);
		contentPane.add(lblRemaining);
		
		JLabel RemainingLabel = new JLabel(Integer.toString(remaining));
		RemainingLabel.setBounds(286, 120, 46, 14);
		contentPane.add(RemainingLabel);
	}
	
}
