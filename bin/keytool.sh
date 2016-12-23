#!/bin/sh

# http://cloud.spring.io/spring-cloud-config/spring-cloud-config.html
#
# Creating a Key Store for Testing
#
keytool -genkeypair -alias testkey -keyalg RSA \
  -dname "CN=Web Server,OU=Unit,O=Organization,L=City,S=State,C=US" \
  -keypass changeme -keystore server.jks -storepass testpass
