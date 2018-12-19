<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
        crossorigin="anonymous">
    <title>Transaction</title>
</head>

<body style="padding: 25px">
    <div class="container">
        <div class="row justify-content-md-center">
            <div class="col">
                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li class="breadcrumb-item"><a href="/BankApp/">Home</a></li>
                        <li class="breadcrumb-item active" aria-current="page">Transaction</li>
                    </ol>
                </nav>
                <form:form modelAttribute="tran" method = "POST">
                    <div class="form-group">
                        <label for="fromAccount">From Account</label>
                        <form:input path="fromAccount" type="text" class="form-control" id="fromAccount"/>
                    </div>
                    <div class="form-group">
                        <label for="toAccount">To Account</label>
                        <form:input path="toAccount" type="text" class="form-control" id="toAccount"/>
                    </div>
                    <div class="form-group">
                        <label for="toBank">To Bank</label>
                        <form:input path="toBank" type="text" class="form-control" id="toBank"/>
                    </div>
                    <div class="form-group">
                        <label for="toCountry">To Country</label>
                        <form:input path="toCountry" type="text" class="form-control" id="toCountry"/>
                    </div>
                    <div class="form-group">
                        <label for="amount">Amount</label>
                        <form:input path="amount" type="text" class="form-control" id="amount"/>
                    </div>
                    <div class="form-group">
                        <label for="description">Description</label>
                        <form:input path="description" type="text" class="form-control" id="description"/>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form:form>
            </div>
        </div>
    </div>
</body>

</html>