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
{
	response.sendRedirect("index.html");
}

%>
<frameset rows="25%,65%,10%">
	<frame src="header.html"/>
    <frameset cols="25%,75%">
		<frame src="adminmenu.html"/>
		<frame src="welcome.html"/>
	</frameset>	
	<frame src="footer.html"/>
</frameset>
</html>