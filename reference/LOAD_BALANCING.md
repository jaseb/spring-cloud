##0.4.0 - Load balancing with Ribbon

This example is based on [Client Side Load Balancing with Ribbon and Spring Cloud](https://spring.io/guides/gs/client-side-load-balancing/)

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

- cloud-config-client
- cloud-eureka
- cloud-ribbon

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

##0.4.1 - Configure example-application to run multiple instances locally

Amend [bootstrap.yml](../example-application/src/main/resources/bootstrap.yml) to override Eureka instanceId

This will allow multiple instances to be run on the same machine for testing.

Run the service in the following order:

- ConfigServer (Port 8888)
- DiscoveryServer (Port 8761)
- ExampleApplication (Random Port) using -Dspring.profiles.active=zone-jp
- ExampleApplication (Random Port) using -Dspring.profiles.active=zone-us

Browse to [http://localhost:8761](http://localhost:8761) and two instances of ExampleApplication should be visible
