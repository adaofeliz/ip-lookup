IP Lookup  - [![Build Status](https://travis-ci.org/adaofeliz/ip-lookup.png)](https://travis-ci.org/adaofeliz/ip-lookup)
==================
Spring Boot Web Application for ip address lookup using MaxMind GeoIP2 and GMaps.js for UI

Service API
--------------

Response	| Method	| Path	| Description
--------------- | ------------- | ----- | -------------
CityResponse	| GET	| /api/location	| Returns CityResponse based in the IP from the request
CityResponse	| GET	| /api/location/{ipAddress}	| Returns CityResponse based in the given IP

Web UI - Gmaps.js (https://hpneo.github.io/gmaps/)
--------------
![Web UI][1]


Installation
--------------
* Clone this project
```sh
git clone https://github.com/adaofeliz/ip-lookup.git ip-lookup
```

* Start Up the Application
```sh
cd ip-lookup
mvn clean install
java -jar target/ip-lookup.war
```

Try it
--------------
- Now open your browser: http://localhost:8080/

[1]: ./.screenshots/screenshot1.png