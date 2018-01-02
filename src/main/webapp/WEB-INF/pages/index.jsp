<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<style>
.login_field {
	width: 200px;
}
</style>
<head>
<title>DIX</title>
</head>
<body>
	<jsp:include page="/WEB-INF/components/navBarUser.jsp" />
	<br></br>
	<center>
		<h1>Your personal panel:</h1>
		<s:property value="login" />
	</center>
	
</body>
</html>