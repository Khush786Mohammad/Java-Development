<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Feedback Application</title>
    <%@include file="components/links.jsp"%>
  </head>
  <body>
  
  	<%@include file="header.jsp" %>
  	
  	<div style="height: 85vh" class="content-container py-6 d-flex flex-column justify-content-center align-items-center">
  		<a href="<%= application.getContextPath() %>/feedback.jsp" class="btn btn-dark w-25">Give Feedback</a>
  	</div>
    <%@include file="scripts.jsp" %>
  </body>
</html>