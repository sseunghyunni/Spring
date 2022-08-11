<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <% 
    request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	안녕하세요., 쇼핑몰 중심jsp시작입니다.
	<hr>
	<jsp:include page="duck_image.jsp" flush="ture">
	<jsp:param name="name" value="듀크2"/>
	<jsp:param name="imgName" value="dog2.JPG"/>
	</jsp:include>
	<hr>
	안녕하세요. 쇼핑몰 중심 jsp끝부분입니다.
</body>
</html> 