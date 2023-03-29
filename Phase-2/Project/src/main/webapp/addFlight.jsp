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
					class="nav-link active">Flight Details</a></li>
					 <li class="nav-item">
    <a class="nav-link " href="airlineServlet">Airlines</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="source_DestSevlet">Source and Destination</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="change_password.jsp">Change Password</a>
  </li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
			
				<form action="addFlightServlet" method="post">

				<caption>
					<h2>Add Flight
            		
					</h2>
				</caption>
				
					<input type="hidden" name="id" value="<c:out value='${user.id}' />" />

				<fieldset class="form-group">
					<label>Airline</label> <input type="text" name="airline" class="form-control"
						 required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Source</label> <input type="text" name="source" class="form-control"
						>
				</fieldset>
				<fieldset class="form-group">
					<label>Destination</label> <input type="text" name="destination" class="form-control"
					>
				</fieldset>
				<fieldset class="form-group">
					<label>Price</label> <input type="number" name="price"class="form-control"
					>
				</fieldset>


				<button type="submit" class="btn btn-success">Add</button>
                ${msg }
				</form>
			</div>
		</div>
	</div>
</body>
</html>