<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
  <%
  request.setCharacterEncoding("UTF-8");
  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border="1">
	<tr align="center" bgcolor="lightgreen">
	<td width="7%"><b>아이디</b></td> 
	<td width="7%"><b>비밀번호</b></td>
	<td width="7%"><b>이름</b></td>
	<td width="7%"><b>이메일</b></td>
	</tr>
	<c:choose>
	<c:when test="${empty param.id}">
	<tr align="center">
	<td colspan=5>아이디를 입력하세요</td>
	</tr>
	</c:when>
	</c:choose>
	<tr align="center">
	<td><c:out value="${param.id }"/></td>
	<%--request.getparameter랑 똑같은 param --%>
	<td><c:out value="${param.pwd }"/></td>
	<td><c:out value="${param.name }"/></td>
	<td><c:out value="${param.email }"/></td>
	</tr>
	</table>
</body>
</html>