package MyPackage;

import java.sql.*;

public class DBUtil {

	private static Connection con;
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "root";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/Employee";

	public static Connection getConnection() {
		try {
			Class.forName(DB_DRIVER_CLASS);
			System.out.println("Driver Loaded Successfully");
			
			con = DriverManager.getConnection(DB_URL, DB_USERNAME,DB_PASSWORD);
			System.out.println("Connection Establish Successfully");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			System.out.println("Error...."+e.getMessage());
		}
		return con;
	}
}