#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Include actuator and devtools.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=maven-project \
  -d applicationName="ConfigServerApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="config" -d artifactId="config" \
  -d description="Spring Cloud Config Server" \
  -d dependencies=cloud-config-server,actuator,devtools \
  -d version="0.2.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
