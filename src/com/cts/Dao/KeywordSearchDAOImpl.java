package com.cts.Dao;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cts.Util.DBConnection;
import com.cts.bean.UploadBean;
import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;

public class KeywordSearchDAOImpl implements KeywordSearchDAO {
private Connection connection = null;
	
	@Override
	public String keywordSearch(String keyword) {
		connection = DBConnection.getConnection();
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//String keyword=request.getParameter("search2");
		
		try{
			Blob textfile=null;
	         String query="select keyword,description from searchkeyword where keyword=?";
	         PreparedStatement pst=(PreparedStatement) connection.prepareStatement(query);
	         pst.setString(1, keyword);
	         ResultSet rs=pst.executeQuery();
	         while(rs.next())
	         {
	        	 String word=rs.getString(1);
	        	 
	        
	        	 textfile=(Blob) rs.getBlob(2);
	        	 InputStream inputStream=textfile.getBinaryStream();
	        	 BufferedReader br = null;
	        	 br = new BufferedReader(new InputStreamReader(inputStream));
	     		 StringBuilder sb = new StringBuilder();

	     		String line;
	     		while ((line = br.readLine()) != null) {
	     			sb.append(line);
	     		}
	     		
	     		//System.out.println("sbss"+sb);
	        	
	     		//return sb.toString();
	        	return sb.toString();	 
	         }
	         connection.close();
	         
		}
	         catch(Exception e)
		{e.printStackTrace();
	         }
		return null;
	}

	@Override
	public List<UploadBean> getAllCourses() {
		// TODO Auto-generated method stub
		connection = DBConnection.getConnection();
		System.out.println("In DAO");
		List<UploadBean> ub = new ArrayList<UploadBean>();
		try{
			
			 Blob textfile=null;			
	         String query="select * from searchkeyword";
	         PreparedStatement pst=(PreparedStatement) connection.prepareStatement(query);
	         ResultSet rs=pst.executeQuery();
	         while(rs.next())
	         {
	        	 System.out.println(rs.getString("keyword"));
	        	 System.out.println(rs.getString("skillname"));

	        	 String course=rs.getString("keyword");
	        	 String word=rs.getString("skillname");

	        	 textfile=(Blob) rs.getBlob("description");
	        	 InputStream inputStream=textfile.getBinaryStream();
	        	 UploadBean ubq = new UploadBean(course,word,inputStream);
	        	 

	     		ub.add(ubq);
	     		System.out.println(ub);
	     		

	     		}
	         connection.close();

	         return ub;

	     		//System.out.println("sbss"+sb);
	        	
	     		//return sb.toString();
	         }
		catch(Exception e)
		{e.printStackTrace();}
	       finally{

	       }  

	      
	        	return ub;	 

	}

}
