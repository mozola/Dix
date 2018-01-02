<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="UTF-8">
<style> <%@include file="/WEB-INF/styles/navibar.css"%></style>

</head>
<body>
	<ul>
		<li><a href="home">Strona domowa</a></li>
		<li><a href="about">About</a></li>
		<li class="dropdown"><a href="javascript:void(0)" class="dropbtn">Dodaj</a>
			<div class="dropdown-content">
				<a href="newRecipe">Dodaj nowy przepis</a> <a href="newExercise">Dodaj
					nowe ćwiczenie</a> <a href="newArticle">Dodaj nowy artykul</a>
			</div></li>
		<li class="dropdown"><a href="javascript:void(0)" class="dropbtn">Plany
				treningowe</a>
			<div class="dropdown-content">
				<a href="#">Trening 300</a> <a href="#">Trening Areobowy</a>
			</div></li>
		<li><a href="loginForm">Moje konto</a></li>
	</ul>
</body>
</html>