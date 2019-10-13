package com.cts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.Util.DBConnection;
import com.cts.bean.RegisterBean;

public class RegisterDaoImpl implements RegisterDao{
	public boolean registerUser(RegisterBean registerBean)
	{
		
	String First_Name = registerBean.getFirst_Name();
    String Last_Name = registerBean.getLast_Name();
    String Age = registerBean.getAge();
    String MobileNumber = registerBean.getMobileNumber();
    
    String username = registerBean.getUserName();
    String password = registerBean.getPassword();
    String password1 = registerBean.getPassword1();
    String usertype = registerBean.getUserType();
    
    Connection con = null;
    PreparedStatement ps = null;
    try
    {
           con = DBConnection.getConnection();
           //String query = "insert into users(SlNo,fullName,Email,userName,password) values (NULL,?,?,?,?)"; //Insert user details into the table 'USERS'
           String query = "insert into register(First_Name,Last_Name,Age,MobileNumber,username,password,password1,usertype) values (?,?,?,?,?,?,?,?)";
           
           
           
           /*preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
           preparedStatement.setString(1, fullName);
           preparedStatement.setString(2, email);
           preparedStatement.setString(3, userName);
           preparedStatement.setString(4, password);*/
           
           
           ps = con.prepareStatement(query); // generates sql query

  ps.setString(1, First_Name);
  ps.setString(2, Last_Name);
 // ps.setInt(3, Integer.parseInt(Age));
  ps.setString(3, Age);
  ps.setString(4, MobileNumber);
  //ps.setInt(4, Integer.parseInt(MobileNumber));
 // ps.setString(5, Gender);
  ps.setString(5, username);
  //ps.setInt(6, Integer.parseInt(password));
  //ps.setInt(7, Integer.parseInt(CnfPs));
  ps.setString(6, password);
  ps.setString(7, password1);
  //ps.setString(8, registerBean.getUserType());
  ps.setString(8, usertype);
  

  
           
 // ps.executeUpdate(); // execute it on test database
  int i= ps.executeUpdate();
           if (i!=0)  //Just to ensure data has been inserted into the database
              return true; 
 // System.out.println("successfuly inserted");
 
                        

    }
    catch(SQLException e)
    {
           e.printStackTrace();
    }
    finally{
           
           try {
                 ps.close();
           } catch (SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
           }
                 
           
    }
    return false;  // On failure, send a message from here.
}

	@Override
	public RegisterBean getRegisterUserByEmailid(String emailID) {
		 Connection con = null;
		    PreparedStatement ps = null;
		    try
		    {
		           con = DBConnection.getConnection();
		           ps=con.prepareStatement("select * from register where username=?");
		           ps.setString(1, emailID);
		           ResultSet rs=ps.executeQuery();
		           if(rs.next())
		           {
		        	   RegisterBean bean=new RegisterBean();
		        	   bean.setAge(rs.getString("age"));
		        	   bean.setFirst_Name(rs.getString("First_Name"));
		        	   bean.setUserType(rs.getString("userType"));
		        	   
		        	   
		        	   return bean;
		           }

		    }
		    catch(SQLException e)
		    {
		           e.printStackTrace();
		    }
		    finally{
		           
		           try {
		                 ps.close();
		           } catch (SQLException e) {
		                 // TODO Auto-generated catch block
		                 e.printStackTrace();
		           }
		    }
		return null;
	}




}
