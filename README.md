# restbasic

Simple Hello world Rest Service using gradle - jetty - jax-rs - apache http client (test)

Min Requirement:

* Java 1.7
* Port 8080 to be free on the machine, where this is run

Download restbasic

git clone [clone_url]

cd restbasic

````
./gradlew clean build -x test

./gradlew jettyRunWar
````
In another tab,

````
./gradlew test

./gradlew jettyStop
````
