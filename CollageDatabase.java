package Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class CollageDatabase {
	public static Connection MyDatabase()
	{
		Connection con = null;
		try 
		{
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:\\D:\\Project Database\\collage.db","root","admin");
			System.out.println(con);
			return con;
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		return null;
		
	}

}
