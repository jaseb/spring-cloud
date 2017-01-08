##0.6.0 - Create example application
###Create the project skeleton

```
cd example-application
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
