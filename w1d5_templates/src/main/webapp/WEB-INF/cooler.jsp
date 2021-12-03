<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>cooler</title>
</head>
<body>
	<h3>Cooler.jsp</h3>
		<p><c:out value="${dojosArray}"/></p>
		<hr/>
		the size of the array is <c:out value="${dojosArray.size()}"/>
		
		<c:forEach items="${dojosArray }" var="dojo">
			<li>
				<c:out value="${dojo }"/>
			</li>
		
		</c:forEach>
</body>
</html>