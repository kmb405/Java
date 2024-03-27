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
    <title>New Dojo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   	<div class="bg-secondary w-50 mb-5 p-5 text-light form-group">
   		<h1>New Dojo</h1>
   		<div >
   			<form:form action="/createDojo" method="post" modelAttribute="dojo">
	   			<form:label for="name" path="name">Name: </form:label>
	   			<form:errors path="name" class="text-danger"/>
				<form:input path="name" class="form-control"/>
	   			<input type="submit" value="Create" class="btn btn-rounded btn-warning my-3"/>	
   			</form:form>
   		</div>
   	</div>
</body>
</html>