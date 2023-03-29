<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="Sidebar.jsp" />
<table class="table table-striped" style="position: relative;
    left: 19pc;
    width: 75%;
    top: 29px;">
  <thead class="bg-primary">
     <tr>

						<th>First Name</th>
						<th>Last Name</th>
						<th>age</th>

					</tr>
    
  </thead>
  <tbody>

					<c:forEach var="tempStudent" items="${STUDENTS_LIST}">
						<tr>

							<td>${tempStudent.firstname}</td>
							<td>${tempStudent.lastname}</td>
							<td>${tempStudent.age}</td>



						</tr>


					</c:forEach>
  </tbody>
</table>
</body>
</html>