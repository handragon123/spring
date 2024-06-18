<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>       
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book/update.jsp</title>
</head>
<body>
<h1>Book Update</h1>
<form method="post">
	<input type="hidden" name="book_id" value="${book.book_id }">
	<p>title : <input type="text" name="title" value="${book.title }"></p>
	<p>category : <input type="text" name="category" value="${book.category }"></p>
	<p>price : <input type="text" name="price" value="${book.price }"></p>
	<p><input type="submit" value="submit"></p>
</form>
</body>
</html>