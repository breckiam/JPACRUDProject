<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Travel Destinations</title>
<jsp:include page="stylelinks.jsp"></jsp:include>
</head>
<body>

	<jsp:include page="nav.jsp"></jsp:include>

<section class="home-title">

<div class="home-text">
<h1 class="text-light display-3">Travel Tracker</h1>
<h4 class="text-light">Track previous and upcoming travel destinations</h4>
</div>
</section>
<section class="alldest">
	<h1 class="alldest-title text-light">All Destinations </h1>
	<div class="container">
		<table class="table table-striped table-dark" >
			<thead>
				<tr>
					<th>City</th>
					<th>State/Region</th>
					<th>Country</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${destList}" var="dest">
					<tr>
						<th scope="row">
						<form action="idSearch.do" method="post">
						<button value="${dest.id}" class= "btn btn-secondary" name="id">${dest.city}</button>
						</form>
						</th>
						<td>${dest.stateRegion}</td>
						<td>${dest.countryName}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	
	<form action="add.do">
	<button class= "btn btn-secondary create-btn" type="submit">Create New Destination</button>
	</form>

</section>


	<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>