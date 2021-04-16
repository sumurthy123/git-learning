<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
body{
background-image: url("https://i0.wp.com/post.healthline.com/wp-content/uploads/2020/01/268453-Best_Running_Shoes_for_Flat_Feet-1296x728-header-1296x728.jpg?w=1155&h=1528");
background-repeat: no-repeat;
background-size:100%;

}
h2{
color: red;
}

</style>
<center>
<body>
<h1>Enter the admin details for login</h1>
<form action="adminform">
Enter admin name: <input type="text" name="name"><br/><br/>
Enter  password:  <input type="password" name="password"><br/>
<br/>

<button name="action" value="Submit">SUBMIT</button>
</form>
<h2>${msg }</h2>
</body>
</center>
</html>