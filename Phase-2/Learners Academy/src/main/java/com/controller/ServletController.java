package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.models.Student;
import com.models.Class;
import com.models.Teacher;
import com.utils.DB_Querys;
import com.models.Subject;

/**
 * Servlet implementation class ServletController
 */
@WebServlet("/")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    Connection con;
    Statement stmt;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletController() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Resource(name="jdbc/Learners_Academy")
	DataSource datasource;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action=request.getServletPath();
//		PrintWriter out=response.getWriter();
//		out.println(action);
		System.out.println(action);
		switch(action) {
		case "/LoginServlet":
			login(request,response);
			break;
		case "/LogoutServlet":
			logout(request,response);
			break;
		case "/Subjects":
			Subjects(request,response);
			break;
		case "/Teachers":
			Teachers(request,response);
			break;
		case "/Classes":
			Classes(request, response);
			break;
		case "/Classes-subjects":
			Assign_Classes_and_subjects(request,response);
			break;
		case "/Teachers-subject":
			Assign_Classes_and_Teacher_for_subject(request,response);
			break;
		case "/Students":
			Studnets(request,response);;
			break;
		case "/Assign_classSubTeacher":
			Assign_classSubTeacher(request,response);
			break;
		case "/Assign_classSub":
			Assign_classSub(request,response);
			break;
		case "/":
			System.out.println("a");
			classStudentsList(request, response);
			break;
		default:
			break;
		
		}
	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		if(uname.equals("admin") && pass.equals("admin")) {
						
						HttpSession session=request.getSession();
						session.setAttribute("username", uname);
						session.setAttribute("password", pass);
						RequestDispatcher dispatcher = request.getRequestDispatcher("/Students");
						dispatcher.forward(request, response);
					}
					else {
						System.out.println("<h1>Invalid Login</h1>");
					}
//				
		
		
	}
	
	
	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getSession().invalidate();
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
		dispatcher.forward(request, response);
	}

	private void Subjects(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
				
						DB_Querys Utils=new DB_Querys(datasource);
						request.setAttribute("list", Utils.Subjects());
						request.setAttribute("Name", "Subjects");
						RequestDispatcher dispatcher = request.getRequestDispatcher("Subjects-List.jsp");
						dispatcher.forward(request, response);
		}
		catch(NumberFormatException ignored) {
		}
	}
	private void Teachers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DB_Querys Utils=new DB_Querys(datasource);
			request.setAttribute("list", Utils.Teachers());
			request.setAttribute("Name", "Teachers");
			RequestDispatcher dispatcher = request.getRequestDispatcher("Teachers-List.jsp");
			dispatcher.forward(request, response);
				
			
//			
		}catch(NumberFormatException ignored) {
		}
	}
	private void Studnets(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DB_Querys Utils=new DB_Querys(datasource);
						request.setAttribute("list", Utils.Students());

						request.setAttribute("Name", "Students");
						RequestDispatcher dispatcher = request.getRequestDispatcher("Students-List.jsp");
						dispatcher.forward(request, response);
					
			
//			
		}catch(NumberFormatException ignored) {
		}
	}
	private void Classes(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {			
			
			
						DB_Querys Utils=new DB_Querys(datasource);
						request.setAttribute("CLASSES_LIST", Utils.Classes());

						request.setAttribute("Name", "Classes");
						
						RequestDispatcher dispatcher = request.getRequestDispatcher("Classes-List.jsp");
						dispatcher.forward(request, response);
					
			
//			
		}
		catch(NumberFormatException ignored) {
		}
	}
	private void Assign_classSub(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int classId = Integer.parseInt(request.getParameter("class"));
		int subject =  Integer.parseInt(request.getParameter("subject"));

		// get subjects from db util
//		System.out.println(classsubject);
		DB_Querys Utils=new DB_Querys(datasource);
		int result=Utils.UpdateClassTable(classId, subject);
		if(result==1) {
			
			request.setAttribute("msg", "Assigned Succesfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Assign_Classes-Subjects.jsp");
			dispatcher.forward(request, response);
		}
	}

	private void Assign_classSubTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int classId = Integer.parseInt(request.getParameter("class"));
		int teacher =  Integer.parseInt(request.getParameter("teacher"));
		int subject =  Integer.parseInt(request.getParameter("subject"));

		// get subjects from db util
		System.out.println(classId+teacher+subject);
		DB_Querys Utils=new DB_Querys(datasource);
		int result=Utils.UpdateClassTable(classId, teacher, subject);
		if(result==1) {
			
			request.setAttribute("msg", "Assigned Succesfully");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Assign_Teacher_Class_For_Subjects.jsp");
			dispatcher.forward(request, response);
		}
	}


	private void classStudentsList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int classId = Integer.parseInt(request.getParameter("classId"));
		String section = request.getParameter("section");
		String subject = request.getParameter("subject");

		// get subjects from db util
		System.out.println("A");
		DB_Querys Utils=new DB_Querys(datasource);
		// add subjects to the request
		List<Student> stu=new ArrayList<>();
		stu=Utils.loadClassStudents(classId);
		System.out.println(stu.size());
		request.setAttribute("STUDENTS_LIST",stu );
		request.setAttribute("Name", "Students of "+ subject+" class of "+classId+" section of "+section);

		// send it to the jSP view page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/class-students.jsp");
		dispatcher.forward(request, response);
		
	}


	private void Assign_Classes_and_subjects(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			DB_Querys Utils=new DB_Querys(datasource);
				request.setAttribute("Subjects", Utils.Subjects());
					
						
				request.setAttribute("Classes", Utils.Classes());
				RequestDispatcher dispatcher = request.getRequestDispatcher("/Assign_Classes-Subjects.jsp");
				dispatcher.forward(request, response);

//			
		}catch(NumberFormatException ignored) {
		}
		
	}

	private void Assign_Classes_and_Teacher_for_subject(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
						DB_Querys Utils=new DB_Querys(datasource);
						request.setAttribute("Subjects", Utils.Subjects());
					
						request.setAttribute("Classes", Utils.Classes());
								
						request.setAttribute("Teachers", Utils.Teachers());
						RequestDispatcher dispatcher = request.getRequestDispatcher("/Assign_Teacher_Class_For_Subjects.jsp");
						dispatcher.forward(request, response);

//			
		}catch(NumberFormatException ignored) {
		}
		
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
