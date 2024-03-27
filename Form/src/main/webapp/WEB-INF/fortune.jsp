<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Fortune</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/CSS/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
</head>
<body class=" d-flex justify-content-center w-100">
	<div class="d-flex flex-column align-items-center w-75">
		<h1 class="p-4">Here's Your Omikuji!</h1>
		<p class="bg-info w-25">In <c:out value="${number}"></c:out> years, 
		you will live in <c:out value="${city}"></c:out> with <c:out value="${person}"></c:out> as your room mate, 
		<c:out value="${hobby}"></c:out> for a living. The next time you see a <c:out value="${thing}"></c:out>, 
		you will have good luck. 
		Also, <c:out value="${quote}"></c:out>.</p>
		<a href="/omikuji">Go Back</a>
	</div>
</body>
</html>