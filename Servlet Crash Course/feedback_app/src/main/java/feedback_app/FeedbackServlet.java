package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/feedback")
public class FeedbackServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet working");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Feedback submitted");
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String message = req.getParameter("feedback_message");
		
		writer.print("<h1>Feedback Submitted Successfully</h1>");
		writer.println("""
					<h2>Your form details</h2>
					<h3>Email Address: %s </h3>
					<h3>Phone Number: %s </h3>
					<h3>Feedback: %s </h3>
				""".formatted(email, phone, message));
		
		resp.sendRedirect("saved.jsp");
		
		resp.setStatus(200);
	}

	
}
