package se.package0;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class ContactProfessorFrame extends JFrame {

	private JPanel contentPane;
	private JTextField ToField;
	private JTextField TitleField;
	private JButton SendButton;
	private JTextArea BodyArea;
	private Student s;
	private Course course;
	
	public ContactProfessorFrame(Student st,Course c) {
		setVisible(true);
		setTitle("Makedonia IS - Contact Professor");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTo = new JLabel("To:");
		lblTo.setBounds(112, 11, 46, 14);
		contentPane.add(lblTo);
		
		ToField = new JTextField(c.getTeacher().getEmail());
		ToField.setEditable(false);
		ToField.setBounds(148, 8, 168, 20);
		contentPane.add(ToField);
		ToField.setColumns(10);
		
		JLabel lblTitle = new JLabel("Title: ");
		lblTitle.setBounds(60, 49, 46, 14);
		contentPane.add(lblTitle);
		
		TitleField = new JTextField("["+c.getName()+"]");
		TitleField.setBounds(92, 46, 340, 20);
		contentPane.add(TitleField);
		TitleField.setColumns(10);
		
		BodyArea = new JTextArea();
		JScrollPane sp = new JScrollPane(BodyArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(38, 104, 359, 113);
		contentPane.add(sp);
		
		SendButton = new JButton("Send");
		SendButton.setBounds(181, 228, 89, 23);
		contentPane.add(SendButton);
		
		JLabel lblMainBody = new JLabel("Main Body");
		lblMainBody.setBounds(181, 77, 89, 14);
		contentPane.add(lblMainBody);
		
		st = s;
		course = c;
		
		ButtonListener b = new ButtonListener();
		SendButton.addActionListener(b);
		
	}
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			
			Mail mail = new Mail(s.getEmail(),course.getTeacher().getEmail(),TitleField.getText(),BodyArea.getText());
			ArrayList<Mail> m = new ArrayList<Mail>();
			m.add(mail);
			FileOperations.writeEmails(m);
			
		}
		
	}
}
