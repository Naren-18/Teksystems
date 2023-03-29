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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import com.airline.models.Booking;
import com.airline.models.Flights;


@WebServlet("/changePassSevlet")
public class ChangePassSevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
     Connection con;
     Statement stmt;
     ResultSet resultSet;
    public ChangePassSevlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Resource(name="jdbc/airline")
	DataSource datasource;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cpass=request.getParameter("cpass");
		String npass=request.getParameter("npass");
		HttpSession session=request.getSession();
		String oldPass=(String) session.getAttribute("password");
		try {
			List<String> flights = new ArrayList<>();
				con=datasource.getConnection();
				stmt = con.createStatement();
				System.out.println(oldPass+cpass);
				if(!oldPass.equals(cpass)) {
					request.setAttribute("msg", "Invalid Current password");
					RequestDispatcher dispatcher1 = request.getRequestDispatcher("change_password.jsp");
					dispatcher1.forward(request, response);
				}else {
						int result = stmt.executeUpdate("update login set password='" +npass+"'");
//				
						if(result==1) {
							session.setAttribute("password",npass);
							request.setAttribute("flights__", flights);
							request.setAttribute("msg", "Password Change Succesfully");
							RequestDispatcher dispatcher = request.getRequestDispatcher("change_password.jsp");
							dispatcher.forward(request, response);
						}
					
					
					
				}
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
		doGet(request, response);
	}
}
