<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Dorms</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body class="container my-1 d-flex flex-column align-items-center">
   	<div class="bg-light my-1 w-50 p-5 text-secondary">
		<div class="d-flex justify-content-center">
			<h2>New Dorm</h2>
		</div>
		<div>
			<a href="/">Dashboard</a>
		</div>
		<div class="form">
			<form:form action="/createDorm" method="post" modelAttribute="dorm">
				<form:label for="name" path="name">Name</form:label>
				<form:input path="name" type="text" class="form-control"/>
				<input type="submit" value="Add" class="btn btn-primary p-3 my-3"/>
				
			</form:form>
			
		</div>
	</div>
</body>
</html>