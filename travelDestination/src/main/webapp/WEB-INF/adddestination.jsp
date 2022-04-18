<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="stylelinks.jsp"></jsp:include>
</head>
<body>

<jsp:include page="nav.jsp"></jsp:include>
<section class="addDest" > 

	<h1 class="text-light">Add destination details: </h1>
	<br>
	
	<form action="addDest.do" method="post">
		<label for="countryName" class="text-light">Country name: </label> 
		<input type="text" name="countryName" class="form-control" required> 
		<br>
		<label for="stateRegion" class="text-light">State /Region: </label> 
		<input type="text" name="stateRegion" class="form-control" required> 
		<br>
		<label for="city" class="text-light" >City: </label> 
		<input type="text" name="city" class="form-control" required> 
		<br>
		<label for="topAttractions" class="text-light">Top attractions: </label> 
		<input type="text" name="topAttractions" class="form-control"> 
		<br>
		<label for="rating" class="text-light">Rating: </label> 
		<input type="number" min="1" max="5"name="rating" class="form-control"> 
		<br>
		<label for="hasTraveled" class="text-light">Has Traveled: </label> 
		<input type="radio" id="yes" name="hasTraveled" value="1" class="form-check-input" checked>
		<label for="yes" class="text-light">Yes</label>
		<input type="radio" id="no" name="hasTraveled" cclass="form-check-input" value="0"> 
		<label for="no" class="text-light">No</label> 
		<br>
		<br>
		<label for="arrivalDate" class="text-light">Arrival date: </label> 
		<input type="date" name="arrivalDate" class="form-control">
		<br> 
		<label for="departureDate" class="text-light">Departure date: </label> 
		<input type="date" name="departureDate" class="form-control"> 
		<br>
		<input type="submit" value="create" class="btn btn-secondary">
	</form>
	
</section>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>