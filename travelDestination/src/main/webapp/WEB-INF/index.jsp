<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Travel Destinations</title>
</head>
<body>

<h1>Travel Site</h1>
<form action="citySearch.do" method="post">
<label for="city">Search by city name: </label>
<input type="search" name="city">
<input type="submit" value="Search">
</form>

<form action="idSearch.do" method="post">
<label for="city">Search by city name: </label>
<input type="search" name="id">
<input type="submit" value="Search">
</form>



</body>
</html>