<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");
	String[] check = request.getParameterValues("check");
	
//	String result;
	
	for(int i=0; i<check.length; i++){
		if(i == check.length-1){
			RequestDispatcher dispatcher = request.getRequestDispatcher("userInsert_04.jsp");
			dispatcher.forward(request, response);
			break;
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("userInsert_01.jsp");
			dispatcher.forward(request, response);
		}
	}
%>
</body>
</html>