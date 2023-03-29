<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>FlyAway | </title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
   	<style>
   	html {
    height: 100%;
  }
  body {
    margin: 0;
    padding: 0;
    font-family: sans-serif;
    background:linear-gradient(#b9d2ff, #111c29);
  }
  
  .login-box {
   position: absolute;
    top: 56%;
    left: 53%;
    width: 800px;
    padding: 40px;
    transform: translate(-50%, -50%);
    background: rgba(0, 0, 0, 0.5);
    box-sizing: border-box;
    box-shadow: 0px 2px 25px 6px rgb(255 255 255 / 60%);
    height: 80%;
    overflow: scroll;
    color: #409f91;
    overflow-x: hidden;
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
  
  .login-box .user-box input {
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
    color: #fff;
    pointer-events: none;
    transition: 0.5s;
  }
  
  .login-box .user-box input:focus ~ label,
  .login-box .user-box input:valid ~ label {
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
  body {font-family: Helvetica, sans-serif;}
.container{max-width: 680px; margin:0 auto;}
.logotype{background:#000;color:#fff;width:75px;height:75px;  line-height: 75px; text-align: center; font-size:11px;}
.column-title{background:#eee;text-transform:uppercase;padding:15px 5px 15px 15px;font-size:11px}
.column-detail{border-top:1px solid #eee;border-bottom:1px solid #eee;}
.column-header{background:#eee;text-transform:uppercase;padding:15px;font-size:11px;border-right:1px solid #eee;}
.row{padding:7px 14px;border-left:1px solid #eee;border-right:1px solid #eee;}
.alert{background: #ffd9e8;padding:20px;margin:20px 0;line-height:22px;color:#333}
.socialmedia{background:#eee;padding:20px; display:inline-block}
  
   	</style>
</head>
<body>
    <div class="w3-right w3-hide-small">
        <a href="Home.jsp" class="w3-bar-item w3-button"> Home Page</a>
    </div>
    <div class="login-box">
    <div class="container">

  <table width="100%">
    <tr>
      <td width="75px"><div class="logotype">FlyAway</div></td>
      <td width="300px" style="background: #fee977;border-left:15px solid #fff; padding-left:30px;font-size:26px;font-weight:bold;letter-spacing:-1px;">Ticket confirmation</td>
      <td></td>
    </tr>
  </table> 
  <h3>Your contact details</h3>
  <table width="100%" style="border-collapse: collapse;">
    <tr>
      <td width="180px" class="column-title">Name<td>
      <td class="column-detail"> ${Name}<td>
    </tr>
    <tr>
      <td class="column-title">Phone Nuumber<td>
      <td class="column-detail">${Number}<td>
    </tr>
    <tr>
      <td class="column-title">No of Persons<td>
      <td class="column-detail">${no_of_persons}<td>
    </td>
    <tr>
      <td class="column-title">Total Price<td>
      <td class="column-detail"> ${Total}<td>
    </tr>
  </table>
  <h3>Journey details</h3>

   <table width="100%" style="border-collapse: collapse;border-bottom:1px solid #eee;">
     <tr>
       <td width="20%" class="column-header">Flight ID</td>
       <td width="10%" class="column-header">Journey Date</td>
       <td width="40%" class="column-header">Airline Name</td>
       <td width="40%" class="column-header">Source</td>
       <td width="30%" class="column-header">Destination</td>
       
     </tr>
     <tr>
       <td class="row">${Flight_id}</td>
       <td class="row">${date}</td>
       <td class="row">${Airline}</td>
       <td class="row">${Source}</td>
       <td class="row">${Destination}</td>
     </tr>
    
  </table>
  <div class="alert"></div>
  <div class="socialmedia"></small></div>
</div><!-- container -->
      </div>
</body>
</html>
