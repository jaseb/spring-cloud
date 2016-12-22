#!/bin/sh

# Remove Maven files from project.

PROJECT_NAME='spring-cloud'

CURRENT_DIR=${PWD##*/}

if [[ ${CURRENT_DIR} != ${PROJECT_NAME} ]]
then
  echo "Must be in '${PROJECT_NAME}' base directory"
  exit
fi

find . -type d -name .mvn -print0 | xargs -0 rm -rf
find . -type d -name target -print0 | xargs -0 rm -rf
find . -type f -name mvnw -print0 | xargs -0 rm
find . -type f -name mvnw.cmd -print0 | xargs -0 rm
find . -type f -name pom.xml -print0 | xargs -0 rm
