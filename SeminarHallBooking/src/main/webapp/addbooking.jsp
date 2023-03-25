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
<h1 style='color: black; text-align: center;'>BOOK YOUR HALL</h1>
<table border='1' align="center">
				<caption>Hall Details</caption>
				<tr>
					<th>HALL ID</th>
					<th>HALL NAME</th>
					<th>DEPARTMENT</th>
					<th>SEATING CAPACITY</th>
				</tr>
				<tr>
					<td>1</td>
					<td>FPE01</td>
					<td>FPE</td>	
					<td>500</td>
				</tr>
				<tr>
					<td>2</td>
					<td>FPE02</td>
					<td>FPE</td>	
					<td>100</td>
				</tr>
				<tr>
					<td>3</td>
					<td>FPE03</td>
					<td>FPE</td>	
					<td>300</td>
				</tr>
				<tr>
					<td>4</td>
					<td>EEE01</td>
					<td>EEE</td>	
					<td>200</td>
				</tr>
				<tr>
					<td>5</td>
					<td>EEE02</td>
					<td>EEE</td>	
					<td>150</td>
				</tr>	
</table><br><br>
<h2 style='color: black; text-align:left; font-size:"1"'>PLS PROVIDE YOUR DETAILS CORRECTLY AS SPECIFIED</h2>
<form action="./controller/addbooking">
	
	    <label for="bookingId">Booking Id:</label>
        <input type="text" name="bookingId" placeholder=yyyymmddhallid1/2><br>
        
<br> 	<label for="userEmail"> Email ID: </label> <input type="text"
		 name="userEmail"  value=" ${mail}" required><br>
		
<br> 	<label for="hallId">Hall ID:</label>
		<select name="hallId"> 
		<option>1</option>
        <option>2</option>
        <option>3</option>
        <option>4</option>
        <option>5</option>
        </select> <br>

<br>    <label for="username">Name:</label>
        <input type="text" name="username" placeholder="Name"><br>
        
<br>    <label for="department">Department:</label>
        <input type="text" name="department" placeholder="Department"><br>

<br>    <label for="bookingDate">Booking Date:</label>
        <input type="date" name="bookingDate" placeholder="dd-MM-yyyy"> <br>
		 
<br>	<label for="bookingSlot">Booking Slot:</label>
        <select name="bookingSlot"> 
        <option value="Forenoon">Forenoon</option>
        <option value="Afternoon">Afternoon</option>
        </select> <br>
        
<br>    <label for="purpose">Purpose:</label>
        <input type="text" name="purpose"> <br><br><br><br>
                		
<br>    <input type="submit" value="Book">

</form>
</body>
</html>