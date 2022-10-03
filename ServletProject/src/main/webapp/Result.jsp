<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details - Result</title>
</head>
<body>

	<h2>Employee Details</h2>

	<form>
		<input type="hidden" name="eno"
			value="<%=request.getParameter("eno")%>">

		<table>
			<tr>
				<td>Employee ID:</td>
				<td><%=request.getParameter("eno")%></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><%=request.getParameter("ename")%></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><%=request.getParameter("esal")%></td>
			</tr>
			<tr />
		</table>
		<br />
	</form>
	<br />
	<input type="button" value="Update data" onclick="update()" />
	<br />
	<input type="button" value="Return to Home"
		onclick="window.location.href='Welcome.jsp'" />

</body>

<script type="text/javascript">
	function update() {
		var eno = document.forms[0].elements['eno'].value;
		window.location.href = "Update.jsp?eno=" + eno;
	}
</script>
</html>
