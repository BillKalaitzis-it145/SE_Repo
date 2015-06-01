package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.acl.Group;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class SecretariatRequestsFrame extends JFrame{
	
	private JPanel contentPane;
	private JLabel RequestType;
	private JRadioButton EducationCertificate;
	private JRadioButton TranscriptOfRecords;
	private JRadioButton Other;
	private JLabel AdditionalComments;
	private JTextArea CommentsArea;
	private JButton SubmitButton;
	private ButtonGroup grp;
	private Student s;

	public SecretariatRequestsFrame(Student st) {
		setVisible(true);
		setTitle("Makedonia IS - Secretariat Request");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		RequestType = new JLabel("Request Type:");
		RequestType.setFont(new Font("Tahoma", Font.BOLD, 12));
		RequestType.setBounds(173, 11, 94, 14);
		contentPane.add(RequestType);
		
		EducationCertificate = new JRadioButton("Education Certificate");
		EducationCertificate.setBounds(142, 40, 145, 23);
		contentPane.add(EducationCertificate);
		
		TranscriptOfRecords = new JRadioButton("Transcript of records");
		TranscriptOfRecords.setBounds(142, 65, 155, 23);
		contentPane.add(TranscriptOfRecords);
		
		Other = new JRadioButton("Other");
		Other.setBounds(142, 91, 109, 23);
		contentPane.add(Other);
		
		grp = new ButtonGroup();
		grp.add(EducationCertificate);
		grp.add(TranscriptOfRecords);
		grp.add(Other);
		
		AdditionalComments = new JLabel("Additional Comments");
		AdditionalComments.setFont(new Font("Tahoma", Font.BOLD, 11));
		AdditionalComments.setBounds(162, 124, 125, 14);
		contentPane.add(AdditionalComments);
		
		CommentsArea = new JTextArea();
		JScrollPane sp = new JScrollPane(CommentsArea,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setBounds(103, 149, 246, 79);
		contentPane.add(sp);
		
		SubmitButton = new JButton("Submit");
		SubmitButton.setBounds(183, 239, 89, 23);
		contentPane.add(SubmitButton);
		
		s = st;
		
		ButtonListener b = new ButtonListener();
		SubmitButton.addActionListener(b);
	}
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			String comments = CommentsArea.getText();
			String type;
			if(EducationCertificate.isSelected())
				type = EducationCertificate.getText();
			else if(TranscriptOfRecords.isSelected())
				type = TranscriptOfRecords.getText();
			else
				type = Other.getText();
			if(!type.equals("")){
				if(type.equals("Other") && comments.equals(""))
					new MsgFrame("Warning","You need to add comments for your selected request");
				else
					createRequest(s,comments,type);
			}
			
		}	
		
		
	}
	
	public void createRequest(Student s, String comments, String type) {
		
		Request r = new Request(type,comments,s);
		ArrayList<Request> ar = new ArrayList<Request>();
		ar.add(r);
		FileOperations.writeRequests(ar);
		
	}
}
