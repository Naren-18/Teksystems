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

    <form style="position: relative;
    width: 18%;
    top: 10pc;
    margin: 0 auto;
    left: 11pc;" action="Assign_classSub" method="post">
    <strong>
  <h2 style="font-size: 1.1rem;">Assign Classes For Subjects</h2></strong>
  <div class="form-group">
  
    <label for="exampleInputEmail1">Select a Class</label>
    <select class="form-control  w-75" name="class">
    <c:forEach var="ca" items="${Classes}">
			
                        <option class="option" value="${ca.id}">${ca.id}</option>
		</c:forEach>
</select>
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Select a Subject</label>
    <select class="form-control  w-75" name="subject">
     <c:forEach var="sub" items="${Subjects}">
			
                        <option class="option" value="${sub.id}">${sub.name}</option>
		</c:forEach>
</select>
  </div>
 <br>  ${msg}<br>
  <button type="submit" class="btn btn-primary">Assign</button>
  
</form>
 
</table>
</body>
</html>