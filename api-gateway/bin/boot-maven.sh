#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Include actuator and devtools.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=maven-project \
  -d applicationName="APIGatewayApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="api-gateway" -d artifactId="api-gateway" \
  -d description="Spring API Gateway Server" \
  -d dependencies=cloud-zuul,cloud-config-client,actuator,devtools \
  -d version="0.5.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
