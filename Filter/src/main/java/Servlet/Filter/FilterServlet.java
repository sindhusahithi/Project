package Servlet.Filter;
//sending response by filter only//
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterServlet implements Filter{
 public void init(FilterConfig arg0) throws ServletException{}
	 
	 public void doFilter(ServletRequest req,ServletResponse resp,FilterChain chain) throws IOException,ServletException{
		 
		 PrintWriter out=resp.getWriter();
		 
		 out.print("</br> This site is under construction");
		 out.close();
	 }
	 public void destroy() {} 
 }

