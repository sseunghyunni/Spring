<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
   <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border=1>
	<tr align="center" bgcolor="lightgreen">
	<td width="7%"><b>아이디</b></td>
	<td width="7%"><b>비밀번호</b></td>
	<td width="7%"><b>이름</b></td>
	<td width="7%"><b>이메일</b></td>
	<td width="7%"><b>가일입</b></td>

	</tr>
	
	<tr align ="center"> 
	<td>${member.id}</td>
	<td>${member.pwd}</td>
	<td>${member.name}</td>
	<td>${member.email }</td>
	<td>${member.joinDate }</td>
	</tr>
	</table>
</body>
</html>