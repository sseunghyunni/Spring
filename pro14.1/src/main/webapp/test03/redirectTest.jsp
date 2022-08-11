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
<c:redirect url="/test03/member.jsp">
<c:param name="id2" value="${'seong' }"/>
<c:param name="pwd2" value="${'4321' }"/>
<c:param name="name2" value="${'김승현' }"/>
<c:param name="email2" value="${'rlatmd98@naver.com' }"/>
<c:param name="height2" value="${'170' }"/>
<c:param name="age2" value="${'' }"/>
</c:redirect>

</body>
</html>