<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <!-- JSTL하려면 이 태그 를 넣어줘야한다! -->   
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>최대값 구하기</title>
</head>
<body>
	최대값 :
	<!-- if문과 같은원리 -->
	<c:if test="${param.num1 - param.num2 >= 0 }">
		${param.num1 }
	</c:if>	
	<c:if test="${param.num1 - param.num2 < 0 }">
		${param.num2 }
	</c:if>
</body>
</html>










