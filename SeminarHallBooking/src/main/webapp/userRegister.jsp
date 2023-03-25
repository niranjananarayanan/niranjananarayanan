<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightyellow">
<form action="./register" method="post">

<br> <label for="id"> Id </label> <input type="number"
			 name="id" placeholder="Enter your College Id"  required><br>

<br> <label for="name"> Name </label> <input type="text"
			 name="name" placeholder="Name"  required><br>

<br> <label for="department"> Department </label> <input type="text"
			 name="department" placeholder="eg:FPE/EEE" required><br>

<br> <label for="batch"> Batch </label> <input type="text"
			 name="batch" placeholder="eg:2020-2024" required><br>
			
<br> <label for="email"> Email-id </label> <input type="text"
		 name="email" placeholder="Email-id " value=" ${email}" required><br>
		 
<br> <label for="password">Password</label> <input type="text"
		 name="password" placeholder="Password" required><br>
			
<br> <label for="password_confirm">Confirm Password:</label> <input type="password" 
			 name="password_confirm" required><br><br> 
			
<br> <input type="submit" value="Register">

</form>

</body>
</html>