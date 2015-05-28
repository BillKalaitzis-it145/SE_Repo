package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
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

	public SecretariatRequestsFrame() {
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
		EducationCertificate.setBounds(142, 40, 125, 23);
		contentPane.add(EducationCertificate);
		
		TranscriptOfRecords = new JRadioButton("Transcript of records");
		TranscriptOfRecords.setBounds(142, 65, 125, 23);
		contentPane.add(TranscriptOfRecords);
		
		Other = new JRadioButton("Other");
		Other.setBounds(142, 91, 109, 23);
		contentPane.add(Other);
		
		AdditionalComments = new JLabel("Additional Comments");
		AdditionalComments.setFont(new Font("Tahoma", Font.BOLD, 11));
		AdditionalComments.setBounds(162, 124, 125, 14);
		contentPane.add(AdditionalComments);
		
		CommentsArea = new JTextArea();
		CommentsArea.setBounds(103, 149, 246, 79);
		contentPane.add(CommentsArea);
		
		SubmitButton = new JButton("Submit");
		SubmitButton.setBounds(183, 239, 89, 23);
		contentPane.add(SubmitButton);
	}
	
}
