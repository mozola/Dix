<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-2" />
<style>
.field-groupe {
	width: 600px;
	padding: 10px;
	left: 10%;
	margin: 20px;
}

.login_field {
	width: 400px;
	color: black;
	position: absolute;
	left: 240px;
	background: white;
}

.login_field_label {
	width: 300px;
	position: absolute;
	left: 20px;
	color: black;
}

.text_field {
	height: 200px;
	width: 300px;
	color: black;
	background: white;
}
</style>
<head>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="/WEB-INF/components/navBarUser.jsp" />
	<br></br>
	<h1>Dodaj nowy przepis:</h1>

	<form action="newRecipeDone">

		<div class="field-groupe">
			<label class="login_field_label" for="name">Nazwa:</label> <input
				class="login_field" type="text" name=nameRecipe />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Krótki opis:</label> <input
				class="login_field" type="text" name="shourtDescribe" />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Składniki:</label> <input
				class="login_field" type="text" name="componentsRecipe" />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Sposób
				przygotowania:</label> <input class="login_field" type="text"
				name="methodOfPreparing" />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Kalorie:</label> <input
				class="login_field" type="text" name="calories" />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Dodaj zdjecie</label>
			<div class="login_field">
				<input type="file" name="userImage" />
				<s:submit name="submit" label="Submit" />
			</div>
		</div>

		<input type="submit" value="Done" />

	</form>
</body>
</html>