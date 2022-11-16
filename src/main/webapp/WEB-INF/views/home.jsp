<%--
  Created by IntelliJ IDEA.
  User: piotrek
  Date: 09/11/2022
  Time: 10:49
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
                    <p class="card-text">Zarejestruj się i korzystaj z wszystkich możliwości aplikacji</p>
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
<br>
<br>
<body>


<section class="section-more padding-small">
    <div class="container d-flex justify-content-between">
        <div class="mr-4">
            <h2 class="pb-3">Czym jest ECO?</h2>
            <h5 class="pt-1">
                Šahovski informator wprowadził nowatorski sposób nazywania otwarć szachowych za pomocą trzyznakowego
                kodu,
                który przyjął się na całym świecie i jest znany obecnie pod nazwą kodu ECO (od Encyclopedia of Chess
                Openings).
                Kod ECO zastępuje tradycyjne nazwy otwarć i umożliwia ich precyzyjniejszą systematykę.
                Jest stosowany praktycznie we wszystkich wydawnictwach szachowych i komputerowych bazach partii.
                Wszystkie otwarcia podzielono na pięć grup, oznaczonych literami od A do E. Każda grupa zawiera sto
                rodzajów otwarć, ponumerowanych od 00 do 99. Trzyznakowy kod ECO składa się z litery oznaczającej grupę
                oraz dwóch cyfr oznaczających numer otwarcia w tej grupie.

            </h5>
        </div>
        <div class="ml-4 align-self-center">
        </div>
    </div>
</section>
<p>

</p>
<section class="padding-small details bg-light">
    <div class="container">
        <div class="row">
            <div class="col text-align: left">
                <h1>Grupa A00-A99</h1>
                <p>
                    A00 otwarcia nieregularne <br>
                    A01 debiut Larsena<br>
                    A02 – A03 debiut Birda<br>
                    A04 – A09 otwarcie Retiego<br>
                    A10 – A39 partia angielska<br>
                    A40 – A50 rzadkie debiuty powstające po 1.d4<br>
                    A51 – A52 gambit budapeszteński<br>
                    A53 – A55 obrona staroindyjska<br>
                    A56 obrona Benoni<br>
                    A57 – A59 gambit wołżański<br>
                    A60 – A79 obrona Benoni<br>
                    A80 – A99 obrona holenderska<br>
                </p>
            </div>
            <div class="col text-align: left">
                <h1>Grupa B00-B99</h1>
                <p>
                    B00 rzadkie debiuty powstające po 1.e4<br>
                    B01 obrona skandynawska<br>
                    B02 – B05 obrona Alechina<br>
                    B06 obrona Robatscha<br>
                    B07 – B09 obrona Pirca<br>
                    B10 – B19 obrona Caro-Kann<br>
                    B20 – B99 obrona sycylijska<br>
                </p>
            </div>
            <div class="col text-align: left">
                <h1>Grupa E00-E99</h1>
                <p>
                    E01 – E09 partia katalońska<br>
                    E10 gambit Blumenfelda<br>
                    E11 obrona Bogolubowa<br>
                    E12 – E19 obrona hetmańsko-indyjska<br>
                    E20 – E59 obrona Nimzowitscha<br>
                    E60 – E99 obrona królewsko-indyjska<br>
                </p>
            </div>

        </div>
    </div>
</section>
<section class="padding-small details bg-light">
    <div class="container">
        <div class="row">
            <div class="col text-align: left">
                <h1>Grupa D00-D99</h1>
                <p>
                    D00 rzadkie debiuty powstające po 1.d4 d5<br>
                    D01 – D05 debiut pionem hetmańskim<br>
                    D06 gambit hetmański – rzadkie kontynuacje<br>
                    D07 obrona Czigorina<br>
                    D08 – D09 kontrgambit Albina<br>
                    D10 – D19 obrona słowiańska<br>
                    D20 – D29 gambit hetmański przyjęty<br>
                    D30 – D69 gambit hetmański nieprzyjęty<br>
                    D70 – D99 obrona Grünfelda<br>
                </p>
            </div>
            <div class="col text-align: left">
                <h1>Grupa C00-C99</h1>
                <p>
                    C00 – C19 obrona francuska<br>
                    C20 rzadkie debiuty powstające po 1.e4 e5<br>
                    C21 – C22 debiut centralny i gambit północny<br>
                    C23 – C24 debiut gońca<br>
                    C25 – C29 partia wiedeńska<br>
                    C30 – C39 gambit królewski<br>
                    C40 rzadkie debiuty powstające po 1.e4 e5 2.Sf3<br>
                    C41 obrona Philidora<br>
                    C42 – C43 obrona rosyjska<br>
                    C44 rzadkie debiuty powstające po 1.e4 e5 2.Sf3 Sc6<br>
                    C45 partia szkocka<br>
                    C46 obrona trzech skoczków<br>
                    C47 – C49 obrona czterech skoczków<br>
                    C50 rzadkie debiuty powstające po 1.e4 e5 2.Sf3 Sc6 3.Gc4<br>
                    C51 – C52 gambit Evansa<br>
                    C53 – C54 partia włoska<br>
                    C55 – C59 obrona dwóch skoczków<br>
                    C60 – C99 partia hiszpańska<br>
                </p>
            </div>
        </div>
    </div>

</section>

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
