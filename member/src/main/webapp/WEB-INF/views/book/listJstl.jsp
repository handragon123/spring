<%@page import="com.hello.web.dto.BookDTO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>book/list.jsp</title>
</head>
<body>
<h1>Book List</h1>
<hr>
<table border="1">
<tr><th>book_id</th><th>title</th><th>price</th><th>insert_date</th></tr>
<c:forEach var="book" items="${list}">
<tr>
<td>${book.book_id}</td>
<td><a href="detail?book_id=${book.book_id} ">${book.title}</a></td>
<td>${book.price}</td>
<td>${book.insert_date}</td>
</tr>
</c:forEach>
</table>
<p><a href="create">Create</a>
</body>
</html>









