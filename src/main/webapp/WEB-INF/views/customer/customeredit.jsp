<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
				<p>Edit the customers</p>
			</div>
			<nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/BankApp/">Home</a></li>
                        <li class="breadcrumb-item" aria-current="page"><a href="/BankApp/customers">Customers</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Edit customer</li>
                    </ol>
                </nav>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="customer" class="form-horizontal">
			<fieldset>
				<legend>Edit the customer</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div" />

				<div class="form-group">
					<label class="control-label col-lg-2" for="firstName"><spring:message
							code="addCustomer.form.firstName.label" /></label>
					<div class="col-lg-10">
						<form:input id="firstName" path="firstName" type="text"
							class="form:input-large" />
						<form:errors path="firstName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="lastName"><spring:message
							code="addCustomer.form.lastName.label" /></label>
					<div class="col-lg-10">
						<form:input id="lastName" path="lastName" type="text"
							class="form:input-large" />
						<form:errors path="lastName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="gender"><spring:message
							code="addCustomer.form.gender.label" /></label>
					<div class="col-lg-10">
						<form:radiobutton id="gender" path="gender" value="M"/><spring:message
							code="addCustomer.form.gender.Male" /> 
						<form:radiobutton id="gender" path="gender" value="F"/><spring:message
							code="addCustomer.form.gender.Female" />
						<form:errors path="gender" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="birthDate"><spring:message
							code="addCustomer.form.birthDate.label" /></label>
					<div class="col-lg-10">
						<form:input id="birthDate" path="birthDate" type="date"
							class="form:input-large" />
						<form:errors path="birthDate" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="address.street"><spring:message
							code="addCustomer.form.address.street.label" /></label>
					<div class="col-lg-10">
						<form:input id="address.street" path="address.street" type="text"
							class="form:input-large" />
						<form:errors path="address.street" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="address.zipCode"><spring:message
							code="addCustomer.form.address.zipCode.label" /></label>
					<div class="col-lg-10">
						<form:input id="address.zipCode" path="address.zipCode" type="text"
							class="form:input-large" />
						<form:errors path="address.zipCode" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="address.city"><spring:message
							code="addCustomer.form.address.city.label" /></label>
					<div class="col-lg-10">
						<form:input id="address.city" path="address.city" type="text"
							class="form:input-large" />
						<form:errors path="address.city" cssClass="text-danger" />
					</div>
				</div>

<%-- 				<div class="form-group">
					<label class="control-label col-lg-2" for="address.country"><spring:message
							code="addCustomer.form.address.country.label" /></label>
					<div class="col-lg-10">
						<form:input id="address.country" path="address.country" type="text"
							class="form:input-large" />
						<form:errors path="address.country" cssClass="text-danger" />
					</div>
				</div> --%>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnSave" class="btn btn-primary"
							value="Save" />
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
