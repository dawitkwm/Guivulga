<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>
<script src="<spring:url value="/resource/js/controllers.js"/>"></script>
<title>User Details</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>User Details</h1>
			</div>
						<nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/BankApp/">Home</a></li>
                        <li class="breadcrumb-item" aria-current="page"><a href="/BankApp/users">Users</a></li>
                        <li class="breadcrumb-item active" aria-current="page">User details</li>
                    </ol>
                </nav>
		</div>
	</section>
	<section class="container">

		<div class="row">

			<div class="col-md-5">
				<p>First Name: ${user.firstName}</p>
				<p>Last Name: ${user.lastName}</p>
				<p>Email: ${user.email}</p>
				<p ng-controller="cartCtrl">

					<a href="<spring:url value="/users" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Back
					</a>

				</p>

			</div>
		</div>
		<!--/div-->
	</section>
</body>
</html>
