package MultiuserChat;

import java.sql.*;

public class ConnectDB {
	private String userName;
	private String password;
	public ConnectDB(String userName){
		this.setUserName(userName);
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void connectToDB() {
		// TODO Auto-generated method stub
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chat", "root", "thejussinghj");
			getPassword(connection);
			connection.close();
		}
		catch(Exception e){
			
		}
	}

	public void getPassword(Connection connection){
		try{
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("select password from user where username='"+this.getUserName()+"';");
			while(result.next()){
				this.setPassword(result.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectDB connect = new ConnectDB("tjagadish@scu");
		connect.connectToDB();
		if(connect.getPassword() != null){
			System.out.println(connect.getPassword());
		}
		else{
			System.out.println(connect.getPassword());
		}
	}*/

}
