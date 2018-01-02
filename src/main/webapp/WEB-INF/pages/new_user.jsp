<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
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
<title>Register new user</title>
</head>
<body>
	<jsp:include page="/WEB-INF/components/navBarUser.jsp" />
	<br></br>
	<h1>Formularz urzytkownika</h1>

	<form action="loginRequest">

		<div class="field-groupe">
			<label class="login_field_label" for="name">Nazwa urzytkownika:</label> <input
				class="login_field" type="text" name=login />
		</div>
		
		<div class="field-groupe">
			<label class="login_field_label" for="name">Hasło:</label> <input
				class="login_field" type="password" name=password />
		</div>
		
		<div class="field-groupe">
			<label class="login_field_label" for="name">Powtoz haslo</label> <input
				class="login_field" type="password" name=password />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Imie:</label> <input
				class="login_field" type="text" name=name />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Nazwisko:</label> <input
				class="login_field" type="text" name="surname" />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Mail:</label>
			<input class="login_field" type="text" name="mail" />
		</div>
		
		<div class="field-groupe">
			<label class="login_field_label" for="name">Płec:</label> 
			<input class="login_field" type="text" name="gender" />
		</div>

		<input type="submit" value="Zarejestruj" />

	</form>
</body>
</html>