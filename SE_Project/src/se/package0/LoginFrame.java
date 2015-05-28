package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class LoginFrame extends JFrame{
	private JPanel contentPane;
	private JLabel WelcomeMSG;
	private JLabel MakIcon;
	private JLabel Username;
	private JLabel Password;
	private JTextField UsernameField;
	private JPasswordField PasswordField;
	private JButton SignInButton;
	private JLabel SignupLabel;
	private JButton SignUpButton;

	public LoginFrame() {
		setVisible(true);
		setTitle("Makedonia IS - Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		WelcomeMSG = new JLabel("Welcome to the Information System of the university of Makedonia!");
		WelcomeMSG.setFont(new Font("Tahoma", Font.PLAIN, 13));
		WelcomeMSG.setBounds(25, 58, 396, 14);
		contentPane.add(WelcomeMSG);
		
		MakIcon = new JLabel("IconHere");
		MakIcon.setBounds(190, 11, 46, 14);
		contentPane.add(MakIcon);
		
		Username = new JLabel("Username:");
		Username.setFont(new Font("Tahoma", Font.BOLD, 12));
		Username.setBounds(82, 121, 80, 14);
		contentPane.add(Username);
		
		Password = new JLabel("Password:");
		Password.setFont(new Font("Tahoma", Font.BOLD, 12));
		Password.setBounds(82, 146, 80, 14);
		contentPane.add(Password);
		
		UsernameField = new JTextField();
		UsernameField.setBounds(162, 119, 129, 20);
		contentPane.add(UsernameField);
		UsernameField.setColumns(10);
		
		SignInButton = new JButton("Sign In");
		SignInButton.setBounds(172, 177, 89, 23);
		contentPane.add(SignInButton);
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(162, 144, 129, 20);
		contentPane.add(PasswordField);
		
		SignupLabel = new JLabel("Not a member yet? ");
		SignupLabel.setBounds(245, 241, 119, 14);
		contentPane.add(SignupLabel);
		
		SignUpButton = new JButton("Sign Up");
		SignUpButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		SignUpButton.setBounds(356, 238, 65, 20);
		contentPane.add(SignUpButton);
	}

}
