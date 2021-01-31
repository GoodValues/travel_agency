<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl" xmlns:th="http://www.thymeleaf.org">

<html>
<head>
    <meta charset="utf-8"/>
    <title>Main Page</title>
    <meta name="description" content="Stworze dla Ciebie wyjatkowa strone www! Zartudnij programiste webowego itp itd......."/>
    <meta name="keywords" content="zamow, strone, tworzenie, www, progrmiasta, portfolio"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <link rel="stylesheet" href="style.css" type="text/css"/>
    <link rel="stylesheet" href="css/fontello.css" type="text/css"/>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Josefin+Sans:wght@100&family=Lato:wght@100&display=swap" rel="stylesheet">

</head>
<body>

<h1> Witaj: ${userName} </h1>
<h2>Data Twoich odwiedzin: ${dateTime}</h2>
<h2>Witryna została odwiedzona ${visitCount} razy! </h2>

<div id="container">
    <div id="topbar">
        <div id="login">

            <div class="loginType" title="Zaloguj się">
                <a href="http://google.com" class="sociallink">
                    <i class="demo-icon icon-login"></i></a></div>



            <div class="loginType" title="Zarejestruj się">
                <a href="http://google.com" class="sociallink">
                    <i class="demo-icon icon-registered"></i></a>
            </div>

            <div class="fb" title="Logowanie przez Facebook">
                <a href="http://google.com" class="sociallink">
                    <i class="icon-facebook"></i></a>
            </div>


            <div class="google" title="Logowanie przez Google">
                <a href="http://google.com" class="sociallink">
                    <i class="demo-icon icon-google">&#xf1a0;</i></a>
            </div>


            <div class="tw" title="Logowanie przez Twitter">
                <a href="http://google.com" class="sociallink">
                    <i class="icon-twitter"></i></a>
            </div>

            <div style="clear:both"></div>
        </div>

        <div id="logo">Travel Center</div>

        <div style="clear:both"></div>

    </div>

    <div id="strip"></div>

    <div id="menu">
        <div class="option">Strona główna</div>
        <div class="option">Dystrybucje</div>
        <div class="option">Instalacja</div>
        <div class="option">Polecenia</div>
        <div class="option">Linus Torvalds</div>
        <div class="option">O projekcie</div>
        <div style="clear:both;"></div>
    </div>

    <div id="search">

        <div id="searchWindow">

            <form action="#" th:action="@{|/tripSearch|}" method="post" >
                <div id="boxTop">Znajdź wakacje marzeń!</div>

                <div class="searchText">Początek</div>

                <div class="searchBox">

                    <input type="datetime-local" id="start" name="start">
                    <!--                           value="2020-02-11"-->
                    <!--                           min="2020-01-25" max="2020-12-31">-->
                </div>

                <div style="clear:both"></div>

                <div class="searchText">Koniec</div>

                <div class="searchBox">
                    <input type="datetime-local" id="end" name="end">
                    <!--                       value="2020-02-11"-->
                    <!--                       min="2020-01-25" max="2020-12-31">-->

                </div>

                <div style="clear:both"></div>

                <div class="searchText">Dokąd?</div>
                <div class="searchBox">
                    <select type="text" name="continent" id="continent">
                        <option value="Europa">Europa</option>
                        <option value="Azja">Azja</option>
                        <option value="Ameryka Północna">Ameryka Pł</option>
                        <option value="Ameryka Południowa">Ameryka Pd</option>
                        <option value="Afryka">Afryka</option>
                        <option value="Australia">Australia</option>
                    </select></div>

                <div style="clear:both"></div>


                <button class="button button1">Szukaj</button>

            </form>
        </div>


        <div id="searchImage">
            <img src="img/agency.jpg"></div>
        <div style="clear:both"></div>

    </div>



    <div class="trips">

        <div class="trips1">

            <div class="tripsBar">Znajdź wycieczkę na każdą porę roku!

            </div>

            <div class="singleTrip">
                <a href="/tripsByType?type=SUMMER" th:href="@{/tripsByType/(type=${(com.travel_agency.model.trip.TripTypeEnum).SUMMER.name()})}" class="singleTripLink">
                    <img src="img/summer.jpg">
                    <div class="tripSignature">Wakacyjna</div></a>
            </div>


            <div class="singleTrip">
                <a href="#" th:href="@{/tripsByType/(type=${(com.travel_agency.model.trip.TripTypeEnum).WINTER.name()})}" class="singleTripLink">
                    <img src="img/winter.jpg">
                    <div class="tripSignature">
                        Zimowa</div></a>
            </div>


            <div class="singleTrip">
                <a href="#" th:href="@{/tripsByType/(type=${(com.travel_agency.model.trip.TripTypeEnum).ROUND_TRIP.name()})}" class="singleTripLink">
                    <img src="img/round.jpg">
                    <div class="tripSignature">
                        Objazdowa</div></a>
            </div>


            <div class="lastTrip">
                <a href="#" th:href="@{/tripsByType/(type=${(com.travel_agency.model.trip.TripTypeEnum).LAST_MINUTE.name()})}" class="singleTripLink">
                    <img src="img/lastMinute.jpg">
                    <div class="tripSignature">
                        Last minute</div></a>
            </div>

            <div style="clear:both"></div>


        </div>

    </div>

    <div class="tripsFood">

        <div class="tripsBar">Szukaj według standardu wyżywienia!
        </div>


        <!--        <div class="singleFoodTrip" style="sociallink" >-->
        <!--&lt;!&ndash;            th:each="alimentationType : ${alimentationTypes}" Pamiętać zeby przerobic na petle!!!&ndash;&gt;-->
        <!--            <a href="#" th:href="@{/tripsByAlimentation/(alimentation=${(com.travel_agency.model.trip.TripAlimentationEnum).AI.name()})}"  class="singleFoodTripLink">-->
        <!--                AI-->
        <!--                <div class="tripSignature">-->
        <!--                    All Inclusive</div></a>-->
        <!--        </div>-->
        <div class="singleFoodTrip" style="sociallink"  th:each="alimentationType : ${alimentationTypes}" >
            <!--            Pamiętać zeby przerobic na petle!!!-->
            <a href="#" th:href="@{|/tripsByAlimentation/${alimentationType.name()}|}"  class="singleFoodTripLink" th:text="${alimentationType.name()}">
                AI
                <div class="tripSignature" th:text="${alimentationType.description}">
                    All Inclusive</div></a>
        </div>


        <!--        <div class="singleFoodTrip">-->
        <!--            <a href="#" th:href="@{/tripsByAlimentation/(alimentation=${(com.travel_agency.model.trip.TripAlimentationEnum).BB.name()})}"  class="singleFoodTripLink">-->
        <!--                BB-->
        <!--                <div class="tripSignature">Bed_Breakfast</div></a>-->
        <!--        </div>-->


        <!--        <div class="singleFoodTrip">-->
        <!--            <a href="#" th:href="@{/tripsByAlimentation/(alimentation=${(com.travel_agency.model.trip.TripAlimentationEnum).HB.name()})}"  class="singleFoodTripLink">-->
        <!--                HB-->
        <!--                <div class="tripSignature">-->
        <!--                    Half Board</div></a>-->
        <!--        </div>-->

        <!--        <div class="singleFoodTrip">-->
        <!--            <a href="#" th:href="@{/tripsByAlimentation/(alimentation=${(com.travel_agency.model.trip.TripAlimentationEnum).FB.name()})}"  class="singleFoodTripLink">-->
        <!--               FB-->
        <!--                <div class="tripSignature">-->
        <!--                    Half Board</div></a>-->
        <!--        </div>-->



        <!--        <div class="lastFoodTrip">-->
        <!--            <a href="#" th:href="@{/tripsByAlimentation/(alimentation=${(com.travel_agency.model.trip.TripAlimentationEnum).SC.name()})}"  class="singleFoodTripLink">-->
        <!--                SC-->
        <!--                <div class="tripSignature">-->
        <!--                    Full Board</div></a>-->
        <!--        </div>-->

        <div style="clear:both"></div>
    </div>


    <div id="tableDiv">
        <div class="tripsBar">Najlepsze oferty na naszej stronie!
        </div>
        <table>

            <tr>
                <th>Miejsce</th>
                <th>Rodzaj</th>
                <th>Standard</th>
                <th>Status</th>
                <th>Cena</th>
                <th>Sprawdź</th>
            </tr>

            <tr th:each="trip: ${trips}">
                <td th:text="${trip.destination.country}">Tajlandia</td>
                <td th:text="${trip.tripType.description}">Wakacyjna</td>
                <td th:text="${trip.tripAlimentationEnum.description}">All Inclusive</td>
                <td th:text="${trip.status.description}">Promocyjna</td>
                <td th:text="${trip.priceForAdult}">7999.00</td>
                <td>
                    <a href="#" th:href="@{|/trip/${trip.id}|}">
                        <button class="button button2">Do oferty</button></a>
                </td>
            </tr>

        </table>
    </div>

    <div id="bestTrips">

        <div class="tripsBar">Nasze bestsellery!
        </div>

        <div class="bestTrip">

            <div class="btImage">
                <img src="img/bt1.jpg">
            </div>

            <div class="btDescription">

                <table class="table table2">

                    <tr class="tr tr2">
                        <th class="th th2">Hiszpania, All Inclusive</th>
                    </tr>

                    <tr class="tr tr2"><td class="td td2">
                        <ul>
                            <li>Wycieczka wakacyjna</li>
                            <li>Super odpoczynek nad morzem</li>
                            <li>Standard All Inclusive</li>
                            <li>Hotel 5 gwiazdkowy</li>
                        </ul>
                    </td></tr>

                    <tr class="tr tr2">
                        <th class="th th2">Status: promocyjna</th>
                    </tr>

                </table>
            </div>

            <div class="btPrice">
                <p></p>
                .
                <p></p>
                Cena: 3650.00
                <p></p>
                <a href="http://google.com">
                    <button class="button button2">Do oferty</button></a>
            </div>

        </div>

        <div class="bestTrip">

            <div class="btImage">
                <img src="img/ski.jpg">
            </div>

            <div class="btDescription">

                <table class="table table2">

                    <tr class="tr tr2">
                        <th class="th th2">Austria, Bed & Breakfast</th>
                    </tr>

                    <tr class="tr tr2"><td class="td td2">
                        <ul>
                            <li>Wycieczka zimowa</li>
                            <li>Super wyjazd na narty</li>
                            <li>Standard HB</li>
                            <li>Hotel 3 gwiazdkowy</li>
                        </ul>
                    </td></tr>

                    <tr class="tr tr2">
                        <th class="th th2">Status: aktywna</th>
                    </tr>

                </table>

            </div>

            <div class="btPrice">
                <p></p>
                .
                <p></p>
                Cena: 2990.00
                <p></p>
                <a href="http://google.com">
                    <button class="button button2">Do oferty</button></a>
            </div>

        </div>

        <div class="bestTrip">

            <div class="btImage">
                <img src="img/taj.jpg">
            </div>

            <div class="btDescription">

                <table class="table table2">

                    <tr class="tr tr2">
                        <th class="th th2">Tajlandia, Full Board</th>
                    </tr>

                    <tr class="tr tr2"><td class="td td2">
                        <ul>
                            <li>Wycieczka objazdowa</li>
                            <li>Wyjazd do egoztycznego kraju</li>
                            <li>Standard Full Board</li>
                            <li>Hotel 3 gwiazdkowy</li>
                        </ul>
                    </td></tr>

                    <tr class="tr tr2">
                        <th class="th th2">Status: promocyjna</th>
                    </tr>

                </table>

            </div>

            <div class="btPrice">
                <p></p>
                .
                <p></p>
                Cena: 8890.00
                <p></p>
                <a href="http://google.com">
                    <button class="button button2">Do oferty</button></a>
            </div>

        </div>

    </div>

</div>

</body>
</html>