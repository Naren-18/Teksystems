package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AdditionServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		PrintWriter out=res.getWriter();
		if(num1==null || num2==null || num1.isBlank() || num2.isBlank() || num2.isEmpty() || num1.isEmpty()) {
			out.println("<h3>Invalid Input.</h3>");
		}else {
			out.println("<html>");
			try {
				int n1 = Integer.parseInt(num1);
				int n2 = Integer.parseInt(num2);
				int result = n1 + n2;

				out.println("<h3>Result is .</h3>"+result);
			}
			catch(NumberFormatException e) {
				out.println("<h3>Invalid Input.</h3>");
			}
			out.println("</html>");
		}
	}

}
