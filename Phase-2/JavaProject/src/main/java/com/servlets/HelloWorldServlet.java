package com.servlets;
import java.io.*;
import javax.servlet.*;

public class HelloWorldServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>World from Servlets</h3>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
