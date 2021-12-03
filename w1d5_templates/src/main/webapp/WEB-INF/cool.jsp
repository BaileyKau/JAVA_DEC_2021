<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>hello</title>
</head>
<body>
	<h1>hello world!!</h1>
	<hr />
	<p>${myKey}</p>
	<p><c:out value="${myKey}"/></p>
	<p>
		the num is
		<c:out value="${num }" />
	</p>
</body>
</html>