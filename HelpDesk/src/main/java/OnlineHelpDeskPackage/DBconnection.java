package OnlineHelpDeskPackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

	private static String url="jdbc:mysql://localhost:3306/university";//university is the database name on bench
	private static String user="root";
	private static String pass="Acer@123";
	private static Connection con;
	
	public static Connection getConnection (){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
		}
		catch(Exception e) {
			System.out.println("Database Not Connected !");
		}
		return con;
	}
}
