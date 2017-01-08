### Spring Cloud Example
================================================================================

[Spring Cloud Project](http://projects.spring.io/spring-cloud/)
[Documentation](http://cloud.spring.io/spring-cloud-static/Camden.SR3/)

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


Project sections
--------------------------------------------------------------------------------

[Build systems](reference/BUILDING.md)

[Running the application](reference/RUNNING.md)

- [0.1.0 - Create example application](reference/EXAMPLE.md)
  - [0.1.1 - Add profiles to the application](reference/EXAMPLE.md)
- [0.2.0 - Cloud configuration using @EnableConfigServer](reference/CONFIGURATION.md)
  - [0.2.1 - Amend example application to use cloud configuration](reference/CONFIGURATION.md)
  - [0.2.2 - Runtime configuration changes (including@RefreshScope)](reference/CONFIGURATION.md)
  - [0.2.3 - Configuration property encryption and decryption](reference/CONFIGURATION.md)
- [0.3.0 - Discovery server using @EnableEurekaServer](reference/DISCOVERY.md)
  - [0.3.1 - Amend discovery server to use cloud configuration](reference/DISCOVERY.md)
  - [0.3.2 - Amend example application to use discovery server](reference/DISCOVERY.md)
- [0.4.0 - Load balancing with Ribbon](reference/LOAD_BALANCING.md)
  - [0.4.1 - Configure example-application to run multiple instances locally](reference/LOAD_BALANCING.md)
  - [0.4.2 - Add the Ribbon configuration](reference/LOAD_BALANCING.md)
- [0.5.0 - API Gateway using Zuul](reference/API_GATEWAY.md)
  - [0.5.1 - Configuration using @EnableZuulProxy](reference/API_GATEWAY.md)
  - [0.5.2 - Amendments to ExampleClientApplication](reference/API_GATEWAY.md)


- [WIP - Spring Boot Admin Server](http://codecentric.github.io/spring-boot-admin/1.4.5/)
  - [Hystrix and Turbine Integration]()

[References / Links](reference/LINKS.md)
