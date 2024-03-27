<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
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
	<div class="container bg-secondary w-25 m-3 p-5 text-light">
		<h3>View Book</h3>
		<p>Title: <c:out value = "${book.title}"/></p>
		<p>Description: <c:out value = "${book.description}"/></p>
		<p>Language: <c:out value = "${book.language}"/></p>
		<p>Pages: <c:out value = "${book.numberOfPages}"/></p>
	</div>
</body>
</html>
