<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h2 class="text-center" >Results!</h2>
	</div>
	<div class="jumbotron jumbotron-fluid">

		<div class="container">

			<form action="/newSearch.do" method="post">

				<p>You searched ${LocName}</p>
				<p>Loc iD :${LocId}</p>
				<p>Lcon1 :${Lcon1}</p>
				<p>Phone :${Phone1}</p>
				<p>Lcon2 :${Lcon2}</p>
				<p>Phone : :${Phone2}</p>
				<input type="submit" class="btm btn-primary" value="New Search">


			</form>
		</div>
	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>