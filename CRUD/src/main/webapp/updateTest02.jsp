<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Driver"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객정보 수정</title>
</head>
<body>
	<h4>아이디를 수정후 확인버튼을 누르세요</h4>
	
<%
		request.setCharacterEncoding("utf-8");

		String id = request.getParameter("id");
		
		//---데이터 베이스---
		
		String url_mysql = "jdbc:mysql://localhost/eclipse?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
		String id_mysql = "root";
		String pw_mysql = "qwer1234";
		
		
		// select에서는 굳이 안써도 되지만 보안상 업데이트기능에서는 써준다!
		String whereStatement = "select userid from wtest where id = " + id;
		String strUserid = null;

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql,pw_mysql);
			Statement stmt_mysql = conn_mysql.createStatement();
			
			ResultSet rs = stmt_mysql.executeQuery(whereStatement);
			while(rs.next()){
				strUserid = rs.getString(1);
				
			}
			conn_mysql.close();
			session.setAttribute("ID", id);			
			session.setAttribute("OLD", strUserid);
		}catch(Exception e){
			e.printStackTrace();
		}
%>	

	<form action="updateTest03.jsp" method="post">
		사용자 ID : <input type="text" name="userid" size="10" value="<%=strUserid%>">
			<input type="submit" value="확인">
	</form>
</body>
</html>