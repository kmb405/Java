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
    <title>Book Share</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<div class="d-flex form">
		<form:form action="/createBook" method="post" modelAttribute="newBook" class="p-5 m-5 bg-light-red border rounded-5 shadow">
			<h2>Register</h2>
			<div class="form-group row">
				<form:label path="title" class="col-sm-2 col-form-label">Title: </form:label>
				<form:errors path="title" class="text-danger"></form:errors>
				<form:input	path="title" type="text" class="form-control"/>
			</div>
			<div class="form-group row">
				<form:label path="author" class="col-sm-2 col-form-label">Author: </form:label>
				<form:errors path="author" class="text-danger"></form:errors>
				<form:input type="text"	path="author" class="form-control"/>
			</div>
			<div class="form-group row">
				<form:label path="summary" class="col-sm-2 col-form-label">Summary: </form:label>
				<form:errors path="summary" class="text-danger"></form:errors>
				<form:textarea type="password" path="summary" class="form-control"/>
			</div>
			<div class="d-flex justify-content-end">
				<input type=submit class="btn btn-secondary my-3" value="Submit"/>
			</div>
		</form:form>
	</div>
</body>
</html>