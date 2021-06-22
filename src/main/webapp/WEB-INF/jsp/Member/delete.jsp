<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="delete" method="post">
	<input type="text" name="pw" placeholder="패스워드"><br>
	<input type="text" name="pw_check" placeholder="패스워드 확인"><br>
	<input type="submit" value="회원 탈퇴">
	
	<input type="button" value="취소" onclick="javascript:location.href='index';">
</form>


</body>
</html>