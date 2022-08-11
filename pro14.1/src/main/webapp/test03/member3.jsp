<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    request.setCharacterEncoding("UTF-8");
    %>
    <c:set var="id" value="hong" scope="page"/>
    <c:set var="pwd" value="1234" scope="page"/>
    <c:set var="name" value="${'홍길동' }" scope="page"/>
    <c:set var="age" value="${22 }" scope="page" />
    <c:set var="height" value="${177 }" scope="page"/>
    <c:remove var="id"/>
    <c:remove var="height"/>
    <%--c:remove로 삭제함 --%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1 width="100%">
<tr align="center" bgcolor="lightgreen">
<td><b>아이디</b></td>
<td><b>비밀번호</b></td>
<td><b>이름</b></td>
<td><b>나이</b></td>
<td><b>키</b></td>
</tr>

<tr align="center">
<td>${id }</td>
<td>${pwd }</td>
<td>${name }</td>
<td>${age }</td>
<td>${height }</td>
</tr>
</table>
</body>
</html>