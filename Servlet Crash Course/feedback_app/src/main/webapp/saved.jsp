<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Feedback Application</title>
<%@include file="components/links.jsp"%>
</head>
<body>
	<%@include file="header.jsp" %>
		<div style="height: 80vh" class="content-container py-6 d-flex flex-column justify-content-center align-items-center">
	  		<div class="alert alert-success mt-3" role="alert">
	  			✅ Feedback submitted successfully!
			</div>
		</div>			
    <%@include file="scripts.jsp" %>
</body>
</html>