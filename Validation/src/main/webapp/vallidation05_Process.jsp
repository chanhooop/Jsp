<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>입력에 성공햇습니다.</h3>
	<%
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String num = request.getParameter("num");
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		String email = request.getParameter("email");
	%>
	아이디 : <%=id %><br>
	비밀번호 : <%=pw %><br>
	이름 : <%=name %><br>
	연락처 : <%=num %><%=num1 %><%=num2 %><br>
	이메일 : <%=email %><br>

</body>
</html>