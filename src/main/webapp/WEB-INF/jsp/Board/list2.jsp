<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
 <html lang="ko" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>게시글 목록 </h2>
<table border=1>
<tr th:if="${lists.size(list)}!=0" th:each="list:${list}">
<td th:number="${list.idx}"></td>
<td th:text="${list.title}"></td>
<td th:text="${list.writer}"></td>
</tr>

<tr th:unless="${lists.size(size)}>0">
<td colspan="4">조회된 결과가 없습니다 </td>
</tr>

</table>

<a href="insert">글쓰기</a>

</body>
</html>