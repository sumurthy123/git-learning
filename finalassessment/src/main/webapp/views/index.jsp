<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sportyshoe.com</title>
<style>
body{
background-image: url("https://i0.wp.com/post.healthline.com/wp-content/uploads/2020/01/268453-Best_Running_Shoes_for_Flat_Feet-1296x728-header-1296x728.jpg?w=1155&h=1528");
background-repeat: no-repeat;
background-size:100%;

}

h1{
color:black;
text-align:center;
font-size: 85px;
}

form{
text-align:center;

}
h2{
text-align: center;
color: red;
}
</style>
</head>
<body>
<h1>Welcome to SportyShoes</h1><br/>
<br/>
<form  action="LoginSignupProcess">
<button name="action" value="login">Login</button><br/>
<br/>



<button name="action" value="signup">Signup</button>
</form>
<h2>${msg }</h2>


</body>
</html>