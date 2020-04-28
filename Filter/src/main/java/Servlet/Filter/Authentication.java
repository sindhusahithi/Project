package Servlet.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//Authenticating user using filter//
public class Authentication implements Filter {
	public void init(FilterConfig arg0) throws ServletException{}
		
			public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws IOException,ServletException{
		PrintWriter out=response.getWriter();
		
		
		String password=request.getParameter("Password");
		if(password.equals("password")) {
			chain.doFilter(request, response);
		}else
		{
			out.print("Wrong Username or password ");
			RequestDispatcher rd=request.getRequestDispatcher("index.html");
			rd.include(request, response);
			
		}
			}
			public void destroy() {}
		
		
	}
	
	


