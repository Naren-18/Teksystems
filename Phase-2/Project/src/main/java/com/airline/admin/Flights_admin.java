package com.airline.admin;

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
import com.airline.models.Booking;
import com.airline.models.Flights;


@WebServlet("/flightsServlet")
public class Flights_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
     Connection con;
     Statement stmt;
     ResultSet resultSet;
    public Flights_admin() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Resource(name="jdbc/airline")
	DataSource datasource;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			List<Flights> flights = new ArrayList<>();
				con=datasource.getConnection();
				stmt = con.createStatement();
						resultSet = stmt.executeQuery("select * from flights");
				
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
						RequestDispatcher dispatcher = request.getRequestDispatcher("flights.jsp");
						dispatcher.forward(request, response);
					
			
//			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}catch(NumberFormatException ignored) {
		}
			}

	private void EditUser() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
