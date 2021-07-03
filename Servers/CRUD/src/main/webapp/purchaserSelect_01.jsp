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
<title>고객명단 리스트 검색</title>
</head>
<body>
	<h3>고객명단 리스트 검색</h3>

   <!-- -------------------------------Select Update Delet 세가지 사용한 형식---------------------------- -->


<%

//---데이터 베이스---

String url_mysql = "jdbc:mysql://localhost/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
String id_mysql = "root";
String pw_mysql = "qwer1234";


// select에서는 굳이 안써도 되지만 보안상 업데이트기능에서는 써준다!
String whereStatement = "select userid, name, tel, address, insertdate from purchaserinsert";
int cnt=0;

try{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql,pw_mysql);
	Statement stmt_mysql = conn_mysql.createStatement();
	
	
	ResultSet rs = stmt_mysql.executeQuery(whereStatement);
%>
	
	<table border="1">
		<tr>
			<th>UserID</th><th>이름</th><th>전화번호</th><th>주소</th><th>입력일자</th>
		</tr>
		
	
	
<% 
	while(rs.next()){
%>
	<tr>       
		<td><a href = "purchaserSelect_02.jsp?userid=<%=rs.getString(1)%>"><%=rs.getString(1) %></a></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getString(3) %></td>
		<td><%=rs.getString(4) %></td>
		<td><%=rs.getString(5) %></td>
	</tr>		
<%
		cnt++;
	}
%>
	</table>
<% 
	conn_mysql.close();

}catch(Exception e){
	e.printStackTrace();
}
%>	
<br><br>
총 인원은 <%=cnt %>명 입니다.
</body>
</html>