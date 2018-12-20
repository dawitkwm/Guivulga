<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Transfer money</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Money transfer</h1>
				<p>Money transfer transaction</p>
			</div>
			<nav aria-label="breadcrumb">
				<ol class="breadcrumb">
					<li class="breadcrumb-item"><a href="/BankApp/">Home</a></li>
					<li class="breadcrumb-item active" aria-current="page">Transaction</li>
				</ol>
			</nav>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="tran" class="form-horizontal">
			<fieldset>
				<legend>Money transfer</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div" />

				<div class="form-group">
					<label class="control-label col-lg-2" for="fromAccount"><spring:message
							code="transaction.form.fromAccount.label" /></label>
					<div class="col-lg-10">
						<form:input id="fromAccount" path="fromAccount" type="text"
							class="form:input-large" />
						<form:errors path="fromAccount" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="toAccount"><spring:message
							code="transaction.form.toAccount.label" /></label>
					<div class="col-lg-10">
						<form:input id="toAccount" path="toAccount" type="text"
							class="form:input-large" />
						<form:errors path="toAccount" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="toBank"><spring:message
							code="transaction.form.toBank.label" /></label>
					<div class="col-lg-10">
						<form:select id="toBank" path="toBank" items="${banks}"
							itemValue="bic"
							itemLabel="name"
							class="form:input-large" />
						<form:errors path="toBank" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="toCountry"><spring:message
							code="transaction.form.toCountry.label" /></label>
					<div class="col-lg-10">
						<form:select id="toCountry" path="toCountry" items="${countries}"
							class="form:input-large" />
						<form:errors path="toCountry" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="amount"><spring:message
							code="transaction.form.amount.label" /></label>
					<div class="col-lg-10">
						<form:input id="amount" path="amount" type="text"
							class="form:input-large" />
						<form:errors path="amount" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="description"><spring:message
							code="transaction.form.description.label" /></label>
					<div class="col-lg-10">
						<form:input id="description" path="description" type="text"
							class="form:input-large" />
						<form:errors path="description" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<div class="col-lg-offset-2 col-lg-10">
						<input type="submit" id="btnTransfer" class="btn btn-primary"
							value="Transfer" />
					</div>
				</div>

			</fieldset>
		</form:form>
	</section>
</body>
</html>
