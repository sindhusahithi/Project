package Servlet.Cookies;
//Creating and adding cookies//
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookie1 {

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();

			String n = req.getParameter("Username");
			out.print("Hello User" + n);

			Cookie ck = new Cookie("uname", n);
			resp.addCookie(ck);

			out.print("<form action='cookies1'>");
			out.print("<input type='submit' value='go'>");
			out.print("</form>");

			out.close();

		}

		catch (Exception e) {
			System.out.println(e);

		}
	}
}