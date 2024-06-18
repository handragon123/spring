<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>member/list.jsp</title>
</head>
<body>
<h1>Member List</h1>
<hr>
<table border="1">
<tr><th>id</th><th>pw</th><th>name</th><th>age</th></tr>
<c:forEach var="member" items="${list}">
<tr>
<td><a href="detail?id=${member.id} ">${member.id}</a></td>
<td>${member.pw}</td>
<td>${member.name}</td>
<td>${member.age}</td>
</tr>
</c:forEach>
</table>
<p>
<a href="../">Home</a>
<a href="create">Create</a>
<c:if test="${id == null }">
<a href="login">Login</a>
</c:if>
<c:if test="${id != null }">
${id }(${name })
<a href="logout">Logout</a>
</c:if>
</p>
</body>
</html>









