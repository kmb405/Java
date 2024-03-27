<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Omikuji</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="d-flex flex-column align-items-center">
		<h1 class="p-3">Send an Omikuji!</h1>
		<div class="form-group w-25">
			<form action="/omikuji/form" method="post">
				<label class="mt-3">Pick any number from 5 to 25:</label>
				<input type=number name=number class="form-control" min="5" max="25">
				<label class="mt-3">Enter the name of any city:</label>
				<input type=text name=city class="form-control">
				<label class="mt-3">Enter the name of a real person:</label>
				<input type=text name=person class="form-control">
				<label class="mt-3">Enter professional endeavor or hobby:</label>
				<input type=text name=hobby class="form-control">
				<label class="mt-3">Enter any type of living thing:</label>
				<input type=text name=thing class="form-control">
				<label class="mt-3">Say something nice to someone:</label>
				<textarea  name=quote class="form-control" rows="3"></textarea>
				<label class="mt-3">Send and show a friend.</label><br/>
				<div class="d-flex justify-content-end">
					<input type=submit value=Send class="justify-content-end">
				</div>
			</form>
		</div>
	</div>
</body>
</html>