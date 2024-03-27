<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Gold Game</title>
	<!-- for Bootstrap CSS -->
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
	<!-- YOUR own local CSS -->
	<link rel="stylesheet" href="/css/style.css"/>
	<!-- For any Bootstrap that uses JS -->
	<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
	
</head>
<body class="container d-flex flex-column align-items-center">
	<div class="d-flex w-100 p-3">
		<h2 class="m-3">Your Gold: <c:out value="${gold}"/></h2> 
	</div>
	<div>
		<form action="/clear" method="post">
			<input type=submit value=Reset>
		</form>
	</div>
	<div class="d-flex w-100 p-3">
		<form class="border d-flex flex-column align-items-center w-25 m-3 py-5" action="/getGold" method="post">
			<h3>Farm</h3>
			<label class="p-3">(earns 10-20 gold)</label>
			<input hidden=true type=text name=task value=farm >
			<input class="my-2 btn btn-warning" type=submit value="Find Gold!">
		</form>
		<form class="border d-flex flex-column align-items-center w-25 m-3 py-5" action="/getGold" method="post">
			<h3>Cave</h3>
			<label class="p-3">(earns 5-10 gold)</label>
			<input hidden=true type=text name=task value=cave >
			<input class="my-2 btn btn-warning" type=submit value="Find Gold!">
		</form>
		<form class="border d-flex flex-column align-items-center w-25 m-3 py-5" action="/getGold" method="post">
			<h3>House</h3>
			<label class="p-3">(earns 2-5 gold)</label>
			<input hidden=true type=text name=task value=house >
			<input class="my-2 btn btn-warning" type=submit value="Find Gold!">
		</form>
		<form class="border d-flex flex-column align-items-center w-25 m-3 py-5" action="/getGold" method="post">
			<h3>Quest</h3>
			<label class="p-3">(earns/takes 0-50 gold)</label>
			<input hidden=true type=text name=task value=quest >
			<input class="my-2 btn btn-warning" type=submit value="Find Gold!">
		</form>
		<form class="border d-flex flex-column align-items-center w-25 m-3 py-5" action="/getGold" method="post">
			<h3>Spa</h3>
			<label class="p-3">(takes 5-20 gold)</label>
			<input hidden=true type=text name=task value=spa >
			<input class="my-2 btn btn-warning" type=submit value="Relax!">
		</form>
	</div>
	<div class="d-flex w-100 flex-column p-3">
		<label class="m-3">Activities</label>
		<div id=myDiv class="border m-3">
			<c:forEach var="activity" items="${activities}">
				<c:if test = "${fn:contains(activity, 'entered')}">
					<span style="color: green"><c:out value="${activity}"></c:out></span><br>
				</c:if>
				<c:if test = "${fn:contains(activity, 'failed')}">
					<span style="color: red"><c:out value="${activity}"></c:out></span><br>
				</c:if>
				<c:if test = "${fn:contains(activity, 'completed')}">
					<span style="color: green"><c:out value="${activity}"></c:out></span><br>
				</c:if>
				<c:if test = "${fn:contains(activity, 'paid')}">
					<span style="color: red"><c:out value="${activity}"></c:out></span><br>
				</c:if>
			</c:forEach>
		</div>
	</div>
<script src="/js/script.js"></script>	
</body>
</html>