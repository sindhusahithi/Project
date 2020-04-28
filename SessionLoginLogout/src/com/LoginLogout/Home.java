package com.LoginLogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Home extends HttpServlet {
	
	public  void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException{
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		req.getRequestDispatcher("link.html").include(req, resp);
		HttpSession session=req.getSession(false);
		if(session!=null) {
			String name=(String)session.getAttribute("name");
			out.print("Hello" +name+"Welcome to Home Page");
		}else {
		out.print("Please Login First");
		req.getRequestDispatcher("Login.html").include(req, resp);
	}
	
	out.close();
}
}
			
		
				
	
	
	


