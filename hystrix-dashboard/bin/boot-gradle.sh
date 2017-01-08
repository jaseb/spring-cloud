#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Includes actuator,devtools and configuration-processor.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=gradle-project \
  -d applicationName="HystrixDashBoardApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="Hystrix Dashboard" -d artifactId="hystrix-dashboard" \
  -d description="Spring Hystrix Dashboard Application" \
  -d dependencies=cloud-hystrix-dashboard,cloud-eureka,actuator,devtools \
  -d version="0.5.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
