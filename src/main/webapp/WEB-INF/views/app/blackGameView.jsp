<%--
  Created by IntelliJ IDEA.
  User: piotrek
  Date: 05/11/2022
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>partie grane czarnymi</title>

    <!-- Bootstrap core CSS-->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="/resources/css/sb-admin.css" rel="stylesheet">
    <header class="page-header bg-info">
        <nav class="navbar justify-content-around">
            <a href="/" class="navbar bg-warning">
                ChessTrainer App
            </a>
        </nav>
    </header>
</head>


<body class="bg-dark">
<div class="container">
    <div class="card card-login mx-auto mt-5">
        <div class="card-header">Statystyka dla partii granych kolorem czarnym</div>
        <div class="card-body">


            <h3>Pokaż mi jakie mam wyniki w danym wariancie</h3>
            <form method="post">
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <div class="form-group">
                    <div class="form-label-group">
                <input type="text" name="username" id=username>
                <label for="username">Username</label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="form-label-group">
                <input type="text" name=ECO id="ECO">
                <label for="ECO">ECO(Od A00 do E99)</label>
                    </div>
                </div>
                <input type="submit" class="btn btn-primary btn-block" value="Wyślij"/>
            </form>
        </div>
    </div>
</div>

<!-- Bootstrap core JavaScript-->
<script src="/resources/vendor/jquery/jquery.min.js"></script>
<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>
</body>

</html>