<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert Details</title>
</head>
<body>

	<h2>Add New Employee</h2>

	<form action="./Insert" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="eno" maxlength="6" size="7" /></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="ename" maxlength="30" size="25" /></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="esal" maxlength="6" size="35" /></td>
			</tr>
			<tr />
		</table>
		<br /> <input type="submit" value="Insert Data" />

	</form>
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='Welcome.jsp'" />


</body>

</html>
