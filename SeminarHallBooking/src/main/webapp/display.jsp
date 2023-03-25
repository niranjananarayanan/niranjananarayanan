<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix='c'%>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Booking details</title>
</head>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("mail")==null)
	response.sendRedirect("./index.html");
%>
<body bgcolor="lightyellow">
<h1 style='color: black; text-align: center;'>BOOKING DETAILS</h1></br>
<br/>
	<c:choose>
		<c:when test="${booking ne null || ! empty booking}">
			<table border='1' align="center">
				<caption>Booking Details </caption>
				<tr>
					<th>BOOKING ID</th>
					<th>HALL ID</th>
					<th>BOOKING DATE</th>
					<th>BOOKING SLOT</th>
					<th>NAME</th>
					<th>DEPARTMENT</th>
					<th>EMAIL</th>
					<th>PURPOSE</th>
				</tr>
				<tr>
					<td>${booking.bookingId}</td>
					<td>${booking.hallId}</td>
					<td>${booking.bookingDate}</td>
					<td>${booking.bookingSlot}</td>
					<td>${booking.username}</td>
					<td>${booking.department }</td>
					<td>${booking.userEmail}</td>					
					<td>${booking.purpose }</td>
				</tr>	
			</table>
		</c:when>
		<c:otherwise>
			<h1 style='color:red; text-align: center;'>NO DETAILS FOUND </h1>
		</c:otherwise>
	</c:choose>	
<br/>
<br/>
<br/>	
<p>Logout<a href="logout.html">Log out</a></p>
<p>Booking Page<a href="/addbooking.jsp">Booking Page</a></p>	
</body>
</html>