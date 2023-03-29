<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FlyAway | Details</title>
</head>
<style>
html, body{
  width: 100%;
  height: 100%;
  margin: 0;
  padding: 0;
  font-family: 'Open Sans', sans-serif;
 background: linear-gradient(#b9d2ff, #111c29);
}

h1, h2, h3, h4, h5 ,h6{
  font-weight: 200;
}

a{
  text-decoration: none;
}

p, li, a{
  font-size: 14px;
}

fieldset{
  margin: 0;
  padding: 0;
  border: none;
}

/* GRID */

.twelve { width: 100%; }
.eleven { width: 91.53%; }
.ten { width: 83.06%; }
.nine { width: 74.6%; }
.eight { width: 66.13%; }
.seven { width: 57.66%; }
.six { width: 49.2%; }
.five { width: 40.73%; }
.four { width: 32.26%; }
.three { width: 23.8%; }
.two { width: 15.33%; }
.one { width: 6.866%; }

/* COLUMNS */

.col {
  display: block;
  float:left;
  margin: 0 0 0 1.6%;
}

.col:first-of-type {
  margin-left: 0;
}

.container{
  width: 100%;
  max-width: 700px;
  margin: 0 auto;
  position: relative;
}

.row{
  padding: 20px 0;
}

/* CLEARFIX */

.cf:before,
.cf:after {
    content: " ";
    display: table;
}

.cf:after {
    clear: both;
}

.cf {
    *zoom: 1;
}

.wrapper{
  width: 100%;
  margin: 30px 0;
}

/* STEPS */

.steps{
      list-style-type: none;
    margin: 0;
    padding: 0;
    background-color: #4f5b70b3;
    text-align: center;
    font-weight: bolder;
    color: white;
}


.steps li{
  display: inline-block;
  margin: 20px;
  
  padding-bottom: 5px;
}

.steps li.is-active{
  border-bottom: 1px solid #3498db;
  color: #3498db;
}

/* FORM */

.form-wrapper .section{
  padding: 0px 20px 30px 20px;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  background-color: #fff;
  opacity: 0;
  -webkit-transform: scale(1, 0);
  -ms-transform: scale(1, 0);
  -o-transform: scale(1, 0);
  transform: scale(1, 0);
  -webkit-transform-origin: top center;
  -moz-transform-origin: top center;
  -ms-transform-origin: top center;
  -o-transform-origin: top center;
  transform-origin: top center;
  -webkit-transition: all 0.5s ease-in-out;
  -o-transition: all 0.5s ease-in-out;
  transition: all 0.5s ease-in-out;
  text-align: center;
  position: absolute;
  width: 100%;
  min-height: 300px;
  background: #0000006b;
}

.form-wrapper .section h3{
  margin-bottom: 30px;
}

.form-wrapper .section.is-active{
background: #0000006b;
  opacity: 1;
  -webkit-transform: scale(1, 1);
  -ms-transform: scale(1, 1);
  -o-transform: scale(1, 1);
  transform: scale(1, 1);
}

.form-wrapper .button, .form-wrapper .submit{
  background-color: #3498db;
  display: inline-block;
  padding: 8px 30px;
  color: #fff;
  cursor: pointer;
  font-size: 14px !important;
  font-family: 'Open Sans', sans-serif !important;
  position: absolute;
  right: 20px;
  bottom: 20px;
}

.form-wrapper .submit{
  border: none;
  outline: none;
  -webkit-box-sizing: content-box;
  -moz-box-sizing: content-box;
  box-sizing: content-box;
  -webkit-appearance: none;
  -moz-appearance: none;
  appearance: none;
}

.form-wrapper input[type="text"],
.form-wrapper input[type="password"]{
  display: block;
  padding: 10px;
  margin: 10px auto;
  background-color: #f1f1f1;
  border: none;
  width: 50%;
  outline: none;
  font-size: 14px !important;
  font-family: 'Open Sans', sans-serif !important;
}

.form-wrapper input[type="radio"]{
  display: none;
}

.form-wrapper input[type="radio"] + label{
  display: block;
  border: 1px solid #ccc;
  width: 100%;
  max-width: 100%;
  padding: 10px;
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
  cursor: pointer;
  position: relative;
}

.form-wrapper input[type="radio"] + label:before{
  content: "✔";
  position: absolute;
  right: -10px;
  top: -10px;
  width: 30px;
  height: 30px;
  line-height: 30px;
  border-radius: 100%;
  background-color: #3498db;
  color: #fff;
  display: none;
}

.form-wrapper input[type="radio"]:checked + label:before{
  display: block;
}

.form-wrapper input[type="radio"] + label h4{
  margin: 15px;
  color: #ccc;
}

.form-wrapper input[type="radio"]:checked + label{
  border: 1px solid #3498db;
}

.form-wrapper input[type="radio"]:checked + label h4{
  color: #3498db;
}</style>
<body>

<div class="w3-right w3-hide-small">
        <a href="login.jsp" class="w3-bar-item w3-button"> Admin Login</a>
    </div>
<h2 align="center" style="color:black; font-size:30px;   margin: 12px 120px;
    font-family: sans-serif;"><b>FlyAway Booking System</b></h2>
<div class="container">
    <div class="wrapper">
      <ul class="steps">
        <li class="is-active">Step 1</li>
        <li>Step 2</li>
        <li>Step 3</li>
      </ul>
      <form id="details" class="form-wrapper" method="post" action="conformationServlet">
        <fieldset class="section is-active">
          <h3>User Details</h3>
          <h4> ${Msg}</h4>
          <input type="text" name="Name" id="Name" placeholder="Name" required>
          <input type="text" name="Number" id="Number" placeholder="Phone Number" required>
          <div class="button">Next</div>
        </fieldset>
        <fieldset class="section">
          <h3>Review Your Booking Details</h3>
          <div class="row cf">
            <div class="four col">
              <input type="text" name="Source" value="${Source}" >
                <h4>Source</h4>
              </label>
            </div>
            <div class="four col">
              <input type="text" name="Destination" value="${Destination}"><label for="r2">
                <h4>Destination</h4>
              </label>
            </div>
            <div class="four col">
              <input type="text" name="Airline" value="${Airline}"><label for="r3">
                <h4>Airline</h4>
              </label>
            </div>
            <div class="four col">
              <input type="text" name="Date" value="${date}"><label for="r3">
                <h4>Date</h4>
              </label>
            </div>
            <div class="four col">
              <input type="text" name="no_of_persons" value="${no_of_persons}"><label for="r3">
                <h4>No_of_persons</h4>
              </label>
            </div>
            <div class="four col" style="    position: relative;
    left: 436px;
    bottom: 109px;">
              <input type="text" name="Total" value="${Total}"><label for="r3">
                <h4>Total Price</h4>
              </label>
            </div>
          </div>
          <div class="button">Next</div>
        </fieldset>
        <fieldset class="section">
          <h3>Payment</h3>
           <img alt="" src="img/flight.png"><br>
      <strong style="color:white;">Ticket Price :  Rs${price}/- <br>No of Persons : ${no_of_persons} <br>Total Price : Rs:${price}/- x ${no_of_persons}= Rs:${Total }/-   </strong> <br>
           <input class="button" type="button" data-page="3" name="next"  onclick="myFunction()" value="Pay Now" />
           <input type="hidden" name="Flight_id" value="${Flight_id}">
        </fieldset>
      </form>
    </div>
  </div>
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
  <script>
  function myFunction(){

	  document.getElementById("details").submit();
  }
  $(document).ready(function(){
	  $(".form-wrapper .button").click(function(){
	    var button = $(this);
	    var currentSection = button.parents(".section");
	    var currentSectionIndex = currentSection.index();
	    var headerSection = $('.steps li').eq(currentSectionIndex);
	    currentSection.removeClass("is-active").next().addClass("is-active");
	    headerSection.removeClass("is-active").next().addClass("is-active");

	    $(".form-wrapper").submit(function(e) {
	      e.preventDefault();
	    });

	    if(currentSectionIndex === 3){
	      $(document).find(".form-wrapper .section").first().addClass("is-active");
	      $(document).find(".steps li").first().addClass("is-active");
	    }
	  });
	});</script>
</body>
</html>