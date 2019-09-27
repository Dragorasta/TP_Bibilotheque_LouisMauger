<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="footer">
  <div class="header-left">
    <form class="form" method="post" action="Logout">
  		<button class="logout" type="submit" id="logout-button">Deconnexion</button>
	</form>
  </div>
</div>
</body>
</html>
<style>
* {box-sizing: border-box;}

body { 
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}

.footer {
  overflow: hidden;
  background-color: #51C2A4;
  padding: 20px 10px;
  position: absolute; 
  bottom: 0;
}

.footer a {
-moz-appearance: none;
appearance: none;
outline: 0;
background-color: #6BC5B2;
border: 0;
padding: 10px 15px;
color: white;
border-radius: 3px;
width: 250px;
cursor: pointer;
font-size: 18px;
transition-duration: 0.25s;
}

.footer a.logo {
  font-size: 25px;
  font-weight: bold;
}

.footer a:hover {
  background-color: #51B8A3;
}

.footer a.active {
  background-color: #50A7A2;
  color: white;
}

.footer a.logout {
  background-color: #8B0000;
  color: white;
}
.footer-left {
  float: left;
}

@media screen and (max-width: 500px) {
  .footer a {
    float: none;
    display: block;
    text-align: right;
  }
  
  .footer-left {
    float: none;
  }
}
</style>