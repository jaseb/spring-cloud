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

##0.3.1 - Amend Discovery server to use cloud configuration 
###Amend configuration

Add 'spring-cloud-starter-config' dependency to [pom.xml](../discovery-server/pom.xml)

Add [resources/bootstrap.yml](../discovery-server/src/main/resources/bootstrap.yml)

Amend [resources/discovery.yml](../discovery-server/src/main/resources/discovery.yml)
 
###Test

Start the application, and browse to http://localhost:8761

##0.3.2 - Amend example application to use discovery server 
###Amend configuration

Add 'spring-cloud-starter-eureka' dependency to [pom.xml](../example-application/pom.xml)

Add @EnableDiscoveryClient annotation to [ExampleApplication.java](../example-application/src/main/java/jp/bikon/ExampleApplication.java)

Amend [resources/bootstrap.yml](../example-application/src/main/resources/bootstrap.yml) with the discovery server settings

Amend [config/example.yml](../config/example.yml) with the discovery server settings

Amend [resources/config/example.yml](../config-server/src/main/resources/config/example.yml) with the discovery server settings

###Test

Start the ConfigServer

Start the DiscoveryServer

Start the ExampleApplication

Browse to http://localhost:8761 

The example application should be registered under 'Instances currently registered with Eureka' (may take a few seconds)
