package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPasswordField;

public class ProfileFrame extends JFrame{
	
	private JPanel contentPane;
	private JLabel FirstName;
	private JLabel LastName;
	private JLabel Username;
	private JLabel Email;
	private JTextField FirstNameField;
	private JTextField LastNameField;
	private JTextField UsernameField;
	private JTextField EmailField;
	private JLabel lblPassword;
	private JLabel lblPasswordagaian;
	private JPasswordField PasswordField;
	private JPasswordField PasswordAgainField;
	private JButton SubmitChangesButton;
	private JLabel lblModifyYourProfile;
	private JLabel Warning2;
	private Student s;
	
	public ProfileFrame(Student st) {
		setVisible(true);
		setTitle("Makedonia IS - Profile");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		FirstName = new JLabel("First Name:");
		FirstName.setFont(new Font("Tahoma", Font.BOLD, 11));
		FirstName.setBounds(35, 59, 73, 14);
		contentPane.add(FirstName);
		
		LastName = new JLabel("Last Name:");
		LastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		LastName.setBounds(35, 84, 73, 14);
		contentPane.add(LastName);
		
		Username = new JLabel("Username:");
		Username.setFont(new Font("Tahoma", Font.BOLD, 11));
		Username.setBounds(35, 109, 73, 14);
		contentPane.add(Username);
		
		Email = new JLabel("Email: ");
		Email.setFont(new Font("Tahoma", Font.BOLD, 11));
		Email.setBounds(35, 134, 73, 14);
		contentPane.add(Email);
		
		lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPassword.setBounds(35, 159, 73, 14);
		contentPane.add(lblPassword);
		
		lblPasswordagaian = new JLabel("Password (again):");
		lblPasswordagaian.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPasswordagaian.setBounds(35, 184, 117, 14);
		contentPane.add(lblPasswordagaian);
		
		FirstNameField = new JTextField(st.getName());
		FirstNameField.setEditable(false);
		FirstNameField.setBounds(106, 56, 86, 20);
		contentPane.add(FirstNameField);
		FirstNameField.setColumns(10);
		
		LastNameField = new JTextField(st.getSurname());
		LastNameField.setEditable(false);
		LastNameField.setBounds(106, 81, 86, 20);
		contentPane.add(LastNameField);
		LastNameField.setColumns(10);
		
		UsernameField = new JTextField(st.getUsername());
		UsernameField.setEditable(false);
		UsernameField.setBounds(106, 106, 86, 20);
		contentPane.add(UsernameField);
		UsernameField.setColumns(10);
		
		EmailField = new JTextField(st.getEmail());
		EmailField.setEditable(false);
		EmailField.setBounds(106, 131, 116, 20);
		contentPane.add(EmailField);
		EmailField.setColumns(10);
		
		lblModifyYourProfile = new JLabel("Modify your profile");
		lblModifyYourProfile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModifyYourProfile.setBounds(175, 21, 117, 14);
		contentPane.add(lblModifyYourProfile);
		
		SubmitChangesButton = new JButton("Submit changes");
		SubmitChangesButton.setBounds(169, 221, 130, 23);
		contentPane.add(SubmitChangesButton);
		
		PasswordField = new JPasswordField(st.getPassword());
		PasswordField.setBounds(106, 156, 86, 20);
		contentPane.add(PasswordField);
		
		PasswordAgainField = new JPasswordField();
		PasswordAgainField.setBounds(162, 181, 86, 20);
		contentPane.add(PasswordAgainField);
		
		JLabel Warning1 = new JLabel("");
		Warning1.setBounds(202, 55, 230, 23);
		contentPane.add(Warning1);
		
		s = st;
		Warning2 = new JLabel("");
		Warning2.setBounds(202, 84, 230, 23);
		contentPane.add(Warning2);
		
		ButtonListener b = new ButtonListener();
		SubmitChangesButton.addActionListener(b);
	}
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			String name = FirstNameField.getText();
			String lastName = LastNameField.getText();
			String password = PasswordField.getText();
			String passwordAgain = PasswordAgainField.getText();
			
			
			if(!password.equals(s.getPassword())){ //password has been modified
				if(passwordAgain.equals(password)){
					ArrayList<Student> students = FileOperations.readStudents();
					for(Student stud:students){
						if(stud.getEmail().equals(s.getEmail())){
							stud.setPassword(password);
							new MsgFrame("Password Updated","Your password has been updated successfully.");
							dispose();
						}
					}
					FileOperations.writeStudents(students);	
				}
				else
					new MsgFrame("Warning","The provided passwords don't match");
			}
			
		}
		
	}

}
