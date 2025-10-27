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

		 <div class="login-container">

		    <form action="<%= application.getContextPath() %>/third" method="post">
		      <div class="input-group">
		        <label for="username">Username</label>
		        <input type="text" id="username" name="username" placeholder="Enter your username" required>
		      </div>
		
		      <div class="input-group">
		        <label for="password">Password</label>
		        <input type="password" id="password" name="password" placeholder="Enter your password" required>
		      </div>
		
		      <button type="submit">Login</button>
    </form>
  </div>
		
	</div>
	
	<script src="<%= application.getContextPath() %>/script/index.js"> </script>
</body>
</html>