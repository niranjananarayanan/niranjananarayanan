<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix='c'%>  
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Profile details</title>
</head>
<%
response.setHeader("Cache-Control", "no-cache,no-store,must-revalidate");
if(session.getAttribute("mail")==null)
	response.sendRedirect("./index.html");
%>
<body bgcolor="lightyellow">
<h1 style='color: black; text-align: center;'>USER DETAILS</h1></br>
<br/>
	<c:choose>
		<c:when test="${user ne null || ! empty user}">
			<table border='1' align="center">
				<caption>User Details of Specified College Id</caption>
				<tr>
					<th>ID</th>
					<th>NAME</th>
					<th>DEPARTMENT</th>
					<th>BATCH</th>
					<th>EMAIL</th>
				</tr>
				<tr>
					<td>${user.id}</td>
					<td>${user.name}</td>
					<td>${user.department}</td>
					<td>${user.batch}</td>
					<td>${user.email}</td>
				</tr>	
			</table>
		</c:when>
		<c:otherwise>
			<h1 style='color:red; text-align: center;'>NO DETAILS FOUND </br>Inappropriate id </h1>
		</c:otherwise>
	</c:choose>	
<br/>
<br/>
<br/>	
<p>Logout<a href="logout.html">Log out</a></p>
<p>Index Page<a href="/index.html">Index Page</a></p>	
</body>
</html>