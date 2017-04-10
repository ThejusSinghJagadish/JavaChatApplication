package MultiuserChat;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	
	static ArrayList<String> userNames = new ArrayList<String>();
	static ArrayList<Color> colorList = new ArrayList<Color>();
	static ArrayList<PrintWriter> printWriters = new ArrayList<PrintWriter>();

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Waiting for clients...");
		ServerSocket serverSocket = new ServerSocket(9806);
		while(true){
			Socket socket = serverSocket.accept();
			System.out.println("Connection Established");
			ConversationHandler handler = new ConversationHandler(socket);
			handler.start();
		}
	}

}

