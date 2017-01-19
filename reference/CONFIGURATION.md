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

##0.2.1 - Amend Example Application to use cloud configuration 
###Amend Configuration

Add 'spring-cloud-dependencies' to dependencyManagement section of [pom.xml](..example-application/pom.xml)

Add 'spring-cloud-starter-config' dependency to [pom.xml](../example-application/pom.xml)

Add [resources/bootstrap.yml](..example-application/src/main/resources/bootstrap.yml) to 'example-application'

Comment out (or remove) all content from [resources/application.yml](..example-application/src/main/resources/application.yml)

###Test

Ensure ConfigServer module is running (either 'native' or default profile)

Start ExampleApplication, and test REST endpoint:
```
curl http://localhost:8080/message
```

##0.2.2 - Runtime configuration changes (including@RefreshScope) 
###Setup

Ensure ConfigServer is running (optionally with -Dspring.profiles.active=native)

Ensure ExampleApplication is running

#####Updated the property

If testing locally, change the 'example.message' property in [resources/config/example.yml](../config-server/src/main/resources/config/example.yml) and reload the change in IntelliJ (Cmd-Shift-F9)

If testing remotely, change the 'example.message' property in [config/example.yml](../config/example.yml), and commit to GitHub

#####Verify the updated property
Verify the change on ConfigServer:
```
curl http://localhost:8888/example/default
```

Send a POST request to the 'example-application' to trigger an refresh:
```
curl -X POST http://localhost:8080/refresh
```

Verify the updated value:
```
curl http://localhost:8080/message
```

If using @Value annotations, then @RefreshScope must be added to the class (Controller, Service, Component, etc)

##0.2.3 - Configuration property encryption and decryption

The following is based on the example from [Spring Cloud Documentation](http://cloud.spring.io/spring-cloud-static/Camden.SR4/)
- [Encryption and Decryption](http://cloud.spring.io/spring-cloud-static/Camden.SR4/#_encryption_and_decryption)
- [Key Management](http://cloud.spring.io/spring-cloud-static/Camden.SR4/#_key_management)

#####Setup the Java keystore

Run [keytool.sh](../bin/keytool.sh), and copy server.jks to [resources/server.jks](../config-server/src/main/resources/server.jks)

Amend [resources/application.yml](../config-server/src/main/resources/application.yml) with the keystore settings

#####Install Java Cryptography Extension (JCE) Unlimited Strength

Download Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files

http://www.oracle.com/technetwork/java/javase/downloads/jce8-download-2133166.html

Install into $JAVA_HOME/jre/lib/security 

Eg: /Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home/jre/lib/security

#####Test

Encrypt a test message:
```
curl localhost:8888/encrypt -d "Test encrypted message"
```

Replace the value of 'example.message' in example.yml with the output from the previous command

Eg '{cipher}<OUTPUT FROM PREVIOUS>'

Verify decryption is working:
```
curl http://localhost:8888/example/default
```
