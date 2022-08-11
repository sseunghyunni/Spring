<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="member3.jsp">
	아이디:<input type="text" name="userID" size=20/><br>
	비밀번호:<input type="password" name="userPW" size=20/><br>
	<input type="submit" value="로그인"/><input type="reset" value="다시입력"/>
	</form>
	<br><br>
	<!-- <a href="http://localhost:8080/pro14.1/test01/memberForm.jsp>회원가입하기</a> -->
	<%-- <a href="<%=request.getContextPath()%>/test01/memberForm.jsp">회원가입하기></a>--%>
	<a href="${pageContext.request.contextPath }/test01/memberForm.jsp">회원가입하기</a>
</body>
</html>