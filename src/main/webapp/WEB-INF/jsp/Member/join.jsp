<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<!-- 
<script type="text/javascript">
function joinCheck(){
	var $id=$("#id");
	var $pw=$("#pw");
	
	if($id.val().trim().length==0){
		alert('아이디를 입력하세요');
		$id.focus();
		return false;
	}
	
	if($pw.val().trim().length==0){
		alert('비밀번호를 입력하세요')
		$pw.focus();
		return false;
	}
	if(confirm("회원가입 하시겠습니까?")){
		alert("회원가입이 완료되었습니다.");
		$("form").submit();
	}
	return true;
}
	

</script>
 -->

<h2>회원가입</h2>

<form action="join" method="post"> <!-- 여기서의 form은 매핑 이름 -->
	<input type="text" name="id" placeholder="아이디" value="${dto.id}">
    ${valid_id}<br>    
	<input type="password" name="pw" placeholder="패스워드">
	${valid_pw}<br>
	<input type="password" name="pw_check" placeholder="패스워드 확인">
	${check}<br>
	<input type="text" name="name" placeholder="이름" value="${dto.name}">	
	${valid_name}<br>
	<input type="text" name="email" placeholder="이메일" value="${dto.email}">
	${valid_email}<br>	
	<input type="text" name="mobile" placeholder="전화번호" value="${dto.mobile}"><br>
	<input type="text" name="address" placeholder="주소" value="${dto.address}" ><br>
 	<input type="submit" value="회원가입"/>	
	</form>
	
	
	<!-- <label for = "gender">성별 : </label> -
	성별: 
  <input type = "radio" name = "gender" value = "남자" id="woman" checked = "checked"> 남자    
  <input type = "radio" name = "gender" value = "여자" id="man"> 여자<br>
  -->
 <!--  생년 월일: 
  <input type="text" name="birthYear" placeholder="년(4글자)">	
  <select name="birthMonth">
  	<option value="1">1월</option>
  	<option value="2">2월</option>
  	<option value="3">3월</option>
  </select> 
  <input type="text" name="birthDate" placeholder="일"><br>
 --> 

	<!-- <input type="button" value="취소" onclick="javascript:location.href='index';">  -->

</body>
</html>