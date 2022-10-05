<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details - Result</title>
</head>
<body>

	<h2>Product Details</h2>

	<form>
		<input type="hidden" name="prdNum"
			value="<%=request.getParameter("prdNum")%>">

		<table>
			<tr>
				<td>Product Number:</td>
				<td><%=request.getParameter("prdNum")%></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><%=request.getParameter("prdName")%></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><%=request.getParameter("prdPrice")%></td>
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
		var prdNum = document.forms[0].elements['prdNum'].value;
		window.location.href = "Update.jsp?prdNum=" + prdNum;
	}
</script>
</html>
