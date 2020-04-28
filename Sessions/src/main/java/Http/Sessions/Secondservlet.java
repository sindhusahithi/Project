package Http.Sessions;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Secondservlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		try {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			HttpSession session = request.getSession(false);
			String n = (String) session.getAttribute("uname");

			out.print("Hello" + n);
			out.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
