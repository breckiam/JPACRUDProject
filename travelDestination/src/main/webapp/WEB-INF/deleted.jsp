<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="stylelinks.jsp"></jsp:include>
</head>
<body>

<jsp:include page="nav.jsp"></jsp:include>

<section class="delete-page">
		<c:choose>
		<c:when test="${isDeleted == true }">
		<div class="container delete-text">
			<h1 class="text-white">Destination was Deleted</h1>
		</div>
		</c:when>	
		<c:otherwise>
		<div class="container">
			<h1 class="text-white delete-text">Destination was NOT deleted</h1>
		</div>
		</c:otherwise>	
		</c:choose>
		
		<jsp:include page="footer.jsp"></jsp:include>
</section>
</body>
</html>