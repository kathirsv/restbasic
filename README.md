# A Simple Hello World REST Service

This is a simple Hello world Rest Service using gradle - jetty - jax-rs - resteasy

Min Requirement:

* Java 1.7

* Ports 8080,8090 to be free on the machine, where this is run

````
git clone https://github.com/kathirsv/restbasic.git

If you don't have git, download the project as zip file, unzip and 
rename restbasic-master to restbasic

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
