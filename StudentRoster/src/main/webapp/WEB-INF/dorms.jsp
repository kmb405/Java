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
			<h2>Dorms</h2>
		</div>
		<div class="d-flex flex-column p-3">
			<a href="/dorms/new">Add a new dorm</a>
			<a href="/students/new">Add a new student</a>
		</div>
		<div>
			<table class="table p-5 table-striped table-bordered">
				<thead class="table-dark">
					<tr>
						<th scope="col">Dorm</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="dorm" items="${dorms}">
						<tr>
							<td><c:out value="${dorm.name}"></c:out></td>
							<td><a href="/dorms/${dorm.id}">See Students</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
	</div>
</body>
</html>