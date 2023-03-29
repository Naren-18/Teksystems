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


@WebServlet("/bookingSevlet")
public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
     Connection con;
     Statement stmt;
     ResultSet resultSet;
    public BookingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Resource(name="jdbc/airline")
	DataSource datasource;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Flights> flights = new ArrayList<>();
		String date=request.getParameter("date");
		String source=request.getParameter("source");
		String destination=request.getParameter("destination");
		String No_of_persons=request.getParameter("no_of_persons");
		PrintWriter out=response.getWriter();
		try {
			con=datasource.getConnection();
			stmt = con.createStatement();
					resultSet = stmt.executeQuery("select * from flights where Source= '"+source+"' and Destination= '"+destination+"'");
					if(resultSet.next()) {
					while (resultSet.next()) {
						int id = resultSet.getInt("id");
						String Name = resultSet.getString("Name");
						String Source = resultSet.getString("Source");
						String Destination = resultSet.getString("Destination");
						String Price = resultSet.getString("Price");
						System.out.println("ASAS"+Name+"-"+Source+"-"+Destination);
						Flights flight = new Flights(id, Name, Source, Destination,Price);
							    flights.add(flight);
							
					}
					request.setAttribute("flights__", flights);
					request.setAttribute("date", date);
					request.setAttribute("no_of_persons", No_of_persons);
					RequestDispatcher dispatcher = request.getRequestDispatcher("/Flight_selection.jsp");
					dispatcher.forward(request, response);
					}
					request.setAttribute("msg", "Invalid Travel Details");
					request.setAttribute("no_of_persons", No_of_persons);
					RequestDispatcher dispatcher = request.getRequestDispatcher("/Home.jsp");
					dispatcher.forward(request, response);
					
				
				}
				catch(SQLException e) {
					e.printStackTrace();
				}

	}
	public void destroy() {
		if(con !=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
