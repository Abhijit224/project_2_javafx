package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DataConnection {
	public static Connection DatabaseConn ()
	{
		Connection con=null;
		try {
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:\\F:\\Project Database\\ProjectData.db3","root","admin");
			System.out.println(con);
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
		
	}

}
