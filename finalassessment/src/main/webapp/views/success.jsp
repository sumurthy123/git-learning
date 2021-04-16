<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
button{
font-size: 40px;
padding:10px;
border-radius: 10px;
margin:20px;
width:400px;
height:200px;
background-color:silver;

}
h1{
text-align: center;
font-size: 40px;
}
body{
background-image: url("https://i0.wp.com/post.healthline.com/wp-content/uploads/2020/01/268453-Best_Running_Shoes_for_Flat_Feet-1296x728-header-1296x728.jpg?w=1155&h=1528");
background-repeat: no-repeat;
background-size:100%;

}
</style>
</head>
<body>
<h1>Choose Options</h1><br/>
<br/>
<form action="aftersuccess">
<button id="btn" name="action" value="casual">CASUAL</button>
<button id="btntwo" name="action" value="party">PARTY</button>
<button id="btnthree"name="action" value="retro">RETRO</button><br/><br/>
<button id="btnfour"name="action" value="formal">FORMAL</button>
<button id="btnfive"name="action" value="trendy">TRENDY</button>
<button id="btnsix"name="action" value="fancy">FANCY</button>
</form>


</body>
</html>