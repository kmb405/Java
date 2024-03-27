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
			<h2><c:out value="${dorm.name}"/> Students</h2>
		</div>
		<div>
			<a href="/" class="p-3">Dashboard</a>
		</div>
		<div class="form p-5">
			<form:form action="/updateStudent" method="post" modelAttribute="student">
				<input type="hidden" name="_method" value="put">
				<form:label for="student" path="name">Students</form:label>
				<form:errors path="name"/>
   				<form:select id="student" path="name" class="form-control">
   					<c:forEach var="oneStudent" items="${allStudents}">
   						<form:option path="name" value="${oneStudent}"><c:out value="${oneStudent.name}">)</c:out>(<c:out value="${oneStudent.dorm.name}"></c:out>)</form:option>
   					</c:forEach>
   				</form:select>
   				<form:errors path="dorm"/>
   				<form:input type="hidden" path="dorm" value="${dorm}"/>
   				<div class="text-end">
   					<input type="submit" value="Add" class="btn btn-primary justify-content-center m-3 px-5"/>
   				</div>
			</form:form>
			
		</div>
		<div>
			<table class="table p-5 table-striped table-bordered">
				<thead class="table-dark">
					<tr>
						<th scope="col">Student</th>
						<th scope="col">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="student" items="${students}">
						<tr>
							<td><c:out value="${student.name}"></c:out></td>
							<td><a href="/deleteStudentDorm/${student.id}"><c:out value="Remove"/></a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		
	</div>
</body>
</html>