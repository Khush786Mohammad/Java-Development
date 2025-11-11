package feedback_app;

import java.io.IOException;
import java.util.UUID;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/servlet1")
public class Request1Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = "khush";
		String userId = "123";
		
		Cookie cookie = new Cookie("username", username);
		cookie.setMaxAge(60*60);
		resp.addCookie(cookie);
		
		cookie = new Cookie("userId", userId);
		cookie.setMaxAge(60*60);
		resp.addCookie(cookie);
		
//		resp.setStatus(201);
		
		
		//httpSession
		String jwt = "fdaskdfjl1231235416@4356";
		HttpSession session = req.getSession();
		session.setAttribute("jwt_Token",jwt);
		session.setAttribute("userSecret", UUID.randomUUID().toString());
		session.setMaxInactiveInterval(60*10);
	}
	
	
}
