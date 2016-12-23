#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Include actuator and devtools.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=maven-project \
  -d applicationName="DiscoveryServerApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="discovery" -d artifactId="discovery" \
  -d description="Spring Cloud Discovery Server" \
  -d dependencies=cloud-eureka-server,actuator,devtools \
  -d version="0.3.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
