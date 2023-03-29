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
      <th scope="col">Id</th>
      <th scope="col">First Name</th>
      <th scope="col">Last Name</th>
      <th scope="col">Age</th>
    </tr>
  </thead>
  <tbody>
 <c:forEach  var="lis" items="${list}">
 
    <tr>
 <th scope="row">${lis.id}</th>
      <td>${lis.firstname}</td>
      <td>${lis.lastname}</td>
      <td>${lis.age}</td>
    </tr>
 </c:forEach>
  </tbody>
</table>
</body>
</html>