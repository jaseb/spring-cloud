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

Add [jp.bikon.web.ExampleController.java](../example-application/src/main/java/jp/bikon/web/ExampleController.java)

Add [jp.bikon.domain.Example.java](../example-application/src/main/java/jp/bikon/domain/Example.java)

Add [jp.bikon.config.ExampleProperties.java](../example-application/src/main/java/jp/bikon/config/ExampleProperties.java)

Add 'example.message' property to [resources/application.yml](../example-application/src/main/resources/application.yml)

###Run the application

See [Running the application](RUNNING.md)

###Test
```
  curl http://localhost:8080/message
```

##0.1.1 - Add profiles to the application
###Amend application.yml configuration

Add 'zone-jp' and 'zone-us' profiles to [resources/application.yml](../example-application/src/main/resources/application.yml)

###Run the application using one of the profiles defined in the previous step
```
cd example-application
```

See [Running the application](RUNNING.md)

###Test - the result should match the 'example.message' value for the profile
```
curl http://localhost:8080/message
```
