<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function checkLogin() {
		
		var form = document.loginForm;
		const regex = /^[ㄱ-ㅎ|가-힣|+$/;
		var re = /^[가-힣]+$/;
		var true = form.name.value;
		
		// Empty Check
		if(form.id.value == ""){
			alert("아이디를 입력해주세요!");
			form.id.focus();
			return false; //false값을 안줘버리면 액션페이지로 넘어가 버린다!!
		}
 			if(form.pw.value == ""){
			alert("비밀번호를 입력해 주세요!")
			form.passwd.focus();
			return false;
		}
			if(form.name.value == ""){
				alert("이름을 입력해 주세요!")
				form.name.focus();
				return false;
			}
			if(form.num1.value == ""){
				alert("연락처를 입력해 주세요!")
				form.num1.focus();
				return false;
			}
			if(form.num2.value == ""){
				alert("연락처를 입력해 주세요!")
				form.num2.focus();
				return false;
			}
			if(form.email.value == ""){
				alert("이메일을 입력해 주세요!")
				form.email.focus();
				return false;
			}  
			if(true == regex.test() ){
				alert("이름을 한글로 입력해주세요!")
				form.name.select();
				return false;	
			}		
						
			
			form.submit(); 
	}
</script>
<body>
	<form name="loginForm" action="vallidation05_Process.jsp" method="post">
		<p>아이디 : <input type="text" name="id"></p>
		<p>비밀번호 : <input type="password" name="pw"></p>
		<p>이름 : <input type="text" name="name"></p>
		연락처 : <select>
				<option value="num" selected="selected">010</option>
			</select>
		 -<input type="text" name="num1">
		 -<input type="text" name="num2"><br>
		<p>이메일 : <input type="text" name="email"></p>
		 <br><br>
		 <input type="button" value="가입하기" onclick="checkLogin()">
	
	</form>

</body>
</html>