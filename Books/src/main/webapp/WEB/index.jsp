<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
	<div class="container">
		<h1 class="my-3">All Books</h1>
		<table class="table w-50 table-striped table-bordered">
		    <thead class="table-dark">
		        <tr>
		            <th scope="col">ID</th>
		            <th scope="col">Title</th>
		            <th scope="col">Language</th>
		            <th scope="col">Number of Pages</th>
		        </tr>
		    </thead>
		    <tbody>
		         <!-- loop over all the books to show the details as in the wireframe! -->
		         <c:forEach var="book" items="${books}">
			         <tr>
			         	<td><c:out value="${book.id}"></c:out></td>
			         	<td><a href="/books/${book.id}"><c:out value="${book.title}"></c:out></a></td>
			         	<td><c:out value="${book.language}"></c:out></td>
			         	<td><c:out value="${book.numberOfPages}"></c:out></td>
			         </tr>
			     </c:forEach>
		    </tbody>
		</table>
	</div>
</body>
</html>