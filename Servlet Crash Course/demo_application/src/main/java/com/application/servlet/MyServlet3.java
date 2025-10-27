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
		String name = req.getParameter("username");
		String pass = req.getParameter("password");
		System.out.println("Username is " +name);
		System.out.println("Password is " +pass);
		System.out.println("Form Submitted Successfully");
		
		res.setContentType("text/html");
		PrintWriter writer = res.getWriter();
		Date date = new Date();
		
		writer.print(
					"<h1>Login Successfully</h1>"
				);
		
		writer.print("""
					<h2>Username : %s</h2>
					<h2>Password : %s</h2>
					<h3>Date: %s</h3>
				""".formatted(name, pass, date));
		
		res.setStatus(200);
		
	}
	
}
