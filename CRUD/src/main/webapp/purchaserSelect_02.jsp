<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="com.mysql.cj.protocol.Resultset"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Driver"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>고객명단 수정 및 삭제</title>
</head>
<body>
	<h4>고객명단 수정 및 삭제</h4>
<%
	request.setCharacterEncoding("utf-8");
	String userid = request.getParameter("userid");
	session.setAttribute("USERID", userid);
	
	String url_mysql = "jdbc:mysql://localhost/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	
	String name = "";
	String tel = "";
	String address = "";
	
	// select에서는 굳이 안써도 되지만 보안상 업데이트기능에서는 써준다!
	String whereStatement = "select name, tel, address from purchaserinsert where userid = '" + userid + "'";
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		ResultSet rs = stmt_mysql.executeQuery(whereStatement);
		while(rs.next()){
			name = rs.getString(1);
			tel = rs.getString(2);
			address = rs.getString(3);
			
		}
		conn_mysql.close();

	}catch(Exception e){
		e.printStackTrace();
	}
%>


	<form action="purchaserSelect_03.jsp" method="post">
		User ID : <input type="text" name="userid" size="10" value="<%=userid%>" readonly="readonly"><br>
		성명 : <input type="text" name="name" size="10" value="<%=name%>"><br>
		전화번호 : <input type="text" name="tel" size="10" value="<%=tel%>"><br>
		주소 : <input type="text" name="address" size="10" value="<%=address%>"><br>
		<input type="submit" value="수정">
	</form>
	
	<form action="purchaserSelect_04.jsp" method="post">
		<input type="submit" value="삭제">
	</form>

</body>
</html>