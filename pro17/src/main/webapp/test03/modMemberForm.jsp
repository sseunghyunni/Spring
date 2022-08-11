<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <c:set var="contextPath" value="${pageContext.request.contextPath }" />
    <%
    request.setCharacterEncoding("UTF-8");
    %>
<!DOCTYPE html>
<html>
<head>
<style>
input{
display=inline;
margin="auto";
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 class="cls1">회원정보수정창</h1>
	<form method="post" action="${contextPath}/member/modMember.do?id=${memInfo.id }">
	<table align="center">
	<tr>
	<td width="200">
	<p align="right">아이디
	</td>
	<td width="400"><input type="text" name="id" value="${memInfo.id }" disabled="disabled"> </td>
	</tr>
	
	<tr>
	<td width="200">
	<p align="right">비밀번호
	</td>
	<td width="400"><input type="password" name="pwd" value="${memInfo.pwd }" > </td>
	</tr>
	
	<tr>
	<td width="200">
	<p align="right">이름
	</td>
	<td width="400"><input type="text" name="name" value="${memInfo.name }"> </td>
	</tr>
	
	<tr>
	<td width="200">
	<p align="right">이메일
	</td>
	<td width="400"><input type="text" name="email" value="${memInfo.email }" > </td>
	</tr>
	
	<tr>
	<td width="200">
	<p align="right">가입일
	</td>
	<td width="400"><input type="text" name="date" value="${memInfo.joinDate }" disabled="disabled"> </td>
	</tr>
	
	<tr>
	<td><input type="submit" value="수정하기"><a href="${contextPath }/member/modMemberFrom.do?id=${mem.id }"></a></td>
	</tr>
	<tr>
	<td><input type="reset"value="다시입력"><a href="${contextPath }/member/delMemberFrom.do?id=${mem.id }"></a></td>
	</tr>
	</table>
	</form>
</body>
</html>