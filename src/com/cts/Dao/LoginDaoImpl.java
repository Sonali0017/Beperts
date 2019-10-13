package com.cts.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.Util.DBConnection;
import com.cts.bean.LoginBean;
import com.cts.bean.RegisterBean;


public class LoginDaoImpl implements LoginDao{
    public boolean validateUser(LoginBean bean) {
        // TODO Auto-generated method stub
        Connection connection = null;
        System.out.println("asd");
       String query = "select username, password from login where username=? and password=?";
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        
        
        try {
                        connection = (Connection) DBConnection.getConnection();
                        preparedStatement = ((java.sql.Connection) connection).prepareStatement(query);
                        preparedStatement.setString(1, bean.getUserName());
                        preparedStatement.setString(2, bean.getPassword());
                        resultSet = preparedStatement.executeQuery();
                        System.out.println(" resultset "+resultSet);
                        if(resultSet.next()) {
                                        return true;
                        }
                        else return false;
        } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
        }
        finally {
                        DBConnection.closeConnection(connection);
        }
        
        return false;
}
    
   
   public String insertLogin(LoginBean bean) {
          // TODO Auto-generated method stub
          Connection connection = null;
          PreparedStatement preparedStatement = null;
          String query = "insert into login (username,password,usertype) values(?,?,?)";
          
          try {
                 connection = DBConnection.getConnection();
                 preparedStatement = connection.prepareStatement(query);
                 preparedStatement.setString(1, bean.getUserName());
                 preparedStatement.setString(2, bean.getPassword());
                 preparedStatement.setString(3, bean.getUserType());
                 preparedStatement.executeUpdate();
                 return "success";
          } catch (SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 return "fail";
          }
          finally {
                 DBConnection.closeConnection(connection);
          }
          
   }

  
   public String getUserType(String username) {
          // TODO Auto-generated method stub
          Connection connection = null;
          PreparedStatement preparedStatement = null;
          String query = "select usertype from login where username=?";
          ResultSet resultSet = null;
          
          
          try {
                 connection = DBConnection.getConnection();
                 preparedStatement = connection.prepareStatement(query);
                 
                 preparedStatement.setString(1,username);
                 
                 resultSet = preparedStatement.executeQuery();
                 
                 if(resultSet.next()){
                        String res =  resultSet.getString(1);
                        System.out.println(res);
                        return res;
                 }
                 else {
                        
                        System.out.println(resultSet!=null);
                        return "";}
                 
          } catch (SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                 return "fail";
          }
          finally {
                 DBConnection.closeConnection(connection);
          }
          
   
   
   
          
          
   }



}
