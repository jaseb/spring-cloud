#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Includes actuator,devtools and configuration-processor.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=gradle-project \
  -d applicationName="ExampleClientApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="example-client" -d artifactId="example-client" \
  -d description="Spring Cloud Example Client (Load Balanced) Application" \
  -d dependencies=web,actuator,devtools,configuration-processor,cloud-config-client,cloud-eureka,cloud-ribbon \
  -d version="0.4.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
