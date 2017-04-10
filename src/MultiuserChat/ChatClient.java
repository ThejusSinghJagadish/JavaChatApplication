package MultiuserChat;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class ChatClient {

	static ClientGUI gui;
	static BufferedReader in;
	static PrintWriter out;

	public ChatClient() {
		gui = new ClientGUI();
	}

	void startChat() throws Exception {

		String ipAddress = JOptionPane.showInputDialog(ClientGUI.chatWindow, "Enter IP Address:", "IP Address Required!!",
				JOptionPane.PLAIN_MESSAGE);
		
		Socket socket = new Socket(ipAddress, 9806);
		
		in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		out = new PrintWriter(socket.getOutputStream(), true);

		while (true) {
			
			String str = in.readLine();
			
			if (str.equals("NameRequired")) {
				
				String name = JOptionPane.showInputDialog(ClientGUI.chatWindow, "Enter a unique name", "Name Required!!",
						JOptionPane.PLAIN_MESSAGE);
				out.println(name);
				
			}
			else if (str.equals("NameAlreadyExist")) {
				
				String name = JOptionPane.showInputDialog(ClientGUI.chatWindow, "Enter another name", "Name Already Exists!!",
						JOptionPane.WARNING_MESSAGE);
				out.println(name);
				
			}
			else if (str.equals("PasswordRequired")) {
				
				String password = JOptionPane.showInputDialog(ClientGUI.chatWindow, "Enter your password",
						"Password Required", JOptionPane.PLAIN_MESSAGE);
				out.println(password);

			} 
			else if (str.equals("PasswordError")) {
				
				String password = JOptionPane.showInputDialog(ClientGUI.chatWindow, "Check your password", "Password Error",
						JOptionPane.WARNING_MESSAGE);
				out.println(password);
				
			} 
			else if (str.startsWith("NameAccepted")) {
				
				ClientGUI.textField.setEditable(true);
				ClientGUI.nameLabel.setText("           Hello, " + str.substring(12) + "! Welcome to LetzConnect.");
				
			} 
			else {
				
				String[] stream = str.split("]", 3);
				Color color = new Color(0, 0, 0);
				if (stream.length == 3) {

					String[] colorStrings = stream[1].split("=");
					
					if (colorStrings.length == 4) {
						
						String r = colorStrings[1].substring(0, colorStrings[1].length() - 2);
						String g = colorStrings[2].substring(0, colorStrings[2].length() - 2);
						color = new Color(Integer.parseInt(r), Integer.parseInt(g), Integer.parseInt(colorStrings[3]));
						
					}
					
					ClientGUI.usersList.setEnabled(true);
					ClientGUI.usersList.setText(stream[0].substring(1).replaceAll(", ", "\n\n"));
					ClientGUI.usersList.setEnabled(false);
					gui.appendToPane(ClientGUI.chatPane, stream[2] + "\n\n", color);
					
				} 
				else {
					
					gui.appendToPane(ClientGUI.chatPane, str + "\n\n", color);
					
				}
			}
		}

	}
}

class Listener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		ChatClient.out.println(ClientGUI.textField.getText());
		ClientGUI.textField.setText("");

	}
}
