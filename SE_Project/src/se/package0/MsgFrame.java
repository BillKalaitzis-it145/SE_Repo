package se.package0;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MsgFrame extends JFrame{

	private JPanel contentPane;
	private JLabel Msg;
	private JButton OKButton;
	private JTextArea Msg2;

	public MsgFrame(String title,String msg) {
		setVisible(true);
		setResizable(false);
		setTitle("Makedonia IS - " + title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 142);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		OKButton = new JButton("OK");
		OKButton.setBounds(180, 74, 89, 23);
		contentPane.add(OKButton);
		
		if(!title.equals("Course Info")){
			Msg = new JLabel(msg);
			Msg.setBounds(57, 28, 344, 14);
			contentPane.add(Msg);
		}
		else{
			Msg2 = new JTextArea(msg);
			Msg2.setEditable(false);
			JScrollPane scroll = new JScrollPane(Msg2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scroll.setBounds(10, 10, 420, 55);
			contentPane.add(scroll);
		}
		
		ButtonListener b = new ButtonListener();
		OKButton.addActionListener(b);
	}
	
	class ButtonListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			dispose();
		}}
	
}
