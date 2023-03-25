<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("mail")==null)
	response.sendRedirect("./index.html");
%>
<body bgcolor="lightyellow">
<h1 style='color: black; text-align: center;'>VIEW PROFILE</h1></br>
<h2 style='color: black; text-align: center; font-size:"2"'>PLS PROVIDE DETAILS CORRECTLY AS SPECIFIED</h2>
<form action="./controller/viewmyprofile">
<br> <label for="id"> Id </label> <input type="number"
			 name="id" placeholder="Enter College Id"  required><br>
	     
<br> 		
<br>    <input type="submit" value="view Profile">
</form>
</body>
</html>