<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Show</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container bg-secondary w-25 m-3 p-5 text-light form-group">
		<h1 class="my-3">Create Book</h1>
		<form:form action="/book" method="post" modelAttribute="book">
			<div>
				<form:label path="title">Title</form:label>
				<form:errors path="title" class="text-danger"/>
				<form:input path="title" class="form-control"/>
			</div>
			<div>
				<form:label path="description">Description</form:label>
				<form:errors path="description" class="text-danger"/>
				<form:textarea path="description" class="form-control"></form:textarea>
			</div>
			<div>
				<form:label path="language">Language</form:label>
				<form:errors path="language" class="text-danger"/>
				<form:input path="language" class="form-control"/>
			</div>
			<div>
				<form:label path="numberOfPages">Pages</form:label>
				<form:errors path="numberOfPages" class="text-danger"/>
				<form:input path="numberOfPages" class="form-control"/>
			</div>
			<input type="submit" value="Submit" class="button btn-warning m-3"/>
		</form:form>
	</div>
</body>
</html>