<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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

<%--<h1> Witaj: ${userName} </h1>--%>
<%--<h2>Data Twoich odwiedzin: ${dateTime}</h2>--%>
<%--<h2>Witryna została odwiedzona ${visitCount} razy! </h2>--%>

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

    <div id="search">

        <div id="searchWindow">

            <div id="boxTop">Znajdź wakacje marzeń!</div>

            <div class="searchText">Kiedy?</div>

            <div class="searchBox">
                <select>
                    <option>Opcja 1</option>
                    <option>Opcja 2</option>
                    <option>Opcja 3</option>
                </select></div>

            <div style="clear:both"></div>

            <div class="searchText">Ile osób?</div>

            <div class="searchBox">
                <select>
                    <option>Opcja 1</option>
                    <option>Opcja 2</option>
                    <option>Opcja 3</option>
                </select>
            </div>

            <div style="clear:both"></div>

            <div class="searchText">Dokąd?</div>
            <div class="searchBox">
                <select>
                    <option>Opcja 1</option>
                    <option>Opcja 2</option>
                    <option>Opcja 3</option>
                </select></div>

            <div style="clear:both"></div>

            <a href="http://google.com">
                <button class="button button1">Szukaj</button>
            </a>
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
                <a href="http://google.com" class="singleTripLink">
                    <img src="img/summer.jpg">
                    <div class="tripSignature">
                        Wakacyjna</div></a>
            </div>


            <div class="singleTrip">
                <a href="http://google.com" class="singleTripLink">
                    <img src="img/winter.jpg">
                    <div class="tripSignature">
                        Zimowa</div></a>
            </div>


            <div class="singleTrip">
                <a href="http://google.com" class="singleTripLink">
                    <img src="img/round.jpg">
                    <div class="tripSignature">
                        Objazdowa</div></a>
            </div>


            <div class="lastTrip"><a href="http://google.com" class="singleTripLink">
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

        <div class="singleFoodTrip" style="sociallink">
            <a href="http://google.com" class="singleFoodTripLink">
                AI
                <div class="tripSignature">
                    All Inclusive</div></a>
        </div>


        <div class="singleFoodTrip">
            <a href="http://google.com" class="singleFoodTripLink">
                BB
                <div class="tripSignature">Bed_Breakfast</div></a>
        </div>


        <div class="singleFoodTrip">
            <a href="http://google.com" class="singleFoodTripLink">
                HB
                <div class="tripSignature">
                    Half Board</div></a>
        </div>


        <div class="lastFoodTrip">
            <a href="http://google.com" class="singleFoodTripLink">
                FB
                <div class="tripSignature">
                    Full Board</div></a>
        </div>

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

            <tr>
                <td>Tajlandia</td>
                <td>Wakacyjna</td>
                <td>All Inclusive</td>
                <td>Promocyjna</td>
                <td>7999.00</td>
                <td>
                    <a href="http://google.com">
                        <button class="button button2">Do oferty</button></a>
                </td>
            </tr>

            <tr>
                <td>Austria</td>
                <td>Zimowa</td>
                <td>Half Board</td>
                <td>Aktualna</td>
                <td>2450.00</td>
                <td>
                    <a href="http://google.com">
                        <button class="button button2">Do oferty</button></a>
                </td>
            </tr>

            <tr>
                <td>Argentyna</td>
                <td>Objazdowa</td>
                <td>Full Board</td>
                <td>Wygaszona</td>
                <td>10990.00</td>
                <td>
                    <a href="http://google.com">
                        <button class="button button2">Do oferty</button></a>
                </td>
            </tr>

            <tr>
                <td>Hiszpania</td>
                <td>Last Minute</td>
                <td>All Inclusive</td>
                <td>Aktywna</td>
                <td>3500.00</td>
                <td>
                    <a href="http://google.com">
                        <button class="button button2">Do oferty</button></a>
                </td>
            </tr>

            <tr>
                <td>Grecja</td>
                <td>Aktywna</td>
                <td>Wakacyjna</td>
                <td>Promocyjna</td>
                <td>2300.00</td>
                <td>
                    <a href="http://google.com">
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