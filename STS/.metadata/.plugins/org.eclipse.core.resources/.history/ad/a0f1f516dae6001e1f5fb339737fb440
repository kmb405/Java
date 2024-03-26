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
	<title>Update Expense</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class="container">
	<div class="bg-secondary w-50 p-5 text-light form-group">
		<h2 class="my-3">Update an Expense:</h2>
		<form:form action="/travels/${travel.id}" method="post" modelAttribute="travel">
		 	<input type="hidden" name="_method" value="put">
		 	
			<form:label path="name">Expense Name: </form:label>
			<form:errors path="name" class="text-danger"/>
			<form:input path="name" class="form-control"/>
			
			<form:label path="vendor">Vendor: </form:label>
			<form:errors path="vendor" class="text-danger"/>
			<form:input path="vendor" class="form-control"/>
			
			<form:label path="amount">Amount: </form:label>
			<form:errors path="amount" class="text-danger"/>
			<form:input path="amount" class="form-control"/>
			
			<form:label path="description">Description: </form:label>
			<form:errors path="description" class="text-danger"/>
			<form:textarea path="description" class="form-control"></form:textarea>
			<input type="submit" value="Submit" class=" btn btn-warning p-2 my-2"/>
		</form:form>
	</div>
</body>
</html>