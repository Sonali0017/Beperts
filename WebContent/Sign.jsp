<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>


<link rel="stylesheet" href="Sign.css">


</head>
<body background="data:image/jpeg;base64,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">

<div class="bg-img">



<div id="login-box">
  <div class="left">
    <h1>Sign up</h1>
    <form action="RegisterServlet" method="post">
    <input type="text" name="First_Name" placeholder="First name" required>
  
    
    <input type="text" name="Last_Name" placeholder="Last name" required>
     <input type="text" name="Age" placeholder="Age" required>
  <!--  <input type="text" name="Gender" placeholder="Gender" required> --> 
  


    <input type="text" name="MobileNumber" placeholder="Contact Number" required>
    <input type="text" name="username" placeholder="username" required>

    <input type="password" name="password" placeholder="Password" required>
    <input type="password" name="password1" placeholder="Retype password" required>
   
   <input type="text"  name="userType" placeholder="usertype" required>

    <input type="submit" name="signup_submit" value="Sign me up" />

  </div>
  
  <div class="right">
    <span class="loginwith">Sign in with<br />social network</span>
    
    <button class="social-signin facebook">Log in with facebook</button>
    <button class="social-signin twitter">Log in with Twitter</button>
    <button class="social-signin google">Log in with Google+</button>
  </div>
  <div class="or">OR</div>
</div>

</div>

</body>
</html>
