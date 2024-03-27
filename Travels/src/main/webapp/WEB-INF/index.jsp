<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix ="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Dashboard</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	<style>
	    #intro {
	      background-image: url("https://assets.codingdojo.com/boomyeah2015/codingdojo/curriculum/content/chapter/1632271975__napali_coast.jpg");
	      height: 100vh;
	    }
    </style>
</head>
<body class="container my-1 d-flex flex-column align-items-center" id="intro">
    <div class="bg-light my-1 w-50 p-5 text-secondary">
	<h1 class="my-3">Save Travels</h1>
		<table class="table p-5 table-striped table-bordered">
		    <thead class="table-dark">
		        <tr>
		            <th scope="col">Expense</th>
		            <th scope="col">Vendor</th>
		            <th scope="col">Amount</th>
		            <th scope="col">Actions</th>
		        </tr>
		    </thead>
		    <tbody>
		         <!-- loop over all the books to show the details as in the wireframe! -->
		         <c:forEach var="travel" items="${travels}">
		         	<tr>
		         		<td><a href="/show/${travel.id}"><c:out value="${travel.name}"></c:out></a></td>
		         		<td><c:out value="${travel.vendor}"></c:out></td>
		         		<td><fmt:formatNumber value="${travel.amount}" type="number" pattern="'$'###.00"/></td>
		         		<td><a href="/update/${travel.id}" class="btn btn-success">Update</a> <a  href="/delete/${travel.id}" class="btn btn-danger">Delete</a></td>
		         	</tr>
		         </c:forEach>
		    </tbody>
		</table>
	</div>
	<div class="bg-secondary w-50 mb-5 p-5 text-light form-group">
		<h2 class="my-3">Add an Expense:</h2>
		<form:form action="/create" method="post" modelAttribute="travel">
			<form:label path="name">Expense Name</form:label>
			<form:errors path="name" class="text-danger"/>
			<form:input path="name" class="form-control"/>
			
			<form:label path="vendor">Vendor</form:label>
			<form:errors path="vendor" class="text-danger"/>
			<form:input path="vendor" class="form-control"/>
			
			<form:label path="amount">Amount</form:label>
			<form:errors path="amount" class="text-danger"/>
			<form:input path="amount" class="form-control"/>
			
			<form:label path="description">Description</form:label>
			<form:errors path="description" class="text-danger"/>
			<form:textarea path="description" class="form-control"></form:textarea>
			<input type="submit" value="Submit" class=" btn btn-warning p-2 my-2"/>
		</form:form>
	</div>
</body>
</html>