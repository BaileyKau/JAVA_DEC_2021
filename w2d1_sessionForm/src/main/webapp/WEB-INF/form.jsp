<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Login</h3>
    <p>
    	${ageErr }
    </p>
    <form action='/login' method='POST'>
		<label>Email:</label>
	    	<input type="text" name='email'>
		<label>Password:</label>
	    	<input type='password' name='password'>
	    	<input type='submit' value='login'>
	    	<br />
	    	age: <input type="number" name="age"/>
    </form>
    
</body>
</html>