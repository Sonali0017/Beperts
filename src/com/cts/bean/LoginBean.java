package com.cts.bean;
public class LoginBean 
	{
	       private String username;
	       private String password;
	       private String userType;
	       
	       
	       public String getUserName() 
	       {
	              return username;
	       }
	       public void setUserName(String username) 
	       {
	              this.username = username;
	       }      
	       
	       
	       
	       public String getPassword() 
	       {
	              return password;
	       }
	       
	       
	       
	       
	       
	       
	       
	       @Override
	       public int hashCode() {
	              final int prime = 31;
	              int result = 1;
	              result = prime * result + ((username == null) ? 0 : username.hashCode());
	              result = prime * result + ((password == null) ? 0 : password.hashCode());
	              return result;
	       }
	       @Override
	       public boolean equals(Object obj) {
	              if (this == obj)
	                     return true;
	              if (obj == null)
	                     return false;
	              if (getClass() != obj.getClass())
	                     return false;
	              LoginBean other = (LoginBean) obj;
	              if (password == null) {
	                     if (other.password != null)
	                           return false;
	              } else if (!password.equals(other.password))
	                     return false;
	              if (username == null) {
	                     if (other.username != null)
	                           return false;
	              } else if (!username.equals(other.username))
	                     return false;
	              return true;
	       }
	       public String toString() {
	              return "LoginBean [username=" + username + ", password=" + password + "]";
	       }
	       public void setPassword(String password)
	       {
	              this.password=password;
	       
	       
	       }
	       public String getUserType() {
	              return userType;
	       }
	       public void setUserType(String userType) {
	              this.userType = userType;
	       }
	       
	}



