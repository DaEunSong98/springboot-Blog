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
		alert('���̵� �Է��ϼ���');
		$id.focus();
		return false;
	}
	
	if($pw.val().trim().length==0){
		alert('��й�ȣ�� �Է��ϼ���')
		$pw.focus();
		return false;
	}
	if(confirm("ȸ������ �Ͻðڽ��ϱ�?")){
		alert("ȸ�������� �Ϸ�Ǿ����ϴ�.");
		$("form").submit();
	}
	return true;
}
	

</script>
 -->

<h2>ȸ������</h2>

<form action="join" method="post"> <!-- ���⼭�� form�� ���� �̸� -->
	<input type="text" name="id" placeholder="���̵�" value="${dto.id}">
    ${valid_id}<br>    
	<input type="password" name="pw" placeholder="�н�����">
	${valid_pw}<br>
	<input type="password" name="pw_check" placeholder="�н����� Ȯ��">
	${check}<br>
	<input type="text" name="name" placeholder="�̸�" value="${dto.name}">	
	${valid_name}<br>
	<input type="text" name="email" placeholder="�̸���" value="${dto.email}">
	${valid_email}<br>	
	<input type="text" name="mobile" placeholder="��ȭ��ȣ" value="${dto.mobile}"><br>
	<input type="text" name="address" placeholder="�ּ�" value="${dto.address}" ><br>
 	<input type="submit" value="ȸ������"/>	
	</form>
	
	
	<!-- <label for = "gender">���� : </label> -
	����: 
  <input type = "radio" name = "gender" value = "����" id="woman" checked = "checked"> ����    
  <input type = "radio" name = "gender" value = "����" id="man"> ����<br>
  -->
 <!--  ���� ����: 
  <input type="text" name="birthYear" placeholder="��(4����)">	
  <select name="birthMonth">
  	<option value="1">1��</option>
  	<option value="2">2��</option>
  	<option value="3">3��</option>
  </select> 
  <input type="text" name="birthDate" placeholder="��"><br>
 --> 

	<!-- <input type="button" value="���" onclick="javascript:location.href='index';">  -->

</body>
</html>