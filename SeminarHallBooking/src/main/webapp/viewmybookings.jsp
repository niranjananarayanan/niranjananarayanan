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
<h1 style='color: black; text-align: center;'>VIEW BOOKING</h1></br>
<h2 style='color: black; text-align: center; font-size:"2"'>PLS PROVIDE YOUR DETAILS CORRECTLY AS SPECIFIED</h2>
<form action="./controller/viewmybookings">
 <br> 	<label for="mail"> Email ID: </label> <input type="text"
		 name="mail"  value=" ${mail}" required><br>       
<br><br><br><br>
                		
<br>    <input type="submit" value="View Bookings">
</form>
</body>
</html>