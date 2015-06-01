package se.package0;

import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class AnnouncementsFrame extends JFrame{
	
	private JPanel contentPane;
	private JList AnnouncementsList;

	public AnnouncementsFrame(Student st) {
		setVisible(true);
		setTitle("Makedonia IS - Announcements");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ArrayList<Announcement> a = FileOperations.readAnnouncements();
		DefaultListModel model = new DefaultListModel();
		String tmp = null;
		String tmp2 = null;
		for(Announcement an:a){
			tmp = an.getTimeStamp()+ " : " + an.getCourse().getName() +" - "+ an.getCreator().getName().substring(0, 1)+"." + an.getCreator().getSurname() + " ~ " + an.getTitle();
			tmp2 = "    " + an.getContent();
			
			model.addElement(tmp);
			model.addElement(tmp2);
		}
		
		
		AnnouncementsList = new JList(model);
		JScrollPane scroll = new JScrollPane (AnnouncementsList, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(10, 11, 572, 340);
		contentPane.add(scroll);
	}

}
