<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<META HTTP-EQUIV="content-type" CONTENT="text/html; charset=iso-8859-2">

<style>

	.field-groupe 
	{
		width: 600px;
		padding: 10px; 
		left: 10%;
		margin: 20px;
	}

	.login_field 
	{
		width: 400px;
		color: black;
		position: absolute; left: 240px;
		background: white;
	}
	
	.login_field_label
	{
		width: 300px;
		position: absolute; left: 20px;
		color: black;
	}

	.text_field 
	{
		height: 200px;
		width: 300px;
		color: black;
		background: white;
	}
	
</style>

</head>
<body>
	<jsp:include page="/WEB-INF/components/navBarUser.jsp" />
	<br></br>
		<h2>Nowy przepis został dodany</h2>>
			<tr>
				<td>Nazwa:</td><td><s:property value="nameRecipe"/></td>
			</tr>
			<tr>
				<td>Krotki opis:</td><td><s:property value="shourtDescribe"/></td>
			</tr>
			<tr>
				<td>Skladniki:</td><td><s:property value="componentsRecipe"/></td>
			</tr>
			<tr>
				<td>Sposob przygotowania:</td><td><s:property value="methodOfPreparing"/></td>
			</tr>
		</table>
	</center>

</body>
</html>