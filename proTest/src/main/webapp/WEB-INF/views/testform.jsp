<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
  <%@ taglib prefix = "fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
  <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
  <%
  request.setCharacterEncoding("utf-8");
  %>
  <c:set var="contextPath" value="${pageContext.request.contextPath }"/>
  <!DOCTYPE html>
<html>
<head>
<style>

</style>
<meta charset="UTF-8">
<title>developer test</title>
</head>

<body>
<form action="${contextPath }/test9.do" method="post">
<input value="회원 정보 조회" type="submit"  />
</body>
</html>