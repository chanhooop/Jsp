<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자 정보 입력</title>
</head>
<body>
	<form action="requestParameter.jsp" method ="post">
		이름 : <input type="text" name="name" size = "10"><br>
		아이디 : <input type="text" name="id" size = "10"><br>
		패스워드 : <input type="password" name="pw" size = "10"><br>
		취미:
		<input type="checkbox" name="hobby" value="독서" checked="checked">
		<input type="checkbox" name="hobby" value="요리">
		<input type="checkbox" name="hobby" value="요리">
		<br>
		
		 전공:
		 <input type="radio" name="major" value="국어" checked="checked"> 국어
		 <input type="radio" name="major" value="영어"> 영어
		 <input type="radio" name="major" value="디자인"> 디자인
		<br>
		Protocol :
		<select name="protocol">
			<option value="http">http</option>
			<option value="ftp">ftp</option>
			<option value="smtp" selected="selected">smtp</option>

		</select>
		
		<br>
		
		<input type="submit" value="전송">
		<input type="reset" value="취소">
		<br>
		

		

	</form>


</body>
</html>