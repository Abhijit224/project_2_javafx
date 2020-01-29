package Controller;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import PojoData.LoginPojo;
import Utility.DataConnection;

public class LoginImplement implements LoginInterface {

	@Override
	public boolean LoginInterface(LoginPojo lp) {
		// TODO Auto-generated method stub
		 try {
	            Connection con= DataConnection.DatabaseConn();
	            String sql="SELECT * FROM UserData WHERE User=? and Password=?";
	            PreparedStatement pst = con.prepareStatement(sql);
	            pst.setString(1,lp.getUserName());
	            pst.setString(2,lp.getPassword());
	            ResultSet res=pst.executeQuery();
	            if(res.next())
	            {
	                return true;
	               
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		
		
		return false;
	}

}
