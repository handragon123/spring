<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
</head>
<body>
<h1>JOIN </h1>>
<form method="post">
	<p>id: <input type="text" name="id"></p>>
	<p>pw: <input type="text" name="password"></p>
	<p>name: <input type="text" name="name"></p>
	<p>role: 
	<input type="radio" name="role" value="User" checked="checked">User
	<input type="radio" name="role" value="Admin">Admin<br>
	<input type="submit" value="Submit">
</form>
</body>
</html>