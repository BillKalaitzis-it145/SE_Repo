package se.package0;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MsgFrame extends JFrame{

	private JPanel contentPane;
	private JLabel Msg;
	private JButton OKButton;
	private JLabel Msg2;

	public MsgFrame() {
		setVisible(true);
		setTitle("Makedonia IS - add Title");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		OKButton = new JButton("OK");
		OKButton.setBounds(180, 74, 89, 23);
		contentPane.add(OKButton);
		
		Msg = new JLabel("Add content");
		Msg.setBounds(57, 28, 344, 14);
		contentPane.add(Msg);
		
		Msg2 = new JLabel("");
		Msg2.setBounds(57, 46, 344, 14);
		contentPane.add(Msg2);
	}
	
}