package se.package0;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MainFrame extends JFrame{
	
	private JPanel contentPane;
	private JLabel MakIcon;
	private JLabel ConnectedAsLabel;
	private JLabel ConnectAs;
	private JButton CoursesButton;
	private JButton GradesButton;
	private JButton ProfileButton;
	private JButton AnnouncementsButton;
	private JButton SRButton;
	private Student s;


	public MainFrame(Student st) {
		setVisible(true);
		setResizable(false);
		setTitle("Makedonia IS - Main");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ImageIcon img = new ImageIcon("Data/mak1.png");
		MakIcon = new JLabel(img);
		MakIcon.setBounds(20, 15, 50,50);
		contentPane.add(MakIcon);
		
		String name = st.getName() + " " + st.getSurname();
		String id = st.getID();
		ConnectAs = new JLabel("Connect as:");
		ConnectAs.setFont(new Font("Tahoma", Font.BOLD, 11));
		ConnectAs.setBounds(222, 26, 69, 14);
		contentPane.add(ConnectAs);
		
		ConnectedAsLabel = new JLabel(name + ", " + id);
		ConnectedAsLabel.setBounds(301, 26, 131, 14);
		contentPane.add(ConnectedAsLabel);
		
		CoursesButton = new JButton("Courses");
		CoursesButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		CoursesButton.setBounds(163, 91, 108, 23);
		contentPane.add(CoursesButton);
		
		GradesButton = new JButton("Grades");
		GradesButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		GradesButton.setBounds(163, 125, 108, 23);
		contentPane.add(GradesButton);
		
		ProfileButton = new JButton("Profile");
		ProfileButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		ProfileButton.setBounds(163, 159, 108, 23);
		contentPane.add(ProfileButton);
		
		SRButton = new JButton("Secretariat Requests");
		SRButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		SRButton.setBounds(136, 193, 158, 23);
		contentPane.add(SRButton);
		
		AnnouncementsButton = new JButton("Announcements");
		AnnouncementsButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		AnnouncementsButton.setBounds(139, 227, 152, 23);
		contentPane.add(AnnouncementsButton);
		
		s = st;
		
		ButtonListener b = new ButtonListener();
		CoursesButton.addActionListener(b);
		GradesButton.addActionListener(b);
		ProfileButton.addActionListener(b);
		AnnouncementsButton.addActionListener(b);
		SRButton.addActionListener(b);
		
		
	}
		
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == CoursesButton)
				new CoursesFrame(s);
			else if(e.getSource() == GradesButton)
				new GradesFrame(s);
			else if(e.getSource() == ProfileButton)
				new ProfileFrame(s);
			else if(e.getSource() == AnnouncementsButton)
				new AnnouncementsFrame(s);
			else
				new SecretariatRequestsFrame(s); //todo: maybe add a logout button 
			//todo: disable exiting main frame after closing any sub frame
		}
		
	}

}
