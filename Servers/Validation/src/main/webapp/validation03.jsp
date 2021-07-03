<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="insertTestError.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">
	function checkLogin() {
		var form = document.loginForm;  //반복되는 부분 변수로 만들수 있다
		 	      //document는 이 문서. loginForm은 폼태그 이름
		
		// Empty Check
		if(form.id.value == ""){
			alert("아이디를 입력해주세요!");
			form.id.focus();
			return false; //false값을 안줘버리면 액션페이지로 넘어가 버린다!!
		}else if(form.passwd.value == ""){
			alert("비밀번호를 입력해 주세요!")
			form.passwd.focus();
			return false;
		}
		
		
		// Length Check
		if(form.id.value.length < 4 || form.id.value.length >12){
			alert("아이디는 4~12자리 이내로 입력 가능 합니다.")
			form.id.select();
			return false;
		}
		
		if(form.passwd.value.length < 4 ){
			alert("비밀번호는 4자 이상으로 입력해야 합니다.")
			form.passwd.select();
			return false;
		}
		
		form.submit();  //submit 은 자바스크립에서 해준다 인풋타입을 버튼으로 해줘야한다!!!1
		
	}
</script>

<body>
	<form name="loginForm" action="validation03_Process.jsp" method="post">
		<p>아이디 : <input type="text" name="id"></p>
		<p>비밀번호 : <input type="password" name="passwd"></p>
		<p><input type="button" value="전송" onclick="checkLogin()"></p>
	</form>

</body>
</html>