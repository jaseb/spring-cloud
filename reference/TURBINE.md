##0.7.0 - Create example application
###Create the project skeleton

```
cd turbine-appication
```

If using Maven:
```
./bin/boot-maven.sh
```

Otherwise, if using Gradle:
```
./bin/boot-gradle.sh
```

This will initialise a Spring Boot with the following:

- cloud-turbine
- cloud-eureka

NOTE: This is not using 'cloud-turbine-stream', which uses Spring Cloud Stream.

Rename application.properties to application.yml

```
mv src/main/resources/application.properties src/main/resources/application.yml
```

Test with:

```
mvn spring-boot:run
```

OR

```
./gradlew bootRun
```

Browse to:
```
http://localhost:8989
```

##0.7.1 - Testing the stream aggregation

Start the following applications in this order:

- ConfigServerApplication
- DiscoveryServerApplication
- ExampleClientApplication
- HystrixDashboardApplication
- TurbineApplication


Check applications have registered with [http://localhost:8761](http://localhost:8761)

As APIGatewayApplication is not being used, request message using direct endpoint:

ExampleClient application:
```
curl http://localhost:8083/balance
```
Example application:
```
curl http://localhost:8081/message
```

Result should be 'Fallback method handled exception'

Browse to the Hystrix Dashboard at [http://localhost:7979/hystrix](http://localhost:7979/hystrix)

Enter the following stream:

```
http://localhost:8989/turbine.stream
```
