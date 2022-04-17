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

	<form action="addDest.do" method="post">
		<label for="countryName">Country name: </label> 
		<input type="text" name="countryName"> 
		<br>
		<label for="stateRegion">State /Region: </label> 
		<input type="text" name="stateRegion"> 
		<br>
		<label for="city">City: </label> 
		<input type="text" name="city"> 
		<br>
		<label for="rating">Rating: </label> 
		<input type="number" min="1" max="5"name="rating"> 
		<br>
		<input type="radio" id="yes" name="hasTraveled" value="1" checked>
		<label for="yes">Yes</label>
		<input type="radio" id="no" name="hasTraveled" value="0"> 
		<label for="no">No</label> 
		<br>
		<label for="arrivalDate">Arrival date: </label> 
		<input type="date" name="arrivalDate">
		<br> 
		<label for="departureDate">Departure date: </label> 
		<input type="date" name="departureDate"> 
		<br>
		<input type="submit" value="create">
	</form>
	
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>