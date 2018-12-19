<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1><spring:message code="greeting" /></h1>
				<p><spring:message code="tagline" /></p>
				Welcome ${user.firstName} !

			</div>

			<div class="container">
				<c:choose>
					<c:when test="${empty user}">
						<a href="<spring:url value='/login' />"
							class="btn btn-default pull-right"> Login</a>
					</c:when>
					<c:otherwise>
							<a href="<spring:url value="/customers" />"
								class="btn btn-default pull-right">Customer management</a>
							<a href="<spring:url value="/customers/add" />"
								class="btn btn-default pull-right">Add Customer</a>
						<br>
							<a href="<spring:url value="/transaction" />"
								class="btn btn-default pull-right">Money transfer</a>
						<br>
							<a href="<spring:url value="/users" />"
								class="btn btn-default pull-right">
								User management</a>
						<br>
							<a href="<spring:url value='/logout' />"
								class="btn btn-default pull-right"> Logout</a>
					</c:otherwise>
				</c:choose>
			</div>
			<div class="pull-left">
				<h3>${SpecialBlurb}</h3>
			</div>
		</div>
	</section>

</body>
</html>
