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
<title>Customer Details</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Customer Details</h1>
			</div>
		</div>
	</section>
	<section class="container">

		<div class="row">

			<div class="col-md-5">
				<h3><spring:message code="addCustomer.form.firstName.label" />: ${customer.firstName}</h3>
				<h3><spring:message code="addCustomer.form.lastName.label" />: ${customer.lastName}</h3>
				<h4><spring:message code="addCustomer.form.gender.label" />: ${customer.gender}</h4>
				<h4><spring:message code="addCustomer.form.birthDate.label" />: ${customer.birthDate}</h4>
				
				<h4><spring:message code="addCustomer.form.address.street.label" />: ${customer.address.street}</h4>
				<h4><spring:message code="addCustomer.form.address.zipcode.label" />: ${customer.address.zipcode}</h4>
				<h4><spring:message code="addCustomer.form.address.city.label" />: ${customer.address.city}</h4>
				<%-- <h4><spring:message code="addCustomer.form.address.country.label" />: ${customer.address.country}</h4> --%>
				
				<h4><spring:message code="addCustomer.form.account.accountNo.label" />: ${customer.account.accountNo}</h4>
				<h4><spring:message code="addCustomer.form.account.balance.label" />: ${customer.account.balance}</h4>
				
				<p ng-controller="cartCtrl">

					<a href="<spring:url value="/customers" />" class="btn btn-default">
						<span class="glyphicon-hand-left glyphicon"></span> Back
					</a>

				</p>

			</div>
		</div>
		<!--/div-->
	</section>
</body>
</html>
