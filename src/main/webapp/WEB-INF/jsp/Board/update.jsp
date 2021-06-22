<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="update" method="post">
<input type="hidden" name="idx" value="${dto.idx}">
<table border=1>
<tr>
	<td>번호</td> <td>${dto.idx }</td>
</tr>	
<tr>	
	<td>제목</td> <td><input type="text" name="title" value="${dto.title}"/></td>
</tr>
<tr>
	<td>내용</td> <td><input type="text" name="contents" value="${dto.contents}"/></td>
</tr>
</table>
<input type="submit" value="수정하기"/>


</form>

</body>
</html>