<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>



<script type="text/javascript">
	function checkForm(){
		/* alert("아이디 : " + document.loginform.id.value + "\n" + "pw : " + document.loginform.pw.value); */
		const field = document.loginform;
		if(field.userid.value == ""){
			alert("아이디는 필수 입력값입니다.");
			field.userid.focus();
			return false; 
		}
		if(field.name.value == ""){
			alert("이름은 필수 입력값입니다.");
			field.name.focus();
			return false; 
		}
		if(field.tel.value == ""){
			alert("번호는 필수 입력값입니다.");
			field.tel.focus();
			return false; 
		}
		if(field.address.value == ""){
			alert("주소는 필수 입력값입니다.");
			field.address.focus();
			return false; 
		}
		
		field.submit();
	}
</script>
<body>
<h2> 아래의 항목을 입력후 확인 버튼을 누르세요 !</h2>
		<form action="purchaserInsert_02.jsp" method ="post" name="loginform">
	<table>
		<tr>
			<td>
				<span>사용자 ID :</span> 
			</td>	
			<td>
				<input type="text" name="userid">
			</td>
		</tr>
		<tr>
			<td>
				<span> 성명 : </span>
			</td>
			<td>
				<input type="text" name="name">
			</td> 
		</tr>
		<tr>
			<td>
				<span>전화번호 :</span> 
			</td>
			 <td><input type="text" name="tel" ></td>
		</tr>
		<tr>
			<td>
				<span>
					주소 : 
				</span>
			</td>
			<td>
				<input type="text" name="address">	
			</td>
		</tr>
		<tr><td><input type="button" value="확인" onclick="checkForm()"></td></tr>
	</table>
</form>
</body>
</html>