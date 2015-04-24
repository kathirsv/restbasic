# restbasic

Simple Hello world Rest Service using gradle - jetty - jax-rs - resteasy

Min Requirement:

* Java 1.7
* Ports 8080,8090 to be free on the machine, where this is run

````
git clone https://github.com/kathirsv/restbasic.git

cd restbasic

./gradlew jettyRunWar
````
To Test 
````
http://localhost:8080/restbasic/hello
````
Or in another tab,
````
cd restbasic

./gradlew test

./gradlew jettyStop
````
