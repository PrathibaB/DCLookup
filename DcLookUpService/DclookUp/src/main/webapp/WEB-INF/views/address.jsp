<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Address</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="jumbotron">
		<h3 class="bg-info">
			<strong>Address of the DC</strong>
		</h3>
		<br>
		<form action="/newSearch.do" method="post">
			<p>LocID :${Locid}</p>
			<p>Street:${Street }</p>
			<p>City :${City}</p>
			<p>State :${State}</p>
			<p>Zipcode :${Zipcode}</p>
			<input type="submit" class="btm btn-primary" value="New Search">
		</form>
		<br>
		<div class="alert-danger">
			<strong>${errorMessage}</strong>
		</div>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>