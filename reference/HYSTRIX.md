##0.6.0 - Create example application
###Create the project skeleton

```
cd hystrix-dashboard
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

- cloud-hystrix-dashboard
- cloud-eureka (optional)

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
http://localhost:7979/hystrix
```

##0.6.1 - Amend example-client to use Hystrix

Add 'spring-cloud-starter-hystrix' dependency.
 
If using Maven:

[../example-client/pom.xml](../example-client/pom.xml) 


If using Gradle:

[../example-client/build.gradle](../example-client/build.gradle)


Amend the example-client application:

Add @EnableHystrix to [ExampleClientApplication.java](../example-client/src/main/java/jp/bikon/ExampleClientApplication.java)        

Add @HystrixCommand(fallbackMethod = "returnDefaultMessage") to [ExampleClientController.java](../example-client/src/main/java/jp/bikon/web/ExampleClientController.java)
and add fallback method


##0.6.2 - Testing the circuit breaker

Start the following applications in this order:

- ConfigServerApplication
- DiscoveryServerApplication
- HystrixDashBoardApplication
- ExampleClientApplication


Check 'example-client' has registered with [http://localhost:8761](http://localhost:8761)

As APIGatewayApplication is not being used, request message using direct endpoint:

```
curl http://localhost:8083/balance
```

Result should be 'Fallback method handled exception'

Browse to the Hystrix Dashboard at [http://localhost:7979/hystrix](http://localhost:7979/hystrix)

Enter the following stream:

```
http://localhost:8083/hystrix.stream
```

In order to test a working route, start the ExampleApplication. 

Allow time for the service to register with Eureka and send the curl request.
