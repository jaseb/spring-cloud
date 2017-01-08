#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Includes actuator,devtools and configuration-processor.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=gradle-project \
  -d applicationName="TurbineApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="Turbine Application" -d artifactId="turbine-application" \
  -d description="Spring Turbine Application" \
  -d dependencies=cloud-turbine,cloud-eureka,actuator,devtools \
  -d version="0.5.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
