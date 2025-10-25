package com.application.servlet;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class MyServlet implements Servlet{
	
	private ServletConfig servletConfig;
	
	// Life Cycle Methods
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		this.servletConfig = arg0;
		System.out.println("Initializing Servlet");		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("Service Request");	
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet Destroyed");		
	}
	
//	Non-LifeCycle Method of Servlet
	@Override
	public ServletConfig getServletConfig() {
		
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		return "This Servlet was created by: Khush Mohammad";
	}

	
}
