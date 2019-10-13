<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bepert's</title>
</head>
<style>
table {
  font-family: arial, sans-serif;
  width: 50%;
  margin-left:180px;
  margin-top:60px;
  background-color:none;
  
}

td, th {
  border: 0px solid gray;
  text-align: right;
  padding: 20px;
  background-color:none;
}

tr:nth-child(even) {
  background-color:none;
}

.button {
  display: inline-block;
  padding: 2px 20px;
  font-size: 24px;
  cursor: pointer;
  text-align: right;
  text-decoration: none;
  outline: none;
  color: #fff;
  background-color: BLACK;
  border: none;
  border-radius: 15px;
  box-shadow: 0 9px #999;
}

.button:hover {background-color:light black}

.button:active {
  background-color:gray;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

body {
background-color:none;
}

.navbar {
  width: 100%;
  background-color:black;
  overflow: auto;
  position:fixed;
  margin-top:0px;
}

.navbar a {
  float:left;
  padding: 10px;
  color: white;
  text-decoration: none;
  font-size: 17px;
}
.navbar a:hover {
  background-color: #000;
}

</style>

<body background="https://www.pixelstalk.net/wp-content/uploads/2016/10/Blurry-abstract-backgrounds-hd.jpg">

<div class="navbar">

  <a class="active" href="index.jsp"><i class="fa fa-fw fa-home"></i>HOME</a>  
  <a href="profile.html"><i class="fa fa-fw fa-user"></i> PROFILE </a>

</div>
<br>
<%-- <h1 align="center">${courses}
  Courses we offer !</h1> --%>

<table>
  <tr>
    <th>NAMES</th>
    <th>TO LEARN..</th>
    
  </tr>
  <tr>
    <td><img src="https://academy.oracle.com/en/oa-assets/i/c82/c82-java-fund-logo.jpg" height=180px; width=200px;></td>
    <td><a href="./java/home1.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
  
  <tr>
    <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTmIe64l5vYGU271Q8uTsH02JpHN4URpgpex46tZZo0jyICQiP8Tw" height=180px; width=200px;></td>
    <td><a href="./xml files/home1.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>

  <tr>
    <td><img src="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAMgAAADICAMAAACahl6sAAAAvVBMVEX///9FaIY2cKH/00s2dqv/yz02a5j/yTg2bZw2d63/0EY2cqT/11L2+Pv/zD42bp7t8fSDm65BY4CTqLne5OqQsMudsL9depL/6Kb//fdAd6f0y1jvw0U0caV0jaP/+uyqusi2w8/+4ZDvwUH/8cb/2Wv/1VpUcozG0NrW3uVVh7Cmw9rvyUv/7bi8yNNWc46InrLL3ev71XD/5Z782Xt7pMdbhKiBo7/vvTP84YVslbuvxdn/9d3O199ngppaV4JqAAAEBklEQVR4nO2be3eaMByGE9dpHcWiZfS2ofY6a+fabd2ta7//x1oSQIkEBmynv4TzPn8UwsXzPuYKpzIGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAUIkvoM7wbwReb7/X2xfsKvoBdaI2LHue15PkRPr9b9SxGuNJiiL9PnWwppSKhNTJmrEvNE7ChZd45EUcqxJZH3K7LNRI/zt1tkYIjwe1UxTpOzUWC5EbufU7IFLWtNwT8cKFYdRyUcQ4/EKEhs6IvNVwWERn1zmRxc3NiYHtGjlNmFLHLeN+J8XzqvvIaPRaMBgM7FR5GA6bigyOqUMbWA6NIoXVrybylTq1gWEbkQF16iI77UTOqHMXGLYTsa5KHrsisiwTKY5aTBOxbQQe1ha5Z9O8yEfq5FvUF2HsPC/ymTr5FrVFfFkhORHbOkldEZ+djXSRL9TRdUpF9FErkD1dF7FsJjGI3Juum44cE+mZLjr+PRo5JiJfat3u7e29SnmT4ZoIY3sK10Ue2bS2yBF1dB2lsRbJKqSOCHXyLTSRX+yotohtM/syJ+IFWYXUELFt0ejnRN6zBiLUwQt0RmSnncgFde4CQTsR6tgGdtqIWLb0TbhvLvKDOrOZk8Yito29GcFDsoDfFrmVvMtzLjiljlsHXYQ6zT+gixxpUGdrRFUfsfENfCkQsQ2TyOXx9KwLIlfy+GUHRNRL3ilEiPhZFFHT4tVoZN/CvRJDZ7+aXlyKzk6drCllw69TDUtxYRI5p07VhqOiyC11ppZMT29zIqfutSpgN0+H1An+DwHn1BH+D10ScfIHMBsOJmrjvIjPuyfiwv+VlpMTIU5SiyDYtBv9i68SCUL9F0r5T6FgzhVzVeA8nfhE8lD+UaQiE7n/lN72nJ3SPmXy0unXjDm/9lVQZaKL+DNxejabs1Rpvoo5X8nT4URlPkxNhOJMbCLxYQQOiuxLPeB8wbZFZNPiWTH5ttMLJsnlohglV81YevjDy2XX4Hyc7XBmEln3kQ/ZTqSSj7Pi3UZX7hy8YPg8a5H4byLrG6Ls4qTIcyLMApFQTXk1RTa9/NA6kUB11MYisRoUbBSJ18VaImqQsEokTEWek2IDEcua1kyNSxXD7/qGSA2zaTG2TmSiloXrubm6RiKLR61sHkkjVYuIv5+yom+LSNKWVkldTLLFVFTZtHILgpjZIqIGqjgbroRJ7PtjeThMzqvj2yLsLq1AVWF2iIwjtSBcpQcOVSnyUxF2vVn9pjcoEfakrktiWyJiPL7JVk5g00NjmYgjj4QbOi/yqSMi8+zZ1xkMIv7ijrtWH3LeKIjIp1rHqkMQLAoicbxy+60iAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAOgUfwBu2nV5AHIV1wAAAABJRU5ErkJggg==" height=180px; width=200px;></td>
    <td><a href="./python/home.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
    
    <tr>
    <td><img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQAWf5K4aUHxikCdVwfmRtjY8-2udSQv3KPkTkhna58sSiSLx91" height=180px; width=200px;></td>
    <td><a href="Android.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
    
     <tr>
    <td><img src="http://www.sclance.com/pngs/php-logo-png/php_logo_png_1020282.png" height=180px; width=200px;></td>
    <td><a href="PHP.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
    
     <tr>
    <td><img src="http://www.cuetin.com/assets/inner-pages/spring.jpg" height=180px; width=200px;></td>
    <td><a href="Spring.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
    
     <tr>
    <td><img src="data:image/png;base64,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" height=180px; width=200px;></td>
    <td><a href="HTML.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
    
     <tr>
    <td><img src="https://i0.wp.com/www.tvivu.com/wp-content/uploads/2017/01/9299-css-logo1-200x200.png?resize=200%2C200" height=180px; width=200px;></td>
    <td><a href="CSS.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
    
<c:forEach  var="subject"  items="${courses}">
  <tr>
    <td>${subject.skillname}</td>
    <td><a href="CSS.html"> <button class="button" style="vertical-align:middle"><span>Start</span></button></a></td>
    </tr>
                       </c:forEach>                                

 
</table>
</body>
</html>