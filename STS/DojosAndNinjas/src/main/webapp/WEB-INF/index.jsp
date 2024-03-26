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
    <title>Dojos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body class="container my-1 d-flex flex-column align-items-center" id="intro">
    <div class="bg-light my-1 w-50 p-5 text-secondary">
		<h1 class="my-3">All Dojos</h1>
		<div>
			<table class="table p-5 table-striped table-bordered">
			    <thead class="table-dark">
   					<tr>
   						<th scope="col">Dojo Name</th>
   						<th scope="col">Actions</th>
   					</tr>
   				</thead>
   				<tbody>
   					<c:forEach var="dojo" items="${dojos}">
	   					<tr>
	   						<td><a href="/dojo/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></td>
	   						<td><a href="#">Delete</a></td>
	   					</tr>
   					</c:forEach>
   				</tbody>
   			</table>
   			<a href="/newdojo"><button class="btn btn-rounded btn-primary">New Dojo</button></a>
   			<a href="/newninja"><button class="btn btn-rounded btn-primary">New Ninja</button></a>
   		</div>
   	</div>
</body>
</html>