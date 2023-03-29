package com.utils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.models.Student;
import com.models.Subject;
import com.models.Teacher;
import com.models.Class;

public class DB_Querys {

	private DataSource datasource;

	Connection con = null;
	Statement stmt = null;
	
	
	public DB_Querys(DataSource datasource) {
		this.datasource = datasource;
		
	}

	public List<Subject> Subjects() {
		List<Subject> temp_list = new ArrayList<>();
		try {
			// get connection from connection pool
			con = this.datasource.getConnection();
			stmt =  con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from subjects");
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name");
				Subject Subjects= new Subject(id, name);
					    temp_list.add(Subjects);
					    System.out.println(id);
					
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,stmt);
		}
		return temp_list; 
		
	}
	public List<Teacher> Teachers() {
		List<Teacher> temp_list = new ArrayList<>();
		try {
			// get connection from connection pool
			
			con = this.datasource.getConnection();
			stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from teachers");
	
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String fname = resultSet.getString("firstname");
				String lname = resultSet.getString("lastname");
				int age = resultSet.getInt("age");
				Teacher teah = new Teacher(id, fname, lname,age);
				temp_list.add(teah);
				System.out.println(id);
					
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,stmt);
		}
		return temp_list; 
		
	}
	
	
	public List<Class> Classes() {
		List<Class> classes = new ArrayList<>();
		try {
			// get connection from connection pool
			con = this.datasource.getConnection();
			stmt =  con.createStatement();
			ResultSet myRs = stmt.executeQuery("select * from classes");
			
			while (myRs.next()) {
				int id = myRs.getInt("id");
				int section = myRs.getInt("section");
				int subject = myRs.getInt("subject");
				int teacher = myRs.getInt("teacher");
				String time = myRs.getString("time");

				Teacher tempTeacher = loadTeacher(teacher);
				Subject tempSubject = loadSubject(subject);

				String teacher_name = tempTeacher.getfirstname() + " " + tempTeacher.getlastname();

				// create new student object
				Class temp = new Class(id, section, teacher_name, tempSubject.getName(), time);

				// add it to the list of students
				classes.add(temp);
					
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,stmt);
		}
		return classes; 
		
	}
	public List<Student> Students() {
		List<Student> temp_list = new ArrayList<>();
		try {
			// get connection from connection pool
			con = this.datasource.getConnection();
			stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery("select * from students");
	
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String fname = resultSet.getString("firstname");
				String lname = resultSet.getString("lastname");
				int age = resultSet.getInt("age");
				int aclass= resultSet.getInt("class");
				System.out.println(id);
				Student stu= new Student(id, fname, lname, age,aclass);
					    temp_list.add(stu);
					
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,stmt);
		}
		return temp_list; 
		
	}
	
	
	private void close(Connection con, Statement stmt) {

		try {

			if (stmt != null)
				stmt.close();
			if (con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Student> loadClassStudents(int classId) {

		List<Student> students = new ArrayList<>();

		Connection myConn = null;
		Statement myStmt = null;
		System.out.println("IN");
		try {

			// get a connection
			myConn = datasource.getConnection();

			// create sql stmt
			String sql = "select * from students WHERE class =" + classId;
			myStmt = myConn.createStatement();

			// execute query
			ResultSet res = myStmt.executeQuery(sql);

			// process result
			int size=0;
			while (res.next()) {
			    size++;
			    System.out.println(size);

//			if (res.next()) {
				
				// retrieve data from result set row
				int id = res.getInt("id");
				String firstName = res.getString("firstname");
				String lastName = res.getString("lastname");
				int age = res.getInt("age");
				int aclass = res.getInt("class");
				// create new student object
				Student tempStudent = new Student(id, firstName, lastName, age, aclass);
				students.add(tempStudent);
				System.out.println("B "+tempStudent.getfirstname());
//
//			}else {
//				size=1000;
//				System.out.println("ASAS"+size);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt);
		}
		System.out.println(students.size());
		return students;

	}

	public Teacher loadTeacher(int teacherId) {

		Teacher theTeacher = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			myConn = datasource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM teachers WHERE id = " + teacherId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String fname = myRs.getString("firstname");
				String lname = myRs.getString("lastname");
				int age = myRs.getInt("age");
				theTeacher = new Teacher(id, fname, lname, age);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt);
		}
		return theTeacher;

	}

	public Subject loadSubject(int subjectId) {

		Subject theSubject = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			myConn = datasource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM subjects WHERE id = " + subjectId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				String name = myRs.getString("name");

				theSubject = new Subject(id, name);

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt);
		}
		return theSubject;

	}

	public Class loadClass(int classId) {

		Class theClass = null;

		Connection myConn = null;
		Statement myStmt = null;
		ResultSet myRs = null;

		try {

			// get a connection
			myConn = datasource.getConnection();

			// create sql stmt
			String sql = "SELECT * FROM clasess WHERE id = " + classId;
			myStmt = myConn.createStatement();

			// execute query
			myRs = myStmt.executeQuery(sql);

			// process result
			while (myRs.next()) {

				// retrieve data from result set row
				int id = myRs.getInt("id");
				int section = myRs.getInt("section");
				int subject = myRs.getInt("subject");
				int teacher = myRs.getInt("teacher");
				String time = myRs.getString("time");

				Teacher tempTeacher = loadTeacher(teacher);
				Subject tempSubject = loadSubject(subject);

				String teacher_name = tempTeacher.getfirstname() + " " + tempTeacher.getlastname();
				

			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			// close JDBC objects
			close(myConn, myStmt);
		}
		return theClass;

	}
	public int UpdateClassTable(int classId,int teach,int sub ) {
		List<Teacher> temp_list = new ArrayList<>();
		try {
			// get connection from connection pool
			
			con = this.datasource.getConnection();
			stmt = con.createStatement();
			int result = stmt.executeUpdate("update classes set teacher="+teach+", subject="+sub+" where id="+classId );
	
			if (result==1) {
				return 1;
					
			}
			else {
				return 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,stmt);
		}
		return 0;
		
	}
	public int UpdateClassTable(int classId,int sub ) {
		try {
			// get connection from connection pool
			
			con = this.datasource.getConnection();
			stmt = con.createStatement();
			int result = stmt.executeUpdate("update classes set subject="+sub+" where id="+classId );
	
			if (result==1) {
				return 1;
					
			}
			else {
				return 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,stmt);
		}
		return 0;
		
	}

}
