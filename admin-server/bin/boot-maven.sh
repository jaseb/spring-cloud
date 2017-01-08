#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Include actuator and devtools.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=maven-project \
  -d applicationName="AdminServerApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="Admin Server" -d artifactId="admin-server" \
  -d description="Spring Boot Admin Server" \
  -d dependencies=cloud-eureka \
  -d version="0.2.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
