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
			<h2><c:out value="${dorm.name}"/> Students</h2>
		</div>
		<div>
			<a href="/">Dashboard</a>
		</div>
		<div>
			<form:form action="/createStudent" method="post" modelAttribute="student">
				<form:label for="student" path="name">Students</form:label>
   				<form:select id="student" path="name" class="form-control">
   					<c:forEach var="student" items="${allStudents}">
   						<form:option path="student" value="${student.id}"><c:out value="${student.name}">)</c:out>(<c:out value="${student.dorm.name}"></c:out>)</form:option>
   					</c:forEach>
   				</form:select>
   				<input type="submit" value="Add" />
			</form:form>
			
		</div>
		<div>
			<table>
				<thead>
					<tr>
						<th>Student</th>
						<th>Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="student" items="${students}">
						<tr>
							<td><c:out value="${student.name}"></c:out></td>
							<td><a href="/deleteStudent">Remove</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
	</div>
</body>
</html>