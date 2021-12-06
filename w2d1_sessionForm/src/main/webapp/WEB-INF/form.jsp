<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<style>
	p {
		color: red
	}
</style>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h3>Login</h3>
    <p>hello</p>
    <p>
    	${ageErr }
    </p>
    <form action='/login' method='POST'>
		<label>Email:</label>
	    	<input type="text" name='email'>
		<label>Password:</label>
	    	<input type='password' name='password'>
	    	age: <input type="number" name="age"/>
	    	<br />
	    	<input type='submit' value='login'>
    </form>
    
</body>
</html>