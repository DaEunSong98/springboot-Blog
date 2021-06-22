<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>회원 정보 수정</h2>
		<form action="update" method="post">
			아이디: ${member.id}<br>
			패스워드: <input type="password" name="pw" value="패스워드"/><br>	
			이름: <input type="text" name="name" value="${member.name}"/><br>	
			이메일: <input type="text" name="email" value="${member.email}"><br>	
			주소: <input type="text" name="address" value="${member.address} "><br>	
	 		전화번호: <input type="text" name="mobile" value="${member.mobile }"  ><br>
	 		
	 		
			<input type="submit" value="수정완료">
			<input type="button" value="취소" onclick="javascript:location.href='home';">
		</form>
		
</body>
</html>