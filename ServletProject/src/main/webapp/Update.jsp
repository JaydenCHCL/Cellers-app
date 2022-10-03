<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html  PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Details</title>
</head>
<body>

	<h2>Update Employee Information</h2>

	<form action="./Update" method="post">
		<table>
			<tr>
				<td>ID:</td>
				<td><input type="text" name="eno"
					value="<%=request.getParameter("eno")%>" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="ename" maxlength="30" size="25" /></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><input type="text" name="esal" maxlength="10" size="11" /></td>
			</tr>
			<tr />
		</table>
		<br /> <input type="submit" value="Update Data" />
	</form>
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='Welcome.jsp'" />

</body>
</html>
