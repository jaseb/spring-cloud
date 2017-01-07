##0.5.0 - API Gateway using Zuul

###Create the project skeleton

```
cd example-client
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

- cloud-zuul
- cloud-config-client

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

##0.5.1 - Configuration using @EnableZuulProxy

Add @EnableZuulProxy to APIGatewayApplication.java

Configure api-gateway.yml, application.yml and bootstrap.yml

Test:

Verify the service is running by requesting directly:

```
curl http://127.0.0.1:8081/message
```

Now request the endpoint via the proxy:

```
curl http://127.0.0.1:8080/api/example/message
```

##0.5.2 - Amendments to ExampleClientApplication

The API gateway is now accepting and proxying requests on port 8080, therefore
the ExampleClientApplication must be amended to use a different port.






















