package MultiuserChat;

import java.awt.*;
import javax.swing.*;

public class Splash extends JWindow {

	private int duration;
	public String path = "/Users/thejussinghj/Documents/Interview/ChatApplication/src/MultiuserChat/";
	public Splash(int duration) {
		this.duration = duration;
	}

	public void showSplash() {
		JPanel content = (JPanel) getContentPane();

		// Set the window's bounds, centering the window
		int width = 1000;
		int height = 650;
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		int x = (screen.width - width) / 2;
		int y = (screen.height - height) / 2;
		setBounds(x, y, width, height);

		// Build the splash screen
		JLabel label = new JLabel(new ImageIcon(path+"aman.png"));
		content.add(label, BorderLayout.CENTER);

		// Display it
		setVisible(true);

		// Wait a little while, maybe while loading resources
		try {
			Thread.sleep(duration);
		} catch (Exception e) {

		}

		setVisible(false);
	}

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Splash splash = new Splash(5000);
	    // call splash.showSplash() and get on with the program.
	    splash.showSplash();
	    ChatClient client = new ChatClient();
		try {
			client.startChat();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
