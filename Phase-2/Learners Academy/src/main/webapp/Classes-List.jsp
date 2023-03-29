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
    
      
      <th scope="col">Class Id</th> 
      <th scope="col">Section</th>
      <th scope="col">Subject</th>
      <th scope="col">Teacher</th>
      <th scope="col">time</th>
       <th scope="col">Students</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach var="tempClass" items="${CLASSES_LIST }">
						<tr>

							<c:url var="tempLink" value="/">
								<c:param name="command" value="/ST_LIST" />
								<c:param name="classId" value="${tempClass.id }" />
								<c:param name="section" value="${tempClass.section }" />
								<c:param name="subject" value="${tempClass.subject }" />
							</c:url>
<td>${tempClass.id}</td>
							<td>${tempClass.section}</td>
							<td>${tempClass.subject}</td>
							<td>${tempClass.teacher}</td>
							<td>${tempClass.time}</td>
							<td><a href="${tempLink }">List</a></td>
 




						</tr>


					</c:forEach>
  </tbody>
</table>
</body>
</html>