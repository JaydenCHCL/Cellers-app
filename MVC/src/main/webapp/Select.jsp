<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Details</title>
</head>
<body>

	<form action="./Select" method="get">
		<table>
			<tr>
				<td>Enter Product Number:</td>
				<td><input type="text" name="prdNum" maxlength="6" size="7" /></td>
			</tr>

		</table>
		<br /> <input type="submit" value="View Data" />
	</form>
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='Welcome.jsp'" />

</body>

</html>
