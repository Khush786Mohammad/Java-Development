package feedback_app;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class Request2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookie = req.getCookies();
		
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		boolean isLoggedIn = false;
		if(cookie != null) {
			for(Cookie c : cookie) {
				String name = c.getName();
				if(name.equals("username")) {
					System.out.println("username : " + c.getValue());
					writer.println("""
								<h1>Welcome: %s</h1>
							""".formatted(c.getValue()));
					isLoggedIn = true;
				}
			}
		}
		if(!isLoggedIn) {
			writer.println("<h1>No Username found in cookie</h1>");
		}
	}

}
