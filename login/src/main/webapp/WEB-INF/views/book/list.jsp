<%@page import="com.hello.web.dto.BookDTO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<BookDTO> list = (List<BookDTO>)request.getAttribute("list");
%>
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
<%for(BookDTO book : list) {%>
<tr>
<td><%=book.getBook_id() %></td>
<td><%=book.getTitle() %></td>
<td><%=book.getPrice() %></td>
<td><%=book.getInsert_date() %></td>
</tr>
<%} %>
</table>
</body>
</html>









