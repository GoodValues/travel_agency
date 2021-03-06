<html lang="pl" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8"/>
    <title>WycieczkiTypowe</title>
    <meta name="description" content="Najlepsza agencja podróżnicza"/>
    <meta name="keywords" content="spędź z nami super wakacje"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <link rel="stylesheet" href="../static/css/style.css" th:href="@{css/style.css}" type="text/css"/>
    <link rel="stylesheet" href="../static/css/fontello.css" th:href="@{css/fontello.css}" type="text/css"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Josefin+Sans:wght@100&family=Lato:wght@100&display=swap" rel="stylesheet">



</head>

<body>
<div id="container">


    <div id="bestTrips">


        <div class="tripsBar" th:text="|Wycieczki typu:    ${tripType}|" >Wycieczki wyszukane po typie: ${tripType}
        </div>

        <div class="bestTrip" th:each="tripByType : ${tripsByTypes}">

            <div class="btImage">
                <img src="../static/img/bt1.jpg" th:src="@{${tripByType.imgUrl}}">
            </div>

            <div class="btDescription">

                <table class="table table2">

                    <tr class="tr tr2">
                        <th class="th th2" th:text="${tripByType.destination.country}" >Hiszpania, All Inclusive</th>
                    </tr>

                    <tr class="tr tr2"><td class="td td2">
                        <ul>
                            <li th:text="|Typ wycieczki: ${tripType}|">Wycieczka wakacyjna</li>
                            <li th:text="${tripByType.description}">Super odpoczynek nad morzem</li>
                            <li th:text="|Standard wyżywienia: ${tripByType.tripAlimentationEnum}|">Standard All Inclusive</li>
                            <li th:text="|Początek wycieczki: ${tripByType.dateFrom}|">Poczatek wycieczki</li>
                            <li th:text="|Koniec wycieczki: ${tripByType.dateTo}|">Koniec wycieczki</li>
                        </ul>
                    </td></tr>

                    <tr class="tr tr2">
                        <th class="th th2" th:text="|Status: ${tripByType.status}|">Status: promocyjna</th>
                    </tr>

                </table>
            </div>

            <div class="btPrice">
                <p></p>
                .
                <p th:text="|Cena: ${tripByType.priceForAdult}|"></p>

                <p></p>
                <a href="#" th:href="@{|/trip/${tripByType.id}|}">
                    <button class="button button2">Do oferty</button></a>
            </div>

        </div>




    </div>
    <div>
        <a href="#" th:href="@{/}">
            <button class="button button1">Powrót do strony głównej</button>
        </a>
    </div>

</div>



</body>

</html>