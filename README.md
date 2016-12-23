### Spring Cloud Example
================================================================================

[Spring Cloud Documentation](http://cloud.spring.io/spring-cloud-static/spring-cloud.html)

Spring Boot microservice example:

Components include:
* cloud-config-server 
* cloud-config-client
* cloud-eureka-server
* cloud-eureka
* cloud-ribbon
* cloud-zuul
* cloud-hystrix
* cloud-hystrix-dashboard
* cloud-turbine
* cloud-turbine-stream

Project Build System
--------------------------------------------------------------------------------

The examples can use Maven or Gradle.

A Spring Boot initialisation script has been included with each module.

Example:
- <MODULE_NAME>/bin/boot-maven.sh
- <MODULE_NAME>/bin/boot-gradle.sh

Maven example:

[example-application/bin/boot-maven.sh](example-application/bin/boot-maven.sh)

Gradle example:

[example-application/bin/boot-gradle.sh](example-application/bin/boot-gradle.sh)

Spring Boot 'actuator' and 'devtools' dependencies have been included where applicable.


Removing a build system from the project (run from project root):

Maven:
[bin/remove-maven.sh](bin/remove-maven.sh)

Gradle:
[bin/remove-gradle.sh](bin/remove-gradle.sh)


Project sections
--------------------------------------------------------------------------------

##0.1.0 - Create example application
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

###Add Controller and configuration

Add [jp.bikon.web.ExampleController.java](example-application/src/main/java/jp/bikon/web/ExampleController.java)

Add [jp.bikon.domain.Example.java](example-application/src/main/java/jp/bikon/domain/Example.java)

Add [jp.bikon.config.ExampleProperties.java](example-application/src/main/java/jp/bikon/config/ExampleProperties.java)

Add 'example.message' property to [resources/application.yml](example-application/src/main/resources/application.yml)

###Run the application
```
cd example-application
```

Maven:
```
./mvnw spring-boot:run
```

Gradle:
```
./gradlew bootRun
```

###Test
```
  curl http://localhost:8080/message
```

##0.1.1 - Add profiles to the application
###Amend application.yml configuration

Add 'zone-jp' and 'zone-us' profiles to [resources/application.yml](example-application/src/main/resources/application.yml)

###Run the application
```
cd example-application
```

Maven:
```
./mvnw spring-boot:run -Drun.profiles=zone-jp
```
OR:

```
./mvnw spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=zone-jp"
```

Gradle:
```
SPRING_PROFILES_ACTIVE=zone-jp ./gradlew bootRun
```

IDE (VM arguments):
```
-Dspring.profiles.active=zone-jp
```

Java (command line, from 'target' directory):
```
java -jar -Dspring.profiles.active=zone-jp example-0.1.1.jar
```

###Test - the result should match the 'example.message' value for the profile
```
curl http://localhost:8080/message
```

Links
--------------------------------------------------------------------------------
Spring Cloud:
[Spring Cloud Project](http://projects.spring.io/spring-cloud/)
[Documentation](http://cloud.spring.io/spring-cloud-static/Camden.SR3/)

Build systems:
- [Maven](http://maven.apache.org)
- [Gradle](https://gradle.org)
    - [User Guide](https://docs.gradle.org/current/userguide/userguide.html)
    - [Multi project builds](https://docs.gradle.org/current/userguide/intro_multi_project_builds.html)

Articles:
- [https://spring.io](https://spring.io)
    - [Spring Cloud Netflix](http://cloud.spring.io/spring-cloud-netflix/spring-cloud-netflix.html)
    - [12-Factor App-Style Configuration with Spring](https://spring.io/blog/2015/01/13/configuring-it-all-out-or-12-factor-app-style-configuration-with-spring)
    - [Microservice Registration and Discovery with Spring Cloud and Netflix's Eureka](https://spring.io/blog/2015/01/20/microservice-registration-and-discovery-with-spring-cloud-and-netflix-s-eureka)
    - [Routing and Filtering](https://spring.io/guides/gs/routing-and-filtering/)
    - [Spring Cloud at Netflix - SpringOne2GX 2015](https://libraries.io/github/netflix-spring-one)
- Assorted
    - [baeldung.com - Introduction to Spring Cloud Netflix – Eureka](http://www.baeldung.com/spring-cloud-netflix-eureka)
    - [nofluffjuststuff.com - Cloud Native Spring: Configuring Microservices](https://nofluffjuststuff.com/magazine/2016/06/cloud_native_spring_configuring_microservices)
    - [kubecloud.io - Implementing Spring Cloud Config](http://kubecloud.io/guide-spring-cloud-config/)
    - [ryanjbaxter.com - 8 part series](http://ryanjbaxter.com/2015/09/14/building-cloud-native-apps-with-spring-part-1/)
    - [kennybastani.com - Event Sourcing in Microservices Using Spring Cloud and Reactor](http://www.kennybastani.com/2016/04/event-sourcing-microservices-spring-cloud.html)
    - [kennybastani.com - Building Microservices with Spring Cloud and Docker](http://www.kennybastani.com/2015/07/spring-cloud-docker-microservices.html)


