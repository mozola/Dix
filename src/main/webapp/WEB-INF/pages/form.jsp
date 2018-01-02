<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta charset="UTF-8">
<style>
	.login_field {
		width: 200px;
	}
</style>
<head>
<title>Login</title>
</head>
<body>
	<jsp:include page="/WEB-INF/components/navBarUser.jsp" />
	<br></br>
	<center>
		<h1>Loggin to your account:</h1>
		<s:form action="loginRequest" method="post">
			 <label class="login_field" for="name">Login:</label>
			 <input class="login_field" type="text" name="login" />
			 <br>
			 <label class="login_field" for="name">Password:</label>
			 <input class="login_field" type="password" name="password" />
			 <br>
			 <input type="submit" value="Zaloguj" />
			 <br>
		</s:form>
		<form action="newUser">
			 <input type="submit" value="Zarejstruj" />
		</form>
	</center>
</body>
</html>