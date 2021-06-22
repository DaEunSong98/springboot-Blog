<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=1>
<tr>
	<td>번호</td> <td>${dto.idx }</td>
</tr>	
<tr>	
	<td>제목</td> <td>${dto.title}</td>
</tr>
<tr>
	<td>내용</td> <td>${dto.contents }</td>
</tr>
</table>


	<a href="update?idx=${dto.idx}">수정하기</a>
	<a href="delete?idx=${dto.idx}">삭제하기</a>
</body>
</html>