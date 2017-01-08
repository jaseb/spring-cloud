##0.8.0 - Create Spring Boot Admin application
###Create the project skeleton

[Spring Boot Admin Server]([http://codecentric.github.io/spring-boot-admin/1.4.5/])


```
cd admin-server
```

If using Maven:
```
./bin/boot-maven.sh
```

Otherwise, if using Gradle:
```
./bin/boot-gradle.sh
```

This will initialise a Spring Boot applicatio with the following:

- spring-cloud-starter-eureka
- spring-boot-admin-server
- spring-boot-admin-server-ui
- spring-boot-admin-server-ui-hystrix (optional)
- spring-boot-admin-server-ui-turbine (optional)

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
