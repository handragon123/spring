<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<Map<String, Object>> list = (List<Map<String, Object>>)request.getAttribute("list");
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
<%for(Map<String, Object> book :list) {%>
<tr>
<td><%=book.get("book_id") %></td>
<td><%=book.get("title") %></td>
<td><%=book.get("price") %></td>
<td><%=book.get("insert_date") %></td>
</tr>
<%} %>
</table>
</body>
</html>









