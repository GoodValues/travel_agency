insert into trip(id, date_from, date_to, duration, adult_price, child_price, trip_type,  alimentation, description, status, people_limit, destination_id, visits) VALUES
(1, '2021-01-20', '2020-01-30', 10, 120, 100, 'WINTER', 'AI', 'Zimowy wyjazd', 'ACTIVE', 20, 1, 0),
(2, '2021-05-15', '2020-05-20', 5, 110, 90, 'SUMMER', 'HB', 'Fajny majowy urlop', 'ACTIVE', 30, 2, 0),
(3, '2021-07-10', '2020-07-21', 11, 150, 130, 'ROUND_TRIP', 'FB', 'urlop wakacyjny', 'PROMOTED', 10, 3, 0),
(4, '2021-04-7', '2020-04-14', 7, 90, 80, 'LAST_MINUTE', 'SC', 'Wyjazd wczesną wiosną', 'EXPIRED', 20, 4, 0),
(5, '2021-09-8', '2020-09-16', 8, 129, 115, 'ROUND_TRIP', 'AI', 'Wypadzik wrześniowy', 'ACTIVE', 8, 5, 0);

insert into address(id, road, road_number, postal_code, city, country) VALUES
(1, 'Marszałkowska', 12, '02-497', 'Warszawa', 'Polska'),
(2, 'Grójecka', 4, '01-437', 'Radom', 'Polska'),
(3, 'Strasse', 78, '21-233', 'Berlin', 'Niemcy'),
(4, 'Dmowskiego', 56, '12-784', 'Wrocław', 'Polska'),
(5, 'Morska', 6, '11-239', 'Gdańsk', 'Polska'),
(6, 'Zielona', 26, '01-439', 'Poznań', 'Polska'),
(7, 'Prosta', 61, '11-415', 'Sosnowiec', 'Polska'),
(8, 'Barska', 13, '02-239', 'Warszawa', 'Polska');

insert into destination(id, continent, country, city, airport) VALUES
(1, 'Europa', 'Szwajcaria', 'Zurych', 'Zurych-Kloten'),
(2, 'Europa', 'Hiszpania', 'Barcelona', 'El-Prat'),
(3, 'Azja', 'Tajlandia', 'Bangkok', 'Suvarnabhumi'),
(4, 'Ameryka Północna', 'Nowy Jork', 'Nowy Jork', 'F.Kennedego'),
(5, 'Azja', 'Indie', 'Bombaj', 'Shivaji');

insert into hotel(id, name, standard, location, description, destination_id) VALUES
(1, 'Hilton', 'FIVE_STAR', 'Zurych', 'Luksusowy hotel rodziny Hiltonów', 1),
(2, 'Sheraton', 'FOUR_STAR', 'Barcelona', 'Bardzo porządny hotel', 2),
(3, 'Marriot', 'FIVE_STAR', 'Bangkok', 'Amerykanski hotel dla bogatych', 3),
(4, 'Plaza', 'THREE_STAR', 'Nowy Jork', 'Hotel przy Central Parku', 4),
(5, 'Ibis', 'ONE_STAR', 'Bombaj', 'Hotel w wersji ekonomicznej', 5),
(6,  'Hotelik', 'THREE_STAR', 'Zurych', 'Fajny hotel', 1),
(7, 'Noclegownia', 'TWO_STAR', 'Bangkok', 'Dobry na tanie nocowanie', 3),
(8, 'Hotel Manhattan', 'FOUR_STAR', 'Nowy Jork', 'Dobre miejsce do nocowania w Nowym Jorku', 4);

insert into user(id, first_name, last_name, email, password, role_name) VALUES
(1, 'Jan','Kowalski', 'jan.kowalski@gmail.com', 'janek1234','USER'),
(2, 'Agata','Nowak', 'agata.nowak@gmail.com', 'agatka1234','ADMIN'),
(3, 'Marian','Pawlak', 'marian.pawlak@gmail.com', 'marian1234','USER'),
(4, 'Karolina','Pisarek', 'karolina.pisarek@gmail.com', 'karolina1234','USER'),
(5, 'Stefan','Boczek', 'stefan.boczek@gmail.com', 'stefan1234','ADMIN'),
(6, 'Anna','Szarek', 'anna.szarek@gmail.com', 'anna1234','USER'),
(7, 'Karol','Szepietowski', 'karol.szepietowski@gmail.com', 'karol1234','ADMIN'),
(8, 'Genowefa','Pigwa', 'genowefa.pigwa@gmail.com', 'genowefa1234','USER');


insert into hotel_trip(hotel_id, trip_id) VALUES
(1,1),(2,1),(1,3),(7,2),(8,1),(4,6);

insert into user_trip(user_id, trip_id) VALUES
(4,1),(1,2),(3,1),(7,5),(4,4),(3,3);














