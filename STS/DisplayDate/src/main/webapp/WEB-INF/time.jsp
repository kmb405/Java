<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Time</title>
        <link rel="stylesheet" type="text/css" href="/css/style.css">
		<script type="text/javascript" src="/js/time.js"></script>
    </head>
<body>
	<div class="container">
	    <p><c:out value="${time}"/></p>
	</div>
</body>
</html>
