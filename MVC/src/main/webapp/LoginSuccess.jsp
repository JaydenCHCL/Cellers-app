<%@ page language="java"
	import="com.cellers.mvcCrudAssignment.LoginBean"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Login Success</title>
</head>
<body>
	<h2 align="center">You are successfully logged in!</h2>
	<h2 align="center">
		<%
			LoginBean bean = (LoginBean) request.getAttribute("bean");
			out.print("Welcome, " + bean.getName());
		%>
	</h2>
	<table align="center">
		<tr>
			<td>Continue to Database:</td>
			<td><input type="button" value="Continue"
				onclick="window.location.href='Welcome.jsp'" /></td>
		</tr>
		<tr>
			<td>Logout of the Database:</td>
			<td><input type="button" value="Logout"
				onclick="window.location.href='index.jsp'" /></td>
		</tr>
	</table>
</body>
</html>