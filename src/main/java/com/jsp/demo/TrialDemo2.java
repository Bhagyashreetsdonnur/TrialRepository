package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("trial2")
public class TrialDemo2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 String name=req.getParameter("name");
		    String email=req.getParameter("email");
		PrintWriter out=resp.getWriter();
			
			out.println("name="+name);
			out.println("email="+email);
			
			System.out.println("This is Demo2 class");

	}

}
