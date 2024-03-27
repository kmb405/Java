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
    <title>Expense</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
    <style>
	    #intro {
	      background-image: url("https://mdbootstrap.com/img/new/fluid/city/018.jpg");
	      height: 100vh;
	    }
    </style>

</head>
<body>
   	<div class="container bg-primary w-50 my-5 p-5 text-dark border border-5 rounded-5 border-primary" style="--bs-bg-opacity: .25;">
   		<div class="d-flex justify-content-between">
	   		<h2>Expense Details</h2>
	   		<a href="/">Go Back</a>
   		</div>
   		<div class="d-flex">
	   		<div class="p-5 text-primary">
		   		<p><strong>Expense Name:</strong></p>
		   		<p><strong>Vendor:</strong></p>
		   		<p><strong>Amount:</strong></p>
		   		<p><strong>Description:</strong></p>
	   		</div>
	   		<div class="p-5">
			  	<p><c:out value="${travel.name}"></c:out></p>
			  	<p><c:out value="${travel.vendor}"></c:out></p>
			  	<p><fmt:formatNumber value="${travel.amount}" type="number" pattern="'$'###.00"/></p>
			  	<p><c:out value="${travel.description}"></c:out></p>
		  	</div>
		  </div>
   	</div>
</body>
</html>