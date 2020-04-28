/*package Servlet.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterConfig implements Filter {
	
	FilterConfig config;
	public void init(FilterConfig config) throws ServletException{
		this.config=config;
	}
public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws ServletException,IOException{
PrintWriter out=response.getWriter();

String s=config.getInitparameter();
if(s.equals("Yes")) {
	out.print("This page is Under Construction");
}else 
	chain.doFilter(request, response);
}


public void destroy() {}
}
*/