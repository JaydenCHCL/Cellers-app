<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

	<h2 align="center">Welcome to Product Database Management System</h2>
	<table align="center">

		<tr>
			<td>To add product into the Database:</td>
			<td><input type="button" value="Add Product"
				onclick="window.location.href='Insert.jsp'" /></td>
		</tr>
		<tr>
			<td>To delete product from the Database:</td>
			<td><input type="button" value="Delete Product"
				onclick="window.location.href='Delete.jsp'" /></td>
		</tr>
		<tr>
			<td>To view product details from the Database:</td>
			<td><input type="button" value="View Product"
				onclick="window.location.href='Select.jsp'" /></td>
		</tr>
		<tr>
			<td>To logout of the Database:</td>
			<td><input type="button" value="Logout"
				onclick="window.location.href='index.jsp'" /></td>
		</tr>
	</table>

</body>


</html>
