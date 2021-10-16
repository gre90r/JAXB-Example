<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
	<title>jaxb-demo</title>
</head>
<body>
	<h1>JAXB example</h1>
	<p>Enter a book, it will be created as XML</p>
	
	<form action="displayXml" method="GET" target="_blank">
		<div>
			<span>title:</span>
			<input type="text" name="title"/>
		</div>
		<div>
			<span>author:</span>
			<input type="text" name="author"/>
		</div>
		<br/>
		<div>
			<input type="submit" value="display xml">
		</div>
	</form>
</body>
</html>

