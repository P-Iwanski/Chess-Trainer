<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: piotrek
  Date: 09/11/2022
  Time: 13:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<title>Moje zapytania</title>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <header class="page-header bg-info">
        <nav class="navbar justify-content-around">
            <a href="/" class="navbar bg-warning">
                ChessTrainer App
            </a>
        </nav>
    </header>
    <section>
        <div class="row">
            <div class="card text-bg-primary mb-3" style="width: 18rem;">
                <div class="card-body bg-info">
                    <h5 class="card-title">Logowanie</h5>
                    <p class="card-text">Zaloguj się i korzystaj z aplikacji</p>
                    <a href="/login" class="btn btn-warning">Zaloguj</a>
                </div>
            </div>
            <div class="card text-bg-primary mb-3" style="width: 18rem;">
                <div class="card-body bg-info">
                    <h5 class="card-title">Rejestracja</h5>
                    <p class="card-text">Zarejestruj się i korzystaj ze wszystkich możliwości aplikacji</p>
                    <a href="/register" class="btn btn-warning">Zarejestruj</a>
                </div>
            </div>
            <div class="card text-bg-primary mb-3" style="width: 18rem;">
                <div class="card-body bg-info">
                    <h5 class="card-title">Wyniki białymi</h5>
                    <p class="card-text">Sprawdź swoje wyniki w partiach rozgrywanych białymi. Możesz również podejrzeć przeciwników.</p>
                    <a href="/app/whiteGameView" class="btn btn-warning">Sprawdź</a>
                </div>
            </div>
            <div class="card text-bg-primary mb-3" style="width: 18rem;">
                <div class="card-body bg-info">
                    <h5 class="card-title">Wyniki czarnymi</h5>
                    <p class="card-text">Sprawdź swoje wyniki w partiach rozgrywanych czarnymi. Możesz również podejrzeć przeciwników.</p>
                    <a href="/app/blackGameView" class="btn btn-warning">Sprawdź</a>
                </div>
            </div>
            <div class="card text-bg-primary mb-3" style="width: 18rem;">
                <div class="card-body bg-info">
                    <h5 class="card-title">Twoje dotychczasowe wyszukiwania dotyczące twojego konta</h5>
                    <p class="card-text">Sprawdź rezultaty o które pytałeś</p>
                    <a href="/app/myStats" class="btn btn-warning">Sprawdź</a>
                </div>
            </div>
        </div>
    </section>
    <!-- Bootstrap core CSS-->
    <link href="/resources/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template-->
    <link href="/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">

    <!-- Custom styles for this template-->
    <link href="/resources/css/bootstrap-reboot.css" rel="stylesheet">
</head>
<body>
<h5>Twoje dotychczasowe zapytania dla białych</h5>
<table class="table">
    <thead>
    <th>ECO</th>
    <th>Data zapytania</th>
    <th>ilość negatywnych rezultatów</th>
    <th>ilość pozytywnych rezultatów</th>
    </thead>
    <tbody>
    <c:forEach items="${white_eco_stats}" var="whiteStats">
        <tr>
            <td><c:out value="${whiteStats.eco}"/></td>
            <td><c:out value="${whiteStats.createdAt}"/></td>
            <td><c:out value="${whiteStats.quantityOfFailedGames}"/></td>
            <td><c:out value="${whiteStats.quantityOfSuccessfulGames}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<h5>Twoje dotychczasowe zapytania dla czarnych</h5>
<table class="table">
    <thead>
    <th>ECO</th>
    <th>Data zapytania</th>
    <th>ilość negatywnych rezultatów</th>
    <th>ilość pozytywnych rezultatów</th>
    </thead>
    <tbody>
    <c:forEach items="${black_eco_stats}" var="blackStats">
        <tr>
            <td><c:out value="${blackStats.eco}"/></td>
            <td><c:out value="${blackStats.createdAt}"/></td>
            <td><c:out value="${blackStats.quantityOfFailedGames}"/></td>
            <td><c:out value="${blackStats.quantityOfSuccessfulGames}"/></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
        crossorigin="anonymous"></script>
</html>
