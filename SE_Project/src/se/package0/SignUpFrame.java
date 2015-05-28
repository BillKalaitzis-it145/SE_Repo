package se.package0;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JButton;


public class SignUpFrame extends JFrame{

	private JPanel contentPane;
	private JLabel Info;
	private JLabel FirstName;
	private JLabel LastName;
	private JLabel Passwordagain;
	private JLabel Email;
	private JLabel Password;
	private JLabel Username;
	private JTextField FirstNameField;
	private JTextField LastNameField;
	private JTextField UsernameField;
	private JTextField EmailField;
	private JPasswordField PasswordField;
	private JPasswordField PasswordAgainField;
	private JCheckBox TickBox;
	private JButton SignUpButton;

	public SignUpFrame() {
		setVisible(true);
		setTitle("Makedonia IS - Sign Up");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Info = new JLabel("Please fill all the fields");
		Info.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Info.setBounds(152, 11, 134, 14);
		contentPane.add(Info);
		
		FirstName = new JLabel("First Name:");
		FirstName.setFont(new Font("Tahoma", Font.BOLD, 12));
		FirstName.setBounds(69, 53, 80, 14);
		contentPane.add(FirstName);
		
		LastName = new JLabel("Last Name:");
		LastName.setFont(new Font("Tahoma", Font.BOLD, 11));
		LastName.setBounds(69, 79, 80, 14);
		contentPane.add(LastName);
		
		Username = new JLabel("Username:");
		Username.setFont(new Font("Tahoma", Font.BOLD, 12));
		Username.setBounds(69, 104, 80, 14);
		contentPane.add(Username);
		
		Password = new JLabel("Password:");
		Password.setFont(new Font("Tahoma", Font.BOLD, 12));
		Password.setBounds(69, 155, 80, 14);
		contentPane.add(Password);
		
		Email = new JLabel("Email:");
		Email.setFont(new Font("Tahoma", Font.BOLD, 12));
		Email.setBounds(69, 130, 80, 14);
		contentPane.add(Email);
		
		Passwordagain = new JLabel("Password (again):");
		Passwordagain.setFont(new Font("Tahoma", Font.BOLD, 12));
		Passwordagain.setBounds(69, 180, 121, 14);
		contentPane.add(Passwordagain);
		
		FirstNameField = new JTextField();
		FirstNameField.setBounds(152, 51, 86, 20);
		contentPane.add(FirstNameField);
		FirstNameField.setColumns(10);
		
		LastNameField = new JTextField();
		LastNameField.setBounds(152, 76, 86, 20);
		contentPane.add(LastNameField);
		LastNameField.setColumns(10);
		
		UsernameField = new JTextField();
		UsernameField.setBounds(152, 102, 86, 20);
		contentPane.add(UsernameField);
		UsernameField.setColumns(10);
		
		EmailField = new JTextField();
		EmailField.setBounds(152, 128, 86, 20);
		contentPane.add(EmailField);
		EmailField.setColumns(10);
		
		PasswordField = new JPasswordField();
		PasswordField.setBounds(152, 153, 86, 20);
		contentPane.add(PasswordField);
		
		PasswordAgainField = new JPasswordField();
		PasswordAgainField.setBounds(189, 178, 80, 20);
		contentPane.add(PasswordAgainField);
		
		TickBox = new JCheckBox("I agree to the terms of usage");
		TickBox.setBounds(26, 236, 212, 23);
		contentPane.add(TickBox);
		
		SignUpButton = new JButton("Sign Up");
		SignUpButton.setBounds(298, 236, 89, 23);
		contentPane.add(SignUpButton);
	}
	
}
