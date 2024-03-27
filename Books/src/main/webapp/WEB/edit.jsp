<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Update Burger</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="container">
	<div class="bg-secondary w-50 p-5 text-light form-group">
		<h2 class="my-3">Update a Burger:</h2>
		<form:form action="/burgers/${burger.id}" method="post" modelAttribute="burger">
		 	<input type="hidden" name="_method" value="put">
		 	
			<form:label path="name">Burger Name</form:label>
			<form:errors path="name" class="text-danger"/>
			<form:input path="name" class="form-control"/>
			
			<form:label path="restaurant">Burger Restaurant</form:label>
			<form:errors path="restaurant" class="text-danger"/>
			<form:input path="restaurant" class="form-control"/>
			
			<form:label path="rating">Burger Rating</form:label>
			<form:errors path="rating" class="text-danger"/>
			<form:input path="rating" class="form-control"/>
			
			<form:label path="note">Notes</form:label>
			<form:errors path="note" class="text-danger"/>
			<form:textarea path="note" class="form-control"></form:textarea>
			<input type="submit" value="Submit" class=" btn btn-warning p-2 my-2"/>
		</form:form>
	</div>
</body>
</html>