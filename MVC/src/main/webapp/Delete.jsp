<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Details</title>
</head>
<body>

<h2>Delete Existing Product</h2>

	<form action="./Delete" method="post">
		<table>
			<tr>
				<td>Enter Product Number:</td>
				<td><input type="text" name="prdNum" maxlength="6" size="7" /></td>
			</tr>

		</table>
		<br /> <input type="submit" value="Delete Data" />
	</form>
	<br />

	<input type="button" value="Return to Home"
		onclick="window.location.href='Welcome.jsp'" />

</body>

</html>