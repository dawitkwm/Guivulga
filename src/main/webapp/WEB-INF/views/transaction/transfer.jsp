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
				<h1>Transfer money</h1>
				<p>Transaction type : ${transactionType}</p>
			</div>
		</div>
	</section>
	<section class="container">
		<form:form modelAttribute="tran" class="form-horizontal">
			<fieldset>
				<legend>${transactionType} transfer</legend>

				<form:errors path="*" cssClass="alert alert-danger" element="div" />
				
				<div class="form-group">
					<label class="control-label col-lg-2" for="fromIBAN"><spring:message
							code="transfer.form.fromIBAN.label" /></label>
					<div class="col-lg-10">
						<form:input id="fromIBAN" path="fromIBAN" type="text"
							class="form:input-large" />
						<form:errors path="fromIBAN" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="accountName"><spring:message
							code="transfer.form.accountName.label" /></label>
					<div class="col-lg-10">
						<form:input id="accountName" path="accountName" type="text"
							class="form:input-large" />
						<form:errors path="accountName" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="desc"><spring:message
							code="transfer.form.desc.label" /></label>
					<div class="col-lg-10">
						<form:input id="desc" path="desc" type="text"
							class="form:input-large" />
						<form:errors path="desc" cssClass="text-danger" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-lg-2" for="toIBAN"><spring:message
							code="transfer.form.toIBAN.label" /></label>
					<div class="col-lg-10">
						<form:input id="toIBAN" path="toIBAN" type="text"
							class="form:input-large" />
						<form:errors path="toIBAN" cssClass="text-danger" />
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
