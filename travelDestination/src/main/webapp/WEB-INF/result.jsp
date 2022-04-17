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

	<c:choose>
		<c:when test="${not empty dest}">
			<div>
				<h1>${dest.city}</h1>

				<h3>Country: ${dest.countryName}</h3>
				<h3>State / Region: ${dest.stateRegion}</h3>
				<c:choose>
					<c:when test="${not empty dest.topAttractions }">
						<h3>Top attractions: ${dest.topAttractions}</h3>
					</c:when>
				</c:choose>
			</div>

			<form action="edit.do" method="post">
				<button value="${dest.id}" name="id" type="submit">Edit</button>
			</form>

			<form action="delete.do" method="post">
				<button value="${dest.id}" name="id" type="submit">Delete</button>
			</form>

 			<iframe width="600" height="450" style="border: 0" loading="lazy"
				allowfullscreen referrerpolicy="no-referrer-when-downgrade"
				src="https://www.google.com/maps/embed/v1/place?key=AIzaSyDWc82oR6wmTsvHWV4by1AHmXuYOBt1dzk
  						&q=${dest.city}+${dest.stateRegion}">
			</iframe> 



		</c:when>
		<c:when test="${isDeleted = true }">
			<h1>Destination was Deleted</h1>
		</c:when>
	</c:choose>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>