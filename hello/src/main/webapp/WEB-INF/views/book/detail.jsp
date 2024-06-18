<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book/detail.jsp</title>
</head>
<body>
<h1>Book Detail</h1>
	<p>title : ${book.title } </p>
	<p>category : ${book.category }</p>
	<p>price : ${book.price }</p>
	<p>
	<a href="update?book_id=${book.book_id }">[수정]</a> 
	<a href="delete?book_id=${book.book_id }">[삭제]</a> 
	<a href="listJstl">[List Jstl]</a> 
	</p>
</body>
</html>