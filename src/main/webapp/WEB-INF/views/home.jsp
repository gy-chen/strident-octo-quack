<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@ page isELIgnored="false" %>
<html>
	<head>
		<title>Hello</title>
	</head>
	<body>
		<h1>Hello ${yourname}!</h1>
		<form method="POST" action="<s:url value="/" />">
			<label>Your Name: <input type="text" name="yourname" /></label>
			<input type="submit" />
		</form>
	</body>
</html>