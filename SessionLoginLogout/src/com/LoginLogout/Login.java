package com.LoginLogout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Login extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		req.getRequestDispatcher("link.html").include(req, resp);

		String name = req.getParameter("name");
		String password = req.getParameter("password");

		if (password.equals("admin123")) {
			out.print("Welcome" + name);
			HttpSession session = req.getSession();
			req.setAttribute("name", name);
		} else {
			out.print("Sorry! username and password is incorrect");
			req.getRequestDispatcher("Login.html").include(req, resp);

			out.close();
		}
	}

}
