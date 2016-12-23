##0.2.0 - Cloud configuration using @EnableConfigServer
###Create the project skeleton

```
cd config-server
```

If using Maven:
```
./bin/boot-maven.sh
```

Otherwise, if using Gradle:
```
./bin/boot-gradle.sh
```

###Add Configuration

Add @EnableConfigServer annotation to [ConfigServerApplication.java](../config-server/src/main/java/jp/bikon/ConfigServerApplication.java)

Add server configuration to [resources/application.yml](../config-server/src/main/resources/application.yml)

#####Add configuration for the 'example-application'

Spring Boot provides a 'native' profile for local testing. If not provided then GitHub will be used.

Copy the 'example-application' [application.yml](../example-application/src/main/resources/application.yml) as follows:

Using the local 'native' profile for testing:
 
Copy to [resources/config/example.yml](../config-server/src/main/resources/config/example.yml)

Using the default remote profile:

Copy to [config/example.yml](../config/example.yml)

###Run the application (with optional 'native' profile)

See [Running the application](RUNNING.md)

###Test

Call the ConfigServer to verify:

```
curl http://localhost:8888/example/default
```

```
curl http://localhost:8888/example/zone-jp
```

##0.2.1 - Amend Example Application to use Cloud Configuration 
###Amend Configuration

Add 'spring-cloud-dependencies' to dependencyManagement section of [pom.xml](..example-application/pom.xml)

Add 'spring-cloud-starter-config' dependency to [pom.xml](..example-application/pom.xml)

Add [resources/bootstrap.yml](..example-application/src/main/resources/bootstrap.yml) to 'example-application'

Comment out (or remove) all content from [resources/application.yml](..example-application/src/main/resources/application.yml)

###Test

Ensure ConfigServer module is running (either 'native' or default profile)

Start ExampleApplication, and test REST endpoint:
```
curl http://localhost:8080/message
```
