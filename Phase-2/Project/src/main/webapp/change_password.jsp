<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>MyAirline</title>
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
				<a href="https://www.javaguides.net" class="navbar-brand"> MyAirline Admin </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="flightsServlet"
					class="nav-link">Flight Details</a></li>
					 <li class="nav-item">
    <a class="nav-link " href="airlineServlet">Airlines</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="source_DestSevlet">Source and Destination</a>
  </li>
  <li class="nav-item">
    <a class="nav-link active" href="change_password.jsp">Change Password</a>
  </li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
					<form action="changePassSevlet" method="post">

				<caption>
					<h2>Change Password 
            		
					</h2>
				</caption>

				<fieldset class="form-group">
					<label>Current Password</label> <input type="text"
						 class="form-control"
						name="cpass" required>
				</fieldset>

				<fieldset class="form-group">
					<label>New Password</label> <input type="text" class="form-control"
						name="npass" required>
				</fieldset>


				<button type="submit" class="btn btn-success">Change</button>
				</form>
				<p >${msg}</p>
			</div>
		</div>
	</div>
</body>
</html>