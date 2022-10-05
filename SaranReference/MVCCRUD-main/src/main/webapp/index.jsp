<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>


	<h2 align="center">Product Database Management System Login</h2>
	<br />
	<form style=text-align:center action="ControllerServlet" method="post">
		Name:<input type="text" name="name"><br> Password:<input
			type="password" name="password"><br> <input
			type="submit" value="login">
	</form>

</body>


</html>
