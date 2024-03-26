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
<body>
	<div>
		<div>
			<h2>New Student</h2>
		</div>
		<div>
			<a href="/">Dashboard</a>
		</div>
		<div>
			<form:form action="/createStudent" method="post" modelAttribute="student">
				<form:label for="name" path="name">Name</form:label>
				<form:input path="name" type="text"/>
				<form:label for="dorms" path="dorm"></form:label>
   				<form:select id="dorms" path="dorm" class="form-control">
   					<c:forEach var="dorm" items="${dorms}">
   						<form:option path="dorms" value="${dorm.id}"><c:out value="${dorm.name}"></c:out></form:option>
   					</c:forEach>
   				</form:select>
			</form:form>
			<input type="submit" value="Add" />
		</div>
	</div>
</body>
</html>