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
<h1 style='color: black; text-align: center;'>CANCEL BOOKING</h1></br>
<h2 style='color: black; text-align: center; font-size:"2"'>PLS PROVIDE YOUR CORRECT BOOKING ID</h2>
<form action="./controller/cancelbooking">

<br>    <label for="bookingId">Booking Id:</label>
        <input type="text" name="bookingId" placeholder=yyyymmddhallid1/2><br>
        
<br><br><br><br>
                		
<br>    <input type="submit" value="Cancel Booking">
</form>
</body>
</html>