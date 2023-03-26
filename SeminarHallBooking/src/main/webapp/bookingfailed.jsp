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
if(session.getAttribute("bookingId")==null && session.getAttribute("mail")==null  )
	response.sendRedirect("./index.html");
%>

<body bgcolor="lightyellow">
	<h1 style='color: rgb(255, 0, 0); text-align: center;'>BOOKING FAILED</h1>
	
<form action="./controller/addstatus" method="post">
<br> 	<label for="userEmail"> Email ID: </label> <input type="text"
		 name="userEmail"  value=" ${mail}" required><br>
<br> 	<label for="bookingId"> Booking ID: </label> <input type="text"
		 name="bookingId"  value=" ${bookingId}" required><br>
<br>    <label for="status">Status:</label>
		<select name="status"> 
		<option value="BOOKING UNSUCCESFULL">BOOKING UNSUCCESFULL</option>
        </select> <br>       
<br>    <input type="submit" value="Add Status">   
</form>  <br>     	
<p>Booking Page<a href="../addbooking.jsp">Booking Page</a></p>		
<p>Login<a href="../login.html">Log in</a></p>
<p>Home Page<a href="../index.html">Home page</a></p>	
</body>
</html>