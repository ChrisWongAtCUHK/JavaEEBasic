package servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/*
 * For xampp
 * C:\xampp\tomcat\webapps\HelloWorld
 * http://localhost:8080/HelloWorld/HelloWorld
 */
public class HelloWorld extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Hello World</title></title>");
		pw.println("<body>");
		pw.println("<h1>Chris Wong is handsome</h1>");
		pw.println("</body></html>");
	}
}