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
	<title>Burgers</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="container">
    <div>
	<h1 class="my-3">All Burgers</h1>
		<table class="table w-50 table-striped table-bordered">
		    <thead class="table-dark">
		        <tr>
		            <th scope="col">Burger Name</th>
		            <th scope="col">Restaurant Name</th>
		            <th scope="col">Rating (out of 5)</th>
		            <th scope="col">Actions</th>
		        </tr>
		    </thead>
		    <tbody>
		         <!-- loop over all the books to show the details as in the wireframe! -->
		         <c:forEach var="burger" items="${burgers}">
		         	<tr>
		         		<td><c:out value="${burger.name}"></c:out></td>
		         		<td><c:out value="${burger.restaurant}"></c:out></td>
		         		<td><c:out value="${burger.rating}"></c:out></td>
		         		<td><a href="/update/${burger.id}">Update</a><a  href="/delete/${burger.id}">Delete</a></td>
		         	</tr>
		         </c:forEach>
		    </tbody>
		</table>
	</div>
	<div class="bg-secondary w-50 p-5 text-light form-group">
		<h2 class="my-3">Add a Burger:</h2>
		<form:form action="/create" method="post" modelAttribute="burger">
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