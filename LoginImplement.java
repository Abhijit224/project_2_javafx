package ProssesingClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Utility.CollageDatabase;
import collegePojo.UserLoginPojo;

public class LoginImplement implements LoginInterface {

	@Override
	public boolean LoginProsses(UserLoginPojo ulp) {
		Connection con = CollageDatabase.MyDatabase();
		String sql = "SELECT * FROM AdminUser WHERE AdminName=? and AdminPassword=?";
		PreparedStatement pst = null;
		try 
		{
			pst = con.prepareStatement(sql);
			pst.setString(1, ulp.getUserName());
			pst.setString(2, ulp.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return true;
			}
			
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		finally 
		{
			try 
			{
				con.close();
				pst.close();
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
