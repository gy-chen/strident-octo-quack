<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<title>Hello</title>
</head>
<body>
	<h1>Hello ${yourname}!</h1>
	<form method="POST" action="<s:url value="/" />"
		enctype="multipart/form-data">
		<label>Your Name: <input type="text" name="yourname" /></label><br />
		<label>Your Image: <input type="file" name="yourimage" /></label><br />
		<input type="submit" />
	</form>
	<%
		if (request.getAttribute("yourimage") != null) {
	%>
	<div>
	  <p>File name: ${yourimage.getSubmittedFileName()}</p>
	  <p>File size: ${yourimage.getSize()}</p>
	</div>
	<%
		}
	%>
</body>
</html>