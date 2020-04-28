package Servlet.Filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter implements Filter {
	
	public void init(FilterConfig arg0) throws ServletException {}  
    
	public void doFilter(ServletRequest req, ServletResponse resp,  
	    FilterChain chain) throws IOException, ServletException {  
		
		PrintWriter  out=resp.getWriter();
		out.print("Filter is invoked before");
		
		chain.doFilter(req, resp);
		
		out.print("Filter is Invoked after");
	}
	public void destroy() {}
}

