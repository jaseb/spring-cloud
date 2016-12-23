###Running the application

Assume all commands are executed from application directory unless noted otherwise.

####Default Spring Boot commands
Maven:
```
./mvnw spring-boot:run 
```

Gradle:
```
./gradlew bootRun
```

####Using Profiles
Substitute PROFILE_NAME placeholder as required. 

Maven:
```
./mvnw spring-boot:run -Drun.profiles=PROFILE_NAME
```
OR:

```
./mvnw spring-boot:run -Drun.jvmArguments="-Dspring.profiles.active=PROFILE_NAME"
```

Gradle:
```
SPRING_PROFILES_ACTIVE=PROFILE_NAME ./gradlew bootRun
```

IDE (VM arguments):
```
-Dspring.profiles.active=PROFILE_NAME
```

Java (command line, from 'target' directory):
```
java -jar -Dspring.profiles.active=PROFILE_NAME example-0.1.1.jar
```
