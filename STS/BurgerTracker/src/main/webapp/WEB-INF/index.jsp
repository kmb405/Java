<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Burgers</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>All Burgers</h1>
	<table>
	    <thead>
	        <tr>
	            <th>Burger Name</th>
	            <th>Restaurant Name</th>
	            <th>Rating (out of 5)</th>
	        </tr>
	    </thead>
	    <tbody>
	         <!-- loop over all the books to show the details as in the wireframe! -->
	         <c:forEach var="burger" items="${burgers}">
	         	<tr>
	         		<td><c:out value="${burger.burger}"></c:out></td>
	         		<td><c:out value="${burger.restaurant}"></c:out></td>
	         		<td><c:out value="${burger.rating}"></c:out></td>
	         	</tr>
	         </c:forEach>
	    </tbody>
	</table>
	<div>
		<h2>Add a Burger:</h2>
		<form:form action="/create" method="post" modelAttribute="burger">
			<form:label path="burger">Burger Name</form:label>
			<form:input path="burger"/>
			<form:label path="restaurant">Burger Name</form:label>
			<form:input path="restaurant"/>
			<form:label path="rating">Burger Name</form:label>
			<form:input path="rating"/>
			<form:label path="note">Notes</form:label>
			<form:textarea path="note"></form:textarea>
		</form:form>
	</div>
</body>
</html>