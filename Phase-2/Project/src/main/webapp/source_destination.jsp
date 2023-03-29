<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>FlyAway</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav style="    background-color: black;
    font-weight: bolder;" class="navbar navbar-expand-md navbar-dark"
			style="background-color: tomato">
			<div>
				<a href="https://www.javaguides.net" class="navbar-brand"> FlyAway Admin </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="flightsServlet"
					class="nav-link">Flight Details</a></li>
					 <li class="nav-item">
    <a class="nav-link " href="airlineServlet">Airlines</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" href="source_DestSevlet">Source and Destination</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="change_password.jsp">Change Password</a>
  </li>
			</ul>
		</nav>
	</header>
	<br>

	<div class="row">
		<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

		<div class="container">
			<h3 class="text-center">Master List of Source and Destination</h3>
			<hr>
			<div class="container text-left">

				<a href="addFlight.jsp" class="btn btn-success">Add
					New Flight</a>
			</div>
			<br>
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>Source</th>
						<th>Destination</th>
					</tr>
				</thead>
				<tbody>
					<!--   for (Todo todo: todos) {  -->
					<c:forEach var="flight" items="${flights__}">

						<tr>
							<td><c:out value="${flight.source}" /></td>
							<td><c:out value="${flight.destination}" /></td>
						</tr>
					</c:forEach>
					<!-- } -->
				</tbody>

			</table>
		</div>
	</div>
</body>
</html>