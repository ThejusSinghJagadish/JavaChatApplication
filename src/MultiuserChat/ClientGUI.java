package MultiuserChat;

/*import java.awt.*;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class ClientGUI {
	
	public String path = "/Users/thejussinghj/Documents/Interview/ChatApplication/src/MultiuserChat/";
	static JFrame chatWindow = new JFrame("Java Messenger");
	static JPanel textPanel = new JPanel();
	static JTextPane chatPane = new JTextPane();

	static JPanel typeField = new JPanel();

	static JTextField textField = new JTextField(30);
	static JMenuBar icon = new JMenuBar();

	static JLabel blankLabel = new JLabel("       ");
	static JLabel nameLabel = new JLabel("       ");
	static JButton sendButton = new JButton("Send");
	static JTextArea usersList = new JTextArea();
	static JMenu smile = new JMenu();

	public ClientGUI() {
		Icon icon1 = new ImageIcon(path+"1.png");
		Icon icon2 = new ImageIcon(path+"2.png");
		Icon icon3 = new ImageIcon(path+"3.png");
		Icon icon4 = new ImageIcon(path+"4.png");
		Icon icon5 = new ImageIcon(path+"5.png");
		Icon icon6 = new ImageIcon(path+"6.png");
		Icon icon7 = new ImageIcon(path+"7.png");
		Icon icon8 = new ImageIcon(path+"8.png");
		Icon icon9 = new ImageIcon(path+"9.png");
		Icon icon10 = new ImageIcon(path+"10.png");
		Icon icon11 = new ImageIcon(path+"11.png");
		Icon icon12 = new ImageIcon(path+"12.png");
		Icon icon13 = new ImageIcon(path+"13.png");
		Icon icon14 = new ImageIcon(path+"14.png");
		Icon icon15 = new ImageIcon(path+"15.png");
		Icon icon16 = new ImageIcon(path+"16.png");
		Icon icon17 = new ImageIcon(path+"17.png");
		Icon icon18 = new ImageIcon(path+"18.png");
		Icon icon19 = new ImageIcon(path+"19.png");
		Icon icon20 = new ImageIcon(path+"20.png");
		Icon icon21 = new ImageIcon(path+"21.png");
		Icon icon22 = new ImageIcon(path+"22.png");
		Icon icon23 = new ImageIcon(path+"23.png");
		Icon icon24 = new ImageIcon(path+"24.png");
		Icon icon25 = new ImageIcon(path+"25.png");
		Icon icon26 = new ImageIcon(path+"26.png");
		Icon icon27 = new ImageIcon(path+"27.png");
		Icon icon28 = new ImageIcon(path+"28.png");
		Icon icon29 = new ImageIcon(path+"29.png");
		Icon icon30 = new ImageIcon(path+"30.png");
		Icon icon31 = new ImageIcon(path+"31.png");
		Icon icon32 = new ImageIcon(path+"32.png");
		Icon icon33 = new ImageIcon(path+"33.png");
		Icon icon34 = new ImageIcon(path+"34.png");
		Icon icon35 = new ImageIcon(path+"35.png");
		Icon icon36 = new ImageIcon(path+"36.png");
		Icon icon37 = new ImageIcon(path+"37.png");
		Icon icon38 = new ImageIcon(path+"38.png");
		Icon icon39 = new ImageIcon(path+"39.png");
		Icon icon40 = new ImageIcon(path+"40.png");
		Icon icon41 = new ImageIcon(path+"41.png");
		Icon icon42 = new ImageIcon(path+"42.png");
		Icon icon43 = new ImageIcon(path+"43.png");
		Icon icon44 = new ImageIcon(path+"44.png");
		Icon icon45 = new ImageIcon(path+"45.png");
		Icon icon46 = new ImageIcon(path+"46.png");
		Icon icon47 = new ImageIcon(path+"47.png");
		Icon icon48 = new ImageIcon(path+"48.png");
		Icon icon49 = new ImageIcon(path+"49.png");
		Icon icon50 = new ImageIcon(path+"50.png");

		JLabel setOfIcons1 = new JLabel(icon1);
		JLabel setOfIcons2 = new JLabel(icon2);
		JLabel setOfIcons3 = new JLabel(icon3);
		JLabel setOfIcons4 = new JLabel(icon4);
		JLabel setOfIcons5 = new JLabel(icon5);
		JLabel setOfIcons6 = new JLabel(icon6);
		JLabel setOfIcons7 = new JLabel(icon7);
		JLabel setOfIcons8 = new JLabel(icon8);
		JLabel setOfIcons9 = new JLabel(icon9);
		JLabel setOfIcons10 = new JLabel(icon10);
		JLabel setOfIcons11 = new JLabel(icon11);
		JLabel setOfIcons12 = new JLabel(icon12);
		JLabel setOfIcons13 = new JLabel(icon13);
		JLabel setOfIcons14 = new JLabel(icon14);
		JLabel setOfIcons15 = new JLabel(icon15);
		JLabel setOfIcons16 = new JLabel(icon16);
		JLabel setOfIcons17 = new JLabel(icon17);
		JLabel setOfIcons18 = new JLabel(icon18);
		JLabel setOfIcons19 = new JLabel(icon19);
		JLabel setOfIcons20 = new JLabel(icon20);
		JLabel setOfIcons21 = new JLabel(icon21);
		JLabel setOfIcons22 = new JLabel(icon22);
		JLabel setOfIcons23 = new JLabel(icon23);
		JLabel setOfIcons24 = new JLabel(icon24);
		JLabel setOfIcons25 = new JLabel(icon25);
		JLabel setOfIcons26 = new JLabel(icon26);
		JLabel setOfIcons27 = new JLabel(icon27);
		JLabel setOfIcons28 = new JLabel(icon28);
		JLabel setOfIcons29 = new JLabel(icon29);
		JLabel setOfIcons30 = new JLabel(icon30);
		JLabel setOfIcons31 = new JLabel(icon31);
		JLabel setOfIcons32 = new JLabel(icon32);
		JLabel setOfIcons33 = new JLabel(icon33);
		JLabel setOfIcons34 = new JLabel(icon34);
		JLabel setOfIcons35 = new JLabel(icon35);
		JLabel setOfIcons36 = new JLabel(icon36);
		JLabel setOfIcons37 = new JLabel(icon37);
		JLabel setOfIcons38 = new JLabel(icon38);
		JLabel setOfIcons39 = new JLabel(icon39);
		JLabel setOfIcons40 = new JLabel(icon40);
		JLabel setOfIcons41 = new JLabel(icon41);
		JLabel setOfIcons42 = new JLabel(icon42);
		JLabel setOfIcons43 = new JLabel(icon43);
		JLabel setOfIcons44 = new JLabel(icon44);
		JLabel setOfIcons45 = new JLabel(icon45);
		JLabel setOfIcons46 = new JLabel(icon46);
		JLabel setOfIcons47 = new JLabel(icon47);
		JLabel setOfIcons48 = new JLabel(icon48);
		JLabel setOfIcons49 = new JLabel(icon49);
		JLabel setOfIcons50 = new JLabel(icon50);
		JPanel universalPanel = new JPanel();
		universalPanel.setBackground(new Color(135, 206, 250));
		chatWindow.add(universalPanel);

		JLabel welcomePanel = new JLabel(new ImageIcon(this.getClass().getResource("sky.jpg")));
		welcomePanel.setPreferredSize(new Dimension(945, 40));
		welcomePanel.setBackground(new Color(255, 255, 255));
		welcomePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		welcomePanel.add(nameLabel);
		nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
		nameLabel.setForeground(new Color(224, 255, 255));
		welcomePanel.add(blankLabel);
		universalPanel.add(welcomePanel, BorderLayout.NORTH);

		typeField.setLayout(new BorderLayout());
		typeField.add(textField, BorderLayout.WEST);
		textField.setPreferredSize(new Dimension(300, 20));
		smile.getPopupMenu().setLayout(new GridLayout(6, 6));
		smile.setIcon(new ImageIcon(
				this.getClass().getResource("blank_confuse_emoticon_explanation_emoji_faces_emotag-256_20x20.png")));
		icon.setSize(15, 20);
		typeField.add(smile, BorderLayout.EAST);

		JPanel chatPanel = new JPanel();
		chatPanel.setPreferredSize(new Dimension(705, 570));
		chatPanel.setBackground(new Color(255, 255, 255));
		chatPanel.add(textPanel, BorderLayout.NORTH);
		chatPanel.add(typeField, BorderLayout.WEST);
		chatPanel.add(sendButton, BorderLayout.EAST);
		universalPanel.add(chatPanel, BorderLayout.WEST);

		textPanel.setPreferredSize(new Dimension(750, 500));
		textPanel.setBackground(new Color(255, 255, 255));
		textPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
		// textPanel.add(chatPane);

		JScrollPane scrollChatPane = new JScrollPane(chatPane);
		scrollChatPane.setPreferredSize(new Dimension(650, 450));
		scrollChatPane.setEnabled(false);
		scrollChatPane.setBorder(null);
		textPanel.add(scrollChatPane);

		smile.add(setOfIcons1);
		smile.add(setOfIcons2);
		smile.add(setOfIcons3);
		smile.add(setOfIcons4);
		smile.add(setOfIcons5);
		smile.add(setOfIcons6);
		smile.add(setOfIcons7);
		smile.add(setOfIcons8);
		smile.add(setOfIcons9);
		smile.add(setOfIcons10);
		smile.add(setOfIcons11);
		smile.add(setOfIcons12);
		smile.add(setOfIcons13);
		smile.add(setOfIcons14);
		smile.add(setOfIcons15);
		smile.add(setOfIcons16);
		smile.add(setOfIcons17);
		smile.add(setOfIcons18);
		smile.add(setOfIcons19);
		smile.add(setOfIcons20);
		smile.add(setOfIcons21);
		smile.add(setOfIcons22);
		smile.add(setOfIcons23);
		smile.add(setOfIcons24);
		smile.add(setOfIcons25);
		smile.add(setOfIcons26);
		smile.add(setOfIcons27);
		smile.add(setOfIcons28);
		smile.add(setOfIcons29);
		smile.add(setOfIcons30);
		smile.add(setOfIcons31);
		smile.add(setOfIcons32);
		smile.add(setOfIcons33);
		smile.add(setOfIcons34);
		smile.add(setOfIcons35);
		smile.add(setOfIcons36);
		smile.add(setOfIcons37);
		smile.add(setOfIcons38);
		smile.add(setOfIcons39);
		smile.add(setOfIcons40);
		smile.add(setOfIcons41);
		smile.add(setOfIcons42);
		smile.add(setOfIcons43);
		smile.add(setOfIcons44);
		smile.add(setOfIcons45);
		smile.add(setOfIcons46);
		smile.add(setOfIcons47);
		smile.add(setOfIcons48);
		smile.add(setOfIcons49);
		smile.add(setOfIcons50);

		icon.add(smile);
		typeField.add(icon);

		JPanel usersPanel = new JPanel();
		usersPanel.setPreferredSize(new Dimension(235, 570));
		usersPanel.setBackground(new Color(255, 255, 255));
		usersPanel.add(usersList);
		universalPanel.add(usersPanel, BorderLayout.EAST);

		usersList.setEditable(true);

		chatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chatWindow.setSize(1000, 650);
		chatWindow.setVisible(true);
		chatWindow.setLocationRelativeTo(null);

		textField.setEditable(false);
		chatPane.setEditable(false);

		sendButton.addActionListener(new Listener());
		textField.addActionListener(new Listener());

	}

	
	public void appendToPane(String msg) {
		
		Color c = new Color(0, 0, 0);
		StyleContext sc = StyleContext.getDefaultStyleContext();
		AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

		aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
		aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

		int len = chatPane.getDocument().getLength();
		chatPane.setCaretPosition(len);
		chatPane.setCharacterAttributes(aset, false);
		chatPane.setEditable(true);
		chatPane.replaceSelection(msg);
		chatPane.setEditable(false);
	}
}*/



/**
 * This is the class that controls all the GUI for client users. 
 * @author Amanda
 */
import java.awt.*;

import javax.swing.*;
import javax.swing.text.AttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

public class ClientGUI {
	
	static JFrame chatWindow = new JFrame("Java Messenger");
	static JPanel textPanel = new JPanel();
	static JTextPane chatPane = new JTextPane();
	static JTextArea usersList = new JTextArea();
	static JPanel typeField = new JPanel();
	static JTextField textField = new JTextField(30);
	
	static JLabel blankLabel = new JLabel("       ");
	static JLabel nameLabel = new JLabel("       ");
	static JButton sendButton = new JButton("Send");
	
	
	static JMenuBar icon=new JMenuBar();
	static JMenu smile=new JMenu();
	
	
	
	public ClientGUI(){
		
		/**
		 * 
		 * @author Amindar
		 */
		ImageIcon icon1=new ImageIcon(this.getClass().getResource("1.png"));
		ImageIcon icon2=new ImageIcon(this.getClass().getResource("2.png"));
		ImageIcon icon3=new ImageIcon(this.getClass().getResource("3.png"));
		ImageIcon icon4=new ImageIcon(this.getClass().getResource("4.png"));
		ImageIcon icon5=new ImageIcon(this.getClass().getResource("5.png"));
		ImageIcon icon6=new ImageIcon(this.getClass().getResource("6.png"));
		ImageIcon icon7=new ImageIcon(this.getClass().getResource("7.png"));
		ImageIcon icon8=new ImageIcon(this.getClass().getResource("8.png"));
		ImageIcon icon9=new ImageIcon(this.getClass().getResource("9.png"));
		ImageIcon icon10=new ImageIcon(this.getClass().getResource("10.png"));
		ImageIcon icon11=new ImageIcon(this.getClass().getResource("11.png"));
		ImageIcon icon12=new ImageIcon(this.getClass().getResource("12.png"));
		ImageIcon icon13=new ImageIcon(this.getClass().getResource("13.png"));
		ImageIcon icon14=new ImageIcon(this.getClass().getResource("14.png"));
		ImageIcon icon15=new ImageIcon(this.getClass().getResource("15.png"));
		ImageIcon icon16=new ImageIcon(this.getClass().getResource("16.png"));
		ImageIcon icon17=new ImageIcon(this.getClass().getResource("17.png"));
		ImageIcon icon18=new ImageIcon(this.getClass().getResource("18.png"));
		ImageIcon icon19=new ImageIcon(this.getClass().getResource("19.png"));
		ImageIcon icon20=new ImageIcon(this.getClass().getResource("20.png"));
		ImageIcon icon21=new ImageIcon(this.getClass().getResource("21.png"));
		ImageIcon icon22=new ImageIcon(this.getClass().getResource("22.png"));
		ImageIcon icon23=new ImageIcon(this.getClass().getResource("23.png"));
		ImageIcon icon24=new ImageIcon(this.getClass().getResource("24.png"));
		ImageIcon icon25=new ImageIcon(this.getClass().getResource("25.png"));
		ImageIcon icon26=new ImageIcon(this.getClass().getResource("26.png"));
		ImageIcon icon27=new ImageIcon(this.getClass().getResource("27.png"));
		ImageIcon icon28=new ImageIcon(this.getClass().getResource("28.png"));
		ImageIcon icon29=new ImageIcon(this.getClass().getResource("29.png"));
		ImageIcon icon30=new ImageIcon(this.getClass().getResource("30.png"));
		ImageIcon icon31=new ImageIcon(this.getClass().getResource("31.png"));
		ImageIcon icon32=new ImageIcon(this.getClass().getResource("32.png"));
		ImageIcon icon33=new ImageIcon(this.getClass().getResource("33.png"));
		ImageIcon icon34=new ImageIcon(this.getClass().getResource("34.png"));
		ImageIcon icon35=new ImageIcon(this.getClass().getResource("35.png"));
		ImageIcon icon36=new ImageIcon(this.getClass().getResource("36.png"));
		ImageIcon icon37=new ImageIcon(this.getClass().getResource("37.png"));
		ImageIcon icon38=new ImageIcon(this.getClass().getResource("38.png"));
		ImageIcon icon39=new ImageIcon(this.getClass().getResource("39.png"));
		ImageIcon icon40=new ImageIcon(this.getClass().getResource("40.png"));
		ImageIcon icon41=new ImageIcon(this.getClass().getResource("41.png"));
		ImageIcon icon42=new ImageIcon(this.getClass().getResource("42.png"));
		ImageIcon icon43=new ImageIcon(this.getClass().getResource("43.png"));
		ImageIcon icon44=new ImageIcon(this.getClass().getResource("44.png"));
		ImageIcon icon45=new ImageIcon(this.getClass().getResource("45.png"));
		ImageIcon icon46=new ImageIcon(this.getClass().getResource("46.png"));
		ImageIcon icon47=new ImageIcon(this.getClass().getResource("47.png"));
		ImageIcon icon48=new ImageIcon(this.getClass().getResource("48.png"));
		ImageIcon icon49=new ImageIcon(this.getClass().getResource("49.png"));
		ImageIcon icon50=new ImageIcon(this.getClass().getResource("50.png"));
		
		
		JLabel setOfIcons1 = new JLabel(icon1);
		JLabel setOfIcons2 = new JLabel(icon2);
		JLabel setOfIcons3 = new JLabel(icon3);
		JLabel setOfIcons4 = new JLabel(icon4);
		JLabel setOfIcons5 = new JLabel(icon5);
		JLabel setOfIcons6 = new JLabel(icon6);
		JLabel setOfIcons7 = new JLabel(icon7);
		JLabel setOfIcons8 = new JLabel(icon8);
		JLabel setOfIcons9 = new JLabel(icon9);
		JLabel setOfIcons10 = new JLabel(icon10);
		JLabel setOfIcons11 = new JLabel(icon11);
		JLabel setOfIcons12 = new JLabel(icon12);
		JLabel setOfIcons13 = new JLabel(icon13);
		JLabel setOfIcons14 = new JLabel(icon14);
		JLabel setOfIcons15 = new JLabel(icon15);
		JLabel setOfIcons16 = new JLabel(icon16);
		JLabel setOfIcons17 = new JLabel(icon17);
		JLabel setOfIcons18 = new JLabel(icon18);
		JLabel setOfIcons19 = new JLabel(icon19);
		JLabel setOfIcons20 = new JLabel(icon20);
		JLabel setOfIcons21 = new JLabel(icon21);
		JLabel setOfIcons22 = new JLabel(icon22);
		JLabel setOfIcons23 = new JLabel(icon23);
		JLabel setOfIcons24 = new JLabel(icon24);
		JLabel setOfIcons25 = new JLabel(icon25);
		JLabel setOfIcons26 = new JLabel(icon26);
		JLabel setOfIcons27 = new JLabel(icon27);
		JLabel setOfIcons28 = new JLabel(icon28);
		JLabel setOfIcons29 = new JLabel(icon29);
		JLabel setOfIcons30 = new JLabel(icon30);
		JLabel setOfIcons31 = new JLabel(icon31);
		JLabel setOfIcons32 = new JLabel(icon32);
		JLabel setOfIcons33 = new JLabel(icon33);
		JLabel setOfIcons34 = new JLabel(icon34);
		JLabel setOfIcons35 = new JLabel(icon35);
		JLabel setOfIcons36 = new JLabel(icon36);
		JLabel setOfIcons37 = new JLabel(icon37);
		JLabel setOfIcons38 = new JLabel(icon38);
		JLabel setOfIcons39 = new JLabel(icon39);
		JLabel setOfIcons40 = new JLabel(icon40);
		JLabel setOfIcons41 = new JLabel(icon41);
		JLabel setOfIcons42 = new JLabel(icon42);
		JLabel setOfIcons43 = new JLabel(icon43);
		JLabel setOfIcons44 = new JLabel(icon44);
		JLabel setOfIcons45 = new JLabel(icon45);
		JLabel setOfIcons46 = new JLabel(icon46);
		JLabel setOfIcons47 = new JLabel(icon47);
		JLabel setOfIcons48 = new JLabel(icon48);
		JLabel setOfIcons49 = new JLabel(icon49);
		JLabel setOfIcons50 = new JLabel(icon50);
		
		/**
		 * Universal panel and background
		 * @author Amanda
		 */
		JPanel universalPanel = new JPanel();
		universalPanel.setBackground(new Color(135, 206, 250));
		chatWindow.add(universalPanel);
		
		/**
		 * Welcome panel and background
		 * @author Amanda
		 */
		JLabel welcomePanel = new JLabel(new ImageIcon(this.getClass().getResource("sky.jpg")));
		welcomePanel.setPreferredSize(new Dimension(945, 40));
		welcomePanel.setBackground(new Color(255, 255, 255));
		welcomePanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		welcomePanel.add(nameLabel);
		nameLabel.setFont(new Font("Arial", Font.BOLD, 24));
		nameLabel.setForeground(new Color(224, 255, 255));
		welcomePanel.add(blankLabel);
		universalPanel.add(welcomePanel, BorderLayout.NORTH);
		
		typeField.setLayout(new BorderLayout());
		typeField.add(textField,BorderLayout.WEST);
		textField.setPreferredSize(new Dimension(300,20));
		smile.getPopupMenu().setLayout(new GridLayout(6,6));
		smile.setIcon(new ImageIcon(this.getClass().getResource("blank_confuse_emoticon_explanation_emoji_faces_emotag-256_20x20.png")));
		icon.setSize(15,20);
		typeField.add(smile,BorderLayout.EAST);
		
		/**
		 * Main chat panel
		 * @author Amanda
		 */
		JPanel chatPanel = new JPanel();
		chatPanel.setPreferredSize(new Dimension(705, 570));
		chatPanel.setBackground(new Color(255, 255, 255));
		chatPanel.add(textPanel, BorderLayout.NORTH);
		chatPanel.add(typeField, BorderLayout.WEST);
		chatPanel.add(sendButton, BorderLayout.EAST);
		universalPanel.add(chatPanel, BorderLayout.WEST);
		
		textPanel.setPreferredSize(new Dimension(750, 500));
		textPanel.setBackground(new Color(255, 255, 255));
		textPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
		
		JScrollPane scrollChatPane = new JScrollPane(chatPane);
		scrollChatPane.setPreferredSize(new Dimension(650, 450));
		scrollChatPane.setEnabled(false);
		scrollChatPane.setBorder(null);
		textPanel.add(scrollChatPane);

		/**
		 * Adding emoji icons
		 * @author Amindar
		 */
		smile.add(setOfIcons1);
		smile.add(setOfIcons2);
		smile.add(setOfIcons3);
		smile.add(setOfIcons4);
		smile.add(setOfIcons5);
		smile.add(setOfIcons6);
		smile.add(setOfIcons7);
		smile.add(setOfIcons8);
		smile.add(setOfIcons9);
		smile.add(setOfIcons10);
		smile.add(setOfIcons11);
		smile.add(setOfIcons12);
		smile.add(setOfIcons13);
		smile.add(setOfIcons14);
		smile.add(setOfIcons15);
		smile.add(setOfIcons16);
		smile.add(setOfIcons17);
		smile.add(setOfIcons18);
		smile.add(setOfIcons19);
		smile.add(setOfIcons20);
		smile.add(setOfIcons21);
		smile.add(setOfIcons22);
		smile.add(setOfIcons23);
		smile.add(setOfIcons24);
		smile.add(setOfIcons25);
		smile.add(setOfIcons26);
		smile.add(setOfIcons27);
		smile.add(setOfIcons28);
		smile.add(setOfIcons29);
		smile.add(setOfIcons30);
		smile.add(setOfIcons31);
		smile.add(setOfIcons32);
		smile.add(setOfIcons33);
		smile.add(setOfIcons34);
		smile.add(setOfIcons35);
		smile.add(setOfIcons36);
		smile.add(setOfIcons37);
		smile.add(setOfIcons38);
		smile.add(setOfIcons39);
		smile.add(setOfIcons40);
		smile.add(setOfIcons41);
		smile.add(setOfIcons42);
		smile.add(setOfIcons43);
		smile.add(setOfIcons44);
		smile.add(setOfIcons45);
		smile.add(setOfIcons46);
		smile.add(setOfIcons47);
		smile.add(setOfIcons48);
		smile.add(setOfIcons49);
		smile.add(setOfIcons50);

		icon.add(smile);
		typeField.add(icon);

		/**
		 * Users list panel
		 * @author Amanda
		 */
		JPanel usersPanel = new JPanel();
		usersPanel.setPreferredSize(new Dimension(235, 570));
		usersPanel.setBackground(new Color(255, 255, 255));
		usersPanel.add(usersList);
		universalPanel.add(usersPanel, BorderLayout.EAST);
		usersList.setEditable(false);
		
		usersPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 20));
		
		JScrollPane scrollUsersPane = new JScrollPane(usersList);
		scrollUsersPane.setPreferredSize(new Dimension(150, 530));
		scrollUsersPane.setEnabled(false);
		scrollUsersPane.setBorder(null);
		usersPanel.add(scrollUsersPane);
		
		/**
		 * JFrame settings
		 * @author Amanda
		 */
		chatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chatWindow.setSize(1000, 650);
		chatWindow.setVisible(true);
		chatWindow.setLocationRelativeTo(null);
		
		textField.setEditable(false);
		chatPane.setEditable(false);
		
		sendButton.addActionListener(new Listener());
		textField.addActionListener(new Listener());
		
	}
	
	/*
	 * Helper function for changing the color of text
	 */
	  public void appendToPane(JTextPane pane, String msg, Color c)
	    {
	        StyleContext sc = StyleContext.getDefaultStyleContext();
	        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, c);

	        aset = sc.addAttribute(aset, StyleConstants.FontFamily, "Lucida Console");
	        aset = sc.addAttribute(aset, StyleConstants.Alignment, StyleConstants.ALIGN_JUSTIFIED);

	        int len = pane.getDocument().getLength();
	        pane.setCaretPosition(len);
	        pane.setCharacterAttributes(aset, false);
	        pane.setEditable(true);
	        pane.replaceSelection(msg);
	        pane.setEditable(false);
	    }
}


