####Spring Boot Admin Server

@WIP

- Hystrix, Turbine integration:
 - [http://codecentric.github.io/spring-boot-admin/1.4.5/](http://codecentric.github.io/spring-boot-admin/1.4.5/)
- Git info:
  - [http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/howto-build.html#howto-git-info](http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/html/howto-build.html#howto-git-info)

Maven:
    
    ```
    <build>
        <plugins>
            <plugin>
                <groupId>pl.project13.maven</groupId>
                <artifactId>git-commit-id-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
    ```
    
Gradle: 
    
    ```
    plugins {
        id "com.gorylenko.gradle-git-properties" version "1.4.6"
    }
    ```
