TRAVEL AGENCY APP

App is a service of travel agency based on MVC pattern and written in back-end languages like Java and Spring Boot connected with front-end technologies - Thymeleaf, HTML and CSS. All datas are converted and saved through technology Hibernate in database - My-SQL. All neccesary data are returned through jsp (Java Single Page) or REST API - depends on functionality. Finally project is going to extended by fully REST API service in Angular Technology. 

Project includes funcionalities as below:
- returning list of all components from model (trips, hotels, order, reservation, users etc.). When returned in REST API data are displayed in pretty JSON.
- all model's CRUD - create, read, update, delete - working with Hibernate technology and My-SQL Database. 
- initializing data by file data.sql.
- login and registration form - expect basic data user can upload and save his PROFILE IMAGE (Multipart File).
- fully authorization by logging and registration of user using Spring Security technology - specifically JWT (Java Web Token). User is maintained in session during 1 hour.
- MICROSERVICE TECHNOLOGY - returning data about present weather conditions based on given city name (temperature, pressure, humidity, description of weather) from external API: https://openweathermap.org/api .
- main page written in html and css - in proggress (for now we are focusing on back-end side of project).
- documentation: Swagger.