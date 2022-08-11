<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%
	request.setCharacterEncoding("UTF-8");
	%>
	<% String id2=request.getParameter("id2");
	String pwd2=request.getParameter("pwd2");
	String name2=request.getParameter("name2");
	String age2=request.getParameter("age2");
	String email2=request.getParameter("email2");
	String height2=request.getParameter("height2");
	%>
	<c:set var="id" value="hong" scope="page" />
	<c:set var="pwd" value="1234" scope="page"/>
	<c:set var="name" value="${'홍길동'}" scope="page" />
	<c:set var="age" value="${22}" scope="page" />
	<c:set var="height" value="${177}" scope="page" />
	<c:set var="email"  scope="page"/>
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
	<td width="7%"><b>나이</b></td>
	<td width="7%"><b>키</b></td>
	<td width="7%"><b>이메일</b></td>
	</tr>
	
	<tr align ="center"> 
	<td>${id}</td>
	<td>${pwd}</td>
	<td>${name}</td>
	<td>${age}</td>
	<td>${height}</td>
	<td>${email }</td>
	</tr>
	
	<tr align ="center"> 
	<td><%=request.getParameter("id2")%></td>
	<%--request.getparameter로 하면 위에서 request해줄 필요 없고  --%>
	<td><%=pwd2 %></td>
	<td><%=name2 %></td>
	<td><%=age2 %></td>
	<td><%=height2 %></td>
	<td><%=email2 %></td>
	</tr>
	</table>
</body>
</html>