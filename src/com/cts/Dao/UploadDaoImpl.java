
package com.cts.Dao;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.cts.bean.UploadBean;
import com.cts.Util.DBConnection;
public class UploadDaoImpl implements UploadDao
{
	Connection con = null;
       @Override
       public boolean fileUpload(UploadBean upload)
       {
             String keyword=upload.getKeyword();
             String description=upload.getSkillname();
            
             
            
              PreparedStatement ps = null;
              try
              {
            	  Connection connection = DBConnection.getConnection();
                     //String query = "insert into users(SlNo,fullName,Email,userName,password) values (NULL,?,?,?,?)"; //Insert user details into the table 'USERS'
                     String query = "insert into searchkeyword(keyword,description,skillname) values (?,?,?)";
                       
               ps = con.prepareStatement(query); // generates sql query
             con.setAutoCommit(true);
           
            ps.setString(1,upload.getKeyword());
            ps.setBlob(2,upload.getDescription());
            ps.setString(3,upload.getSkillname());

             System.out.println(upload.getKeyword() + upload.getSkillname());
            int i= ps.executeUpdate();
                     if (i!=0)  //Just to ensure data has been inserted into the database
                     {  System.out.println("done"); return true;} 
         
              }
              
              catch(SQLException e)
              {
            	  System.out.println("not done");
                     e.printStackTrace();
                     return false;
              }
			return false;
       }
	@Override
	public List<UploadBean> getkeyword() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<UploadBean> getAllSkillset() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int addUpload(UploadBean upload) {
		// TODO Auto-generated method stub
		String keyword=upload.getKeyword();
		String skill=upload.getSkillname();
	   ;
        PreparedStatement ps = null;
        try
        {
               con = DBConnection.getConnection();
               //String query = "insert into users(SlNo,fullName,Email,userName,password) values (NULL,?,?,?,?)"; //Insert user details into the table 'USERS'
               String query = "insert into searchkeyword(keyword,description,skillname) values (?,?,?)";
                 
         ps = con.prepareStatement(query); // generates sql query

      ps.setString(1, keyword);
      ps.setBlob(2, upload.getDescription());

      ps.setString(3, skill);
      


       
      int i= ps.executeUpdate();
               if (i!=0)  //Just to ensure data has been inserted into the database
               return 1; 
   
        }
        
        catch(SQLException e)
        {
               e.printStackTrace();
               return 0;
        }
		return 1;
	}
	
}
