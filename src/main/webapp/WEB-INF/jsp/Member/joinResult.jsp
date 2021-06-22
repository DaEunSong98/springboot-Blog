<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<c:choose>
	<c:when test="${ret == 1}">
		<script>
			alert('회원 가입 성공였습니다.');
			location.href='home';
		</script>
	</c:when>
	<c:otherwise>
		<script>
			alert('아이디가 중복됩니다. ');
			location.href='join';
		</script>
	</c:otherwise>
</c:choose>
</body>
</html>