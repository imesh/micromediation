# Microservices Mediation Server

This is sample microservices mediation server written using Apache Camel.

## How to run
1. Compile camel-sample-web project, this contains a sample HTTP endpoint:

    ````
    git clone https://github.com/imesh/micromediation.git
    cd camel-sample-web
    mvn clean install
    ````

2. Start camel-sample-web http endpoint using a jettry server:

    ````
    mvn jetty:run
    ````

3. Compile Timer Route Camel Java DSL:

    ````
    cd camel-timer-route
    mvn clean install
    ````

4. Start Timer Route using Camel standalone Java container:

    ````
    mvn camel:run
    ````
