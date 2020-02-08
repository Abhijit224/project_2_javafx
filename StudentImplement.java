package ProssesingClass;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Utility.CollageDatabase;
import collegePojo.StudentPojo;

public class StudentImplement implements StudentInterface {

	@Override
	public int saveInfo(StudentPojo sp) {
		Connection con=CollageDatabase.MyDatabase();
		try 
		{
			String sql="INSERT INTO StudentInformation (Initial,StudentName,Student_midle_name,student_surname,"
					+ "Student_mother_name,DateOfBirth,Gender,Adharno,Contact,Email,Address,District,Pincode,State,"
					+ "Nationality,Religion,Cast,Cast_catagories,Student_x_year,Student_x_board,Student_x_percentage,"
					+ "Student_xii_year,Student_xii_board,Student_xii_Percentage,Student_g_year,Student_g_board,"
					+ "Student_g_percentage,Admissiondate,Applyfor,StudentImage) "
					+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, sp.getInitialname());
			pst.setString(2, sp.getFirstName());
			pst.setString(3, sp.getMidleName());
			pst.setString(4, sp.getSurname());
			pst.setString(5, sp.getMotherName());
			pst.setString(6, sp.getDateOfBirth());
			pst.setString(7, sp.getSex());
			pst.setString(8, sp.getAadharNumber());
			pst.setString(9, sp.getContactNumber());
			pst.setString(10, sp.getEmail());
			pst.setString(11, sp.getAddress());
			pst.setString(12, sp.getDistrict());
			pst.setString(13, sp.getPincode());
			pst.setString(14, sp.getState());
			pst.setString(15, sp.getNationality());
			pst.setString(16, sp.getReligion());
			pst.setString(17, sp.getCast());
			pst.setString(18, sp.getCast_Catagories());
			pst.setString(19, sp.getStudent_X_Year());
			pst.setString(20, sp.getStudent_X_Board());
			pst.setString(21, sp.getStudent_X_Percentage());
			pst.setString(22, sp.getStudent_XII_Year());
			pst.setString(23, sp.getStudent_XII_Board());
			pst.setString(24, sp.getStudent_XII_Percentage());
			pst.setString(25, sp.getStudent_G_Year());
			pst.setString(26, sp.getStudent_G_Board());
			pst.setString(27, sp.getStudent_G_Percentage());
			pst.setString(28, sp.getAdmissionDate());
			pst.setString(29, sp.getApplyFor());
			pst.setString(30, sp.getImage());
			
			
			int i =pst.executeUpdate();
			return i;
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		return 0;
	}

	
}
