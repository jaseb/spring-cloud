#!/bin/sh

# Generate Spring Boot skeleton project.
#
# Includes actuator,devtools and configuration-processor.
#
# To see all options run 'curl https://start.spring.io'
#
curl https://start.spring.io/starter.zip \
  -d type=gradle-project \
  -d applicationName="ExampleApplication" \
  -d packageName="jp.bikon" \
  -d groupId="jp.bikon" -d name="example" -d artifactId="example" \
  -d description="Spring Cloud Example Application" \
  -d dependencies=web,actuator,devtools,configuration-processor \
  -d version="0.1.0-SNAPSHOT" \
  -d javaVersion="1.8" \
  | tar -xzvf -
