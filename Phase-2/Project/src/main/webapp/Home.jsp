<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>FlyAway | Home</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/global.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
        body, html {
            height: 100%;
            line-height: 1.8;
        }
        body {
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background: linear-gradient(#b9d2ff, #111c29);
}
        .bgimg-1 {
            background-position: center;
            background-size: cover;
            background-image: url("img/plane.png");
            min-height: 100%;
        }
        .w3-bar .w3-button {
            padding: 16px;
        }
          .login-box {
          width: 400px;
    padding: 40px;
    transform: translate(-50%, -50%);
    background: rgb(0 0 0 / 80%);
    box-sizing: border-box;
    box-shadow: 0 15px 25px rgb(0 0 0 / 60%);
    border-radius: 10px;
    position: relative;
    left: 70%;
    height: 34pc;
    top: 257px;
  }
  
  .login-box h2 {
    margin: 0 0 30px;
    padding: 0;
    color: #fff;
    text-align: center;
  }
  
  .login-box .user-box {
    position: relative;
  }
  .option{
  color:black;
  }
  .login-box .user-box input,.login-box .user-box select{
    width: 100%;
    padding: 10px 0;
    font-size: 16px;
    color: #fff;
    margin-bottom: 30px;
    border: none;
    border-bottom: 1px solid #fff;
    outline: none;
    background: transparent;
  }
  .login-box .user-box label {
    position: absolute;
    top: 0;
    left: 0;
    padding: 10px 0;
    font-size: 16px;
    color: white;
    pointer-events: none;
    transition: 0.5s;
  }
  
  .login-box .user-box input:focus ~ label,
  .login-box .user-box input:valid ~ label{
    top: -20px;
    left: 0;
    color: #03e9f4;
    font-size: 12px;
  }
  
  .login-box form .design {
    position: relative;
    display: inline-block;
    padding: 10px 20px;
    color: #03e9f4;
    font-size: 16px;
    text-decoration: none;
    text-transform: uppercase;
    overflow: hidden;
    transition: 0.5s;
    margin-top: 40px;
    letter-spacing: 4px;
  }
  
  .login-box .design:hover {
    background: #03e9f4;
    color: #fff;
    border-radius: 5px;
    box-shadow: 0 0 5px #03e9f4, 0 0 25px #03e9f4, 0 0 50px #03e9f4,
      0 0 100px #03e9f4;
  }
  
  .login-box a span {
    position: absolute;
    display: block;
  }
  
  .login-box a span:nth-child(1) {
    top: 0;
    left: -100%;
    width: 100%;
    height: 2px;
    background: linear-gradient(90deg, transparent, #03e9f4);
    animation: btn-anim1 1s linear infinite;
  }
  
  @keyframes btn-anim1 {
    0% {
      left: -100%;
    }
    50%,
    100% {
      left: 100%;
    }
  }
  
  .login-box a span:nth-child(2) {
    top: -100%;
    right: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(180deg, transparent, #03e9f4);
    animation: btn-anim2 1s linear infinite;
    animation-delay: 0.25s;
  }
  
  @keyframes btn-anim2 {
    0% {
      top: -100%;
    }
    50%,
    100% {
      top: 100%;
    }
  }
  
  .login-box a span:nth-child(3) {
    bottom: 0;
    right: -100%;
    width: 100%;
    height: 2px;
    background: linear-gradient(270deg, transparent, #03e9f4);
    animation: btn-anim3 1s linear infinite;
    animation-delay: 0.5s;
  }
  
  @keyframes btn-anim3 {
    0% {
      right: -100%;
    }
    50%,
    100% {
      right: 100%;
    }
  }
  
  .login-box a span:nth-child(4) {
    bottom: -100%;
    left: 0;
    width: 2px;
    height: 100%;
    background: linear-gradient(360deg, transparent, #03e9f4);
    animation: btn-anim4 1s linear infinite;
    animation-delay: 0.75s;
  }
  
  @keyframes btn-anim4 {
    0% {
      bottom: -100%;
    }
    50%,
    100% {
      bottom: 100%;
    }
  }
  label{
      color: cornflowerblue;}
    </style>
</head>
<body>
<div class="w3-right w3-hide-small">
        <a href="login.jsp" class="w3-bar-item w3-button"> Admin Login</a>
    </div>
<section class="container-fluid bg">
    <section class="row justify-content-center">
        <div class="row">
            <div class="col">
                <h2 align="center" style="color:black;    margin: 12px 120px;
    font-family: sans-serif;"><b>FlyAway Booking System</b></h2>
                <br>
            </div>
        </div>
        <section class="col-sm-6 col-md-3" style="position: absolute;">
            <img src="https://t3.ftcdn.net/jpg/00/98/56/46/360_F_98564657_nwro1XnJs2DgoEtMjPtHX4Ajf7KDJ6lx.jpg" style="border-radius: 10px;
    height: 35pc;
    width: 79.5pc;
    opacity: .7;"/>
        </section>
        <section class="col-sm-6 col-md-3" 	 >
     --  <div class="login-box">
        <h2>Booking Details </h2>
        <h4 style="color:red;">${msg}</h4>  
        <form  action="bookingSevlet" method="post">
          <label for="persons">Date</label>
          <div class="user-box">
                    <input type="date"  class="form-control" id="date" name="date" placeholder="Travel Date..">
          </div>
                    <label for="source">Source</label>
          <div class="user-box">
                    <select name="source">
                        <option class="option" value="Hyderabad">Hyderabad</option>
                        <option class="option" value="Banglore">Banglore</option>
                        <option class="option" value="Mumbai">Mumbai</option>
                    </select>
                </div>
                    <label for="destination">Destination</label>
                <div class="user-box">
                    <select id="destination" name="destination">
                        <option class="option" value="Hyderabad">Hyderabad</option>
                        <option class="option" value="Banglore">Banglore</option>
                        <option class="option" value="Mumbai">Mumbai</option>
                    </select>
                </div>
                    <label for="persons">No of Persons</label>
                <div class="user-box">
                    <select  id="persons" name="no_of_persons">
                        <option class="option" value="1">1</option>
                        <option class="option" value="2">2</option>
                        <option class="option" value="3">3</option>
                        <option class="option" value="4">4</option>
                        <option class="option" value="5">5</option>
                    </select>
                </div>
          <button type="submit" class="btn btn-success btn-block" value="Submit" style="    color: #333;
    background-color: cornflowerblue;
    border-color: cornflowerblue;">Search Flights</button>
        </form>
      </div>
        </section>
    </section>
</section>
<div class="footer" align="center">
</div>
</body>
</html><!-- 
            <form action="search" class="form-container">
                <div class="form-group">
                    <label for="date">Date</label>
                    <input type="date"  class="form-control" id="date" name="date" placeholder="Travel Date..">
                </div>
                <div class="form-group">
                    <label for="source">Source</label>
                    <select  class="form-control" id="source" name="source">
                        <option value="India">India</option>
                        <option value="USA">USA</option>
                        <option value="UK">UK</option>
                    </select>
                </div>
                <div class="form-group">
                    <label for="destination">Destination</label>
                    <select  class="form-control" id="destination" name="destination">
                        <option value="USA">USA</option>
                        <option value="UK">UK</option>
                        <option value="India">India</option>
                    </select>
                </div>
                <div>
                    <label for="persons">No of Persons</label>
                    <select class="form-control" id="persons" name="persons">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
                <br>
                <button type="submit" class="btn btn-success btn-block" value="Submit">Search Flights</button>
            </form> -->