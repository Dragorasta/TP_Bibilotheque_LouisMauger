<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="header">
  <a href="index.jsp" class="logo">TP Bibliothéque JAVA</a>
  <div class="header-right">
    <a class="active" href="index.jsp">Accueil</a>
    <a href="ShowAllOuvrages">Liste des livres</a>
    <a href="addOuvrage.jsp">Ajouter un livre</a>
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

.header {
  overflow: hidden;
  background-color: #51C2A4;
  padding: 20px 10px;
}

.header a {
-moz-appearance: none;
appearance: none;
outline: 0;
background-color: white;
border: 0;
padding: 10px 15px;
color: #53e3a6;
border-radius: 3px;
width: 250px;
cursor: pointer;
font-size: 18px;
transition-duration: 0.25s;
}

.header a.logo {
  font-size: 25px;
  font-weight: bold;
}

.header a:hover {
  background-color: #f5f7f9;
}

.header a.active {
  background-color: #50A7A2;
  color: white;
}

.header-right {
  float: right;
}

@media screen and (max-width: 500px) {
  .header a {
    float: none;
    display: block;
    text-align: left;
  }
  
  .header-right {
    float: none;
  }
}
</style>