<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>

		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>DIX</title>
		<style type="text/css"><%@include file="/WEB-INF/styles/articles.css"%></style>

	</head>

	<body>

		<div class="header">
			<center>
				<h1>DIX</h1>
				<h2>To twoj osobisty organizer	</h2>
			</center>
		</div>

	<jsp:include page="/WEB-INF/components/navBarUser.jsp" />

	<br>
	<br>

	<div class="all_articles">
		<s:iterator value="allArticles">
				
			<div class="single_article">
			
				<img src="http://www.liveactivesportmed.com/wordpress/wp-content/uploads/2013/08/sore-knee.jpg"
					 alt="Single picture to article" class="pic"/>
				<h2>
					<s:property value="title" />
				</h2>
				<s:property value="text" />
				<i><s:property value="author" /></i>
				<i><s:property value="date_add" /></i>
				<a href="#" class="btn btn-primary" role="button">Czytaj</a>
			</div>
		</s:iterator>
	</div>


	</body>
</html>