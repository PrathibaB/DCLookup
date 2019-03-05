<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DcLookUp!</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<div class="container">
	<div class="container bg-danger">

		<div class="row">
			<div class="col-sm-2">
				<img
					src="https://dam.farmjournal.com/m/128a36e02b5c17f7/webimage-7F596F56-F89B-4220-9F001B40CAE3EB19.png"
					alt="UNFI-Supervalu-logos" height="110px" width="200px"
					class="img-thumbnail">
			</div>
			<div class="col-sm-8 container">
			   
				<h1>DC lookup</h1>
				
			</div>
		</div>

	</div>
<br>
	<div class="container bg-info">
		<nav class="navbar navbar-default">

			<strong>Search Here</strong>

			<ul class="nav nav-pills" >
				<li class="nav-item"><a class="nav-link active"
					data-toggle="pill" href="#Lcon">LCON INFO</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="pill"
					href="#Address">Address</a></li>
				<li class="nav-item"><a class="nav-link" data-toggle="pill"
					href="#Circuit">Circuit Info</a></li>

			</ul>
			<div class="tab-content">
				<div id="Lcon" class="jumbotron tab-pane active">
					<form action="/search.do" method="post" class="form-inline">
						Location ID : <input type="text" class="form-control" name="id">
						Location Name :<input type="text" class="form-control" name="name">
						<input type="submit" class="btn btn-primary" value="search"
							name="search">
                       </form>
                       <br>
						<div class="alert-danger"><strong>${errorMessage}</strong></div>

					
				</div>
				<div id="Address" class="jumbotron tab-pane fade">
					<form action="/ret-address.do" method="post" class="form-inline">
						Location ID : <input type="text" class="form-control" name="id">
						<input type="submit" value="get address" class="btn btn-primary"
							name="address">
					</form>
					<br>
						<div class="alert-danger"><strong>${errorMessage}</strong></div>
				</div>
				<div id="Circuit" class="jumbotron tab-pane fade">
				   <p class="bg-info text-info"> Work under progress !</p>
				</div>
			</div>

		</nav>



	</div>
	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</div>
</body>
</html>