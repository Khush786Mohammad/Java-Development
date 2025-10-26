package com.application.servlet;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/third")
public class MyServlet3 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing doGet Request for third Servlet");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
		String message = req.getParameter("message");
		System.out.println("Message from user is " +message);
		System.out.println("Form Submitted Successfully");
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		Date date = new Date();
		
		writer.print(
					"<h1>Form Submitted Successfully</h1>"
				);
		
		writer.print("""
					<h2>Message : %s</h2>
					<h3>Date: %s</h3>
				""".formatted(message, date));
		
		res.setStatus(500);
		
	}
	
}
