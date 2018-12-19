<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Customers</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Customers</h1>
				<p>All The Active Customers</p>
			</div>
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/BankApp/">Home</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Customers</li>
                    </ol>
                </nav>
		</div>
	</section>
	<section class="container">
		<div class="row">
			<c:forEach items="${customers}" var="customer">
				<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
					<div class="thumbnail">
						<div class="caption">
				<h4><spring:message code="addCustomer.form.firstName.label" />: ${customer.firstName}</h4>
				<h5><spring:message code="addCustomer.form.lastName.label" />: ${customer.lastName}</h5>
				<h5><spring:message code="addCustomer.form.gender.label" />: ${customer.gender}</h5>
				<h5><spring:message code="addCustomer.form.birthDate.label" />: ${customer.birthDate}</h5>
				
				<h5><spring:message code="addCustomer.form.address.street.label" />: ${customer.address.street}</h5>
				<h5><spring:message code="addCustomer.form.address.zipcode.label" />: ${customer.address.zipcode}</h5>
				<h5><spring:message code="addCustomer.form.address.city.label" />: ${customer.address.city}</h5>
				<%-- <h5><spring:message code="addCustomer.form.address.country.label" />: ${customer.address.country}</h5> --%>
				
				<%-- <h5><spring:message code="addCustomer.form.account.accountNo.label" />: ${customer.account.accountNo}</h5>
				<h5><spring:message code="addCustomer.form.account.balance.label" />: ${customer.account.balance}</h5>
 --%>
 							<p>
								<a
									href=" <spring:url value="/customers/customer?id=${customer.id}" /> "
									class="btn btn-primary"> <span
									class="glyphicon-info-sign glyphicon" /></span> Details
								</a>
							</p>

						</div>
					</div>
				</div>
			</c:forEach>
		</div>
	</section>
</body>
</html>
