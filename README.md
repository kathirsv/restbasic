# restbasic

Simple Hello world Rest Service using gradle - jetty - jax-rs - apache http client (test)

Min Requirement:

* Java 1.7
* Ports 8080,8090 to be free on the machine, where this is run

````
git clone [clone_url]

cd restbasic

./gradlew jettyRunWar
````
In another tab,

````
./gradlew test

./gradlew jettyStop
````
