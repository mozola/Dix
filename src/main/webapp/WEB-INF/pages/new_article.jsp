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
<title>Create new article</title>
</head>
<body>
	<jsp:include page="/WEB-INF/components/navBarUser.jsp" />
	<br></br>
	<h1>Nowy artykul:</h1>

	<form action="articleAdded">

		<div class="field-groupe">
			<label class="login_field_label" for="name">Tytul:</label> <input
				class="login_field" type="text" name=title />
		</div>
		
		<div class="field-groupe">
			<label class="login_field_label" for="name">Tresc:</label> <input
				class="login_field" type="text" name=text />
		</div>
		
		<div class="field-groupe">
			<label class="login_field_label" for="name">Autor:</label> <input
				class="login_field" type="text" name=author />
		</div>

		<div class="field-groupe">
			<label class="login_field_label" for="name">Data utworzenia:</label> <input
				class="login_field" type="text" name=date_add />
		</div>

		<div class="field-groupe">
        	<label class="login_field_label" for="name">Dodaj zdjecie</label>
        	<div class="login_field">
        		<input type="file" name="userImage"/>
        		<s:submit name="submit" label="Submit"/>
        	</div>
        </div>    
				
		<input type="submit" value="Dodaj artykul" />

	</form>
</body>
</html>