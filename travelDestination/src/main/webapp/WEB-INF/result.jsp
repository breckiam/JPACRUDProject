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
<section class="single-dest">
	<c:choose>
		<c:when test="${not empty dest}">
			<div class="dest-text-container">
				<h1 class="text-white">${dest.city}</h1>

				<h3 class="text-white">Country: ${dest.countryName}</h3>
				<h3 class="text-white">State / Region: ${dest.stateRegion}</h3>
				<c:choose>
					<c:when test="${not empty dest.topAttractions }">
						<h3 class="text-white">Top attractions: ${dest.topAttractions}</h3>
					</c:when>
				</c:choose>

			<form action="edit.do" method="post">
				<button class= "btn btn-secondary create-btn" value="${dest.id}" name="id" type="submit">Edit</button>
			</form>

			<form action="delete.do" method="post">
				<button class= "btn btn-secondary create-btn" value="${dest.id}" name="id" type="submit">Delete</button>
			</form>
			</div>
			<div class="map-container">
				<iframe width="100%" height="450" style="border: 0" loading="lazy"
					allowfullscreen referrerpolicy="no-referrer-when-downgrade"
					src="https://www.google.com/maps/embed/v1/place?key=AIzaSyDWc82oR6wmTsvHWV4by1AHmXuYOBt1dzk
  						&q=${dest.city}+${dest.stateRegion}">
				</iframe>
			</div>



		</c:when>
		<c:when test="${empty dest}">
		<div class="dest-text-container">
		<h1 class="text-light">No destination found...</h1>
		<h4 class="text-light">Please try again</h4>
		</div>
		</c:when>

	</c:choose>
</section>

<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>