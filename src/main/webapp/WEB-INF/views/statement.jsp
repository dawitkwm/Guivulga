<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">
<title>Statement</title>
</head>

<body style="padding: 25px">
	<div class="container">
		<div class="row justify-content-md-center">
			<div class="col">
				<nav aria-label="breadcrumb">
					<ol class="breadcrumb">
						<li class="breadcrumb-item"><a href="/BankApp/">Home</a></li>
						<li class="breadcrumb-item active" aria-current="page">Statement</li>
					</ol>
				</nav>
				<table class="table table-striped">
					<thead>
						<tr>
							<th scope="col">From Account</th>
							<th scope="col">To Account</th>
							<th scope="col">Amount</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${trans}" var="tran">
							<tr>
								<td>${tran.fromAccount}</td>
								<td>${tran.toAccount}</td>
								<td>${tran.amount}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>

</html>