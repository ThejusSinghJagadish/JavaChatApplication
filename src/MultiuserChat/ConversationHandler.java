package MultiuserChat;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ConversationHandler extends Thread{
	
	Socket socket;
	BufferedReader in;
	PrintWriter out;
	String name;
	String userPassword;
	private String password;
	Color color;
	PrintWriter writer;
	static FileWriter fileWriter;
	static BufferedWriter bufferedWriter;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public ConversationHandler(Socket socket) throws IOException{
		 this.socket = socket;
		 fileWriter = new FileWriter("/Users/thejussinghj/Desktop/chatServerLogs.txt",true);
		 bufferedWriter = new BufferedWriter(fileWriter);
		 writer = new PrintWriter(bufferedWriter,true);
	}
	
	public void run(){
		try{
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new PrintWriter(socket.getOutputStream(),true);
			int count = 0;
			int flag = 1;
			ConnectDB fetchPassword;
			while(true){
				if(count>0){
					out.println("NameAlreadyExist");
				}
				else{
					out.println("NameRequired");
				}
				name = in.readLine();
				if(name == null){
					return;
				}
				else{
					fetchPassword = new ConnectDB(name);
					fetchPassword.connectToDB();
				}
				
				if(!ChatServer.userNames.contains(name)){
					if(flag == 1){
						out.println("PasswordRequired");
						flag = 0;
					}
					while(true){
						userPassword = in.readLine();
						if(userPassword.equals(fetchPassword.getPassword())){
							break;
						}
						else{
							out.println("PasswordError");
						}
					}
					ChatServer.userNames.add(name);
					color = new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255));
					ChatServer.colorList.add(color);
					break;
				}
				count++;
			}
			out.println("NameAccepted"+ name);
			ChatServer.printWriters.add(out);
			
			while(true){
				String message = in.readLine();
				if(message == null){
					return;
				}
				/**
				 * @author Amanda
				 */
				writer.println(ChatServer.userNames.toString() + color.toString() + name + ": "+ message);
				for(PrintWriter writer : ChatServer.printWriters){
					/**
					 * @author Amanda
					 */
					writer.println(ChatServer.userNames.toString() + color.toString() + name + ": "+ message);
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

