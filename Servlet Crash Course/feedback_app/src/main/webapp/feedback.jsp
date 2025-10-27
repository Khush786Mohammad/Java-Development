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
  	
  	<div class="content-container py-6 d-flex flex-column justify-content-center align-items-center">
  		<h3 class="text-black mt-3">Fill The Feedback Form</h3>
  		
  		<form action="<%= application.getContextPath() %>/feedback" method="post" class="mt-3 fw-semibold">
  		
		  <div class="mb-3">
		    <label for="exampleInputEmail1" class="form-label">Email address</label>
		    <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="email" placeholder="xyz@gmail.com">
		    <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
		  </div>
		  
		  <div class="mb-3">
		    <label for="contactNumber" class="form-label">Contact No</label>
		    <input type="text" class="form-control" id="contactNumber" name="phone" placeholder="Contact No">
		  </div>
		  
		  
		  <div class="mb-3">
			  <label for="message" class="form-label">Message</label>
			  <textarea class="form-control" id="message" rows="4" name="feedback_message" placeholder="Enter your message here"></textarea>
		  </div>
		  
		  <div class="mb-3 form-check">
		    <input type="checkbox" class="form-check-input" id="exampleCheck1" required>
		    <label class="form-check-label" for="exampleCheck1">I Accept All Terms & Conditions</label>
		  </div>
		  
		  <button type="submit" class="btn btn-primary mb-3">Submit</button>
		</form>
  	</div>
    <%@include file="scripts.jsp" %>
  </body>
</html>