<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/create.jsp</title>
</head>
<body>
<h1>Member Create</h1>
<h2>Status: ${status }</h2>
<form method="post">
	<p>id : <input type="text" name="id"></p>
	<p>pw : <input type="text" name="pw"></p>
	<p>name : <input type="text" name="name"></p>
	<p>age : <input type="text" name="age"></p>
	<p><input type="submit" value="submit"></p>
</form>
</body>
</html>