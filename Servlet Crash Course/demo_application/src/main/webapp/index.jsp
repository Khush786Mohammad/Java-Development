<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Servlet | Spring | Spring Boot</title>
<link rel="stylesheet" href=" <%= application.getContextPath() %>/css/styles.css " /> 
</head>
<body>
	<div class="container">
	   
	   <%--
	    --%>
		<%@ include file="menu.jsp" %>
		<h1>Crash Course</h1>
		<p> This is a servlet crash course requirement for learning spring and spring boot.</p>

		<form action="<%= application.getContextPath() %>/third" method="post">
			<input type="text" placeholder="Enter Text" name="message">	
			<button type="submit">Submit</button>
		</form>
	</div>
	
	<script src="<%= application.getContextPath() %>/script/index.js"> </script>
</body>
</html>