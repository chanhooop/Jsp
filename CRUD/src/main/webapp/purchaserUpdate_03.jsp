<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");


	session.setAttribute("NAME", name);
	session.setAttribute("TEL", tel);
	session.setAttribute("ADDRESS", address);

	
	//---데이터 베이스---
	
	String url_mysql = "jdbc:mysql://localhost/customer?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	String id_mysql = "root";
	String pw_mysql = "qwer1234";
	
	PreparedStatement ps = null;
	// select에서는 굳이 안써도 되지만 보안상 업데이트기능에서는 써준다!
	
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn_mysql = DriverManager.getConnection(url_mysql, id_mysql,pw_mysql);
		Statement stmt_mysql = conn_mysql.createStatement();
		
		String A = "update purchaserInsert set name = ?, tel = ?, address = ? where userid = ?";
		
		ps = conn_mysql.prepareStatement(A);
		ps.setString(1, name);
		ps.setString(2, tel);
		ps.setString(3, address);
		ps.setString(4, (String)session.getAttribute("USERID"));

		ps.executeUpdate();
		
		conn_mysql.close();
		 
	}catch(Exception e){
		e.printStackTrace();
	}

	response.sendRedirect("purchaserUpdate_04.jsp");
%>