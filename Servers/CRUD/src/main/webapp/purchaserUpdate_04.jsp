<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



	<form action=""> <br>
		사용자 ID:<input type="text" name="userid" value=<%=session.getAttribute("USERID") %>><br>
		성명:<input type="text" name="name" value=<%= session.getAttribute("NAME")%>><br>
		전화번호:<input type="text" name="tel" value=<%= session.getAttribute("TEL")%>><br>
		주소:<input type="text" name="address" value=<%= session.getAttribute("ADDRESS")%>><br><br>



	<h1>상기의 정보로 수정되었습니다.</h1>
	</form>
<%session.invalidate(); %>
</body>
</html>