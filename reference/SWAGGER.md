###0.9.0- Swagger integration

[Springfox Documentation](https://springfox.github.io/springfox/docs/current/)

####Add the Swagger dependencies

Maven:

    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger2</artifactId>
        <version>2.6.1</version>
    </dependency>
    
    <dependency>
        <groupId>io.springfox</groupId>
        <artifactId>springfox-swagger-ui</artifactId>
        <version>2.6.1</version>
    </dependency>

Gradle:

    compile("io.springfox:springfox-swagger2:2.6.1")
    compile("io.springfox:springfox-swagger-ui:2.6.1")

####Amend ExampleApplication 

Add [SwaggerConfig.java](../example-application/src/main/java/jp/bikon/config/SwaggerConfig.java)

Note: ExampleApplication.java and ExampleController were refactored.

####Test Swagger

View in JSON format:

[http://localhost:8081/v2/api-docs](http://localhost:8081/v2/api-docs)

View using the Swagger UI:

[http://localhost:8081/swagger-ui.html#/](http://localhost:8081/swagger-ui.html#/)

####Links

http://kubecloud.io/guide-using-swagger-for-documenting-your-spring-boot-rest-api/

http://www.baeldung.com/swagger-2-documentation-for-spring-rest-api

http://heidloff.net/article/usage-of-swagger-2-0-in-spring-boot-applications-to-document-apis/
