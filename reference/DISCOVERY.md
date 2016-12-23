##0.3.0 - Discovery server using @EnableEurekaServer
###Create the project skeleton

```
cd discovery-server
```

If using Maven:
```
./bin/boot-maven.sh
```

Otherwise, if using Gradle:
```
./bin/boot-gradle.sh
```

##0.2.1 - Amend Discovery server to use cloud configuration 
###Amend configuration

Add 'spring-cloud-starter-config' dependency to [pom.xml](../discovery-server/pom.xml)

Add [resources/bootstrap.yml](../discovery-server/src/main/resources/bootstrap.yml)

Amend [resources/discovery.yml](../discovery-server/src/main/resources/discovery.yml)
 
###Test

Start the application, and browse to http://localhost:8761
