package com.airline.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import com.airline.models.Flights;




@WebServlet("/conformationServlet")
public class ConformationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Set<String> set=new HashSet<String>();
     Connection con;
     Statement stmt;
     ResultSet resultSet;
    public ConformationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Resource(name="jdbc/airline")
	DataSource datasource;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flights> flights = new ArrayList<>();
		String Flight_id=request.getParameter("Flight_id");
		String date=request.getParameter("Date");
		String airline=request.getParameter("Airline");
		String Total=request.getParameter("Total");
		String source=request.getParameter("Source");
		String destination=request.getParameter("Destination");
		String No_of_persons=request.getParameter("no_of_persons");
		String Name=request.getParameter("Name");
		String Number=request.getParameter("Number");
		PrintWriter out=response.getWriter();
//		String No_of_persons=request.getParameter("no_of_persons");
		System.out.println("Persons"+No_of_persons);
		try {
			con=datasource.getConnection();
			stmt = con.createStatement();
					int Result = stmt.executeUpdate("insert into booking values(1,'"+ Name + "','"+ Number +"','"+date+"','"+No_of_persons+"','"+airline+"','"+source+"','"+destination+"','"+Total+"');");
	
					request.setAttribute("Name", Name);
					request.setAttribute("Number", Number);
					request.setAttribute("no_of_persons", No_of_persons);
					request.setAttribute("Total", Total);
					request.setAttribute("Flight_id", Flight_id);
					request.setAttribute("date", date);
					request.setAttribute("Airline", airline);
					request.setAttribute("Source", source);
					request.setAttribute("Destination", destination);
						RequestDispatcher dispatcher = request.getRequestDispatcher("/Confirmed.jsp");
						dispatcher.forward(request, response);
				}
				catch(SQLException e) {
					e.printStackTrace();
				}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	public void destroy() {
		if(con !=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
