#!/bin/sh

# Remove Gradle files from project.

PROJECT_NAME='spring-cloud'

CURRENT_DIR=${PWD##*/}

if [[ ${CURRENT_DIR} != ${PROJECT_NAME} ]]
then
  echo "Must be in '${PROJECT_NAME}' base directory"
  exit
fi

./gradlew clean

find . -type d -name gradle -print0 | xargs -0 rm -rf
find . -type d -name .gradle -print0 | xargs -0 rm -rf
find . -type f -name build.gradle -print0 | xargs -0 rm
find . -type f -name gradlew -print0 | xargs -0 rm
find . -type f -name gradlew.bat -print0 | xargs -0 rm
find . -type f -name settings.gradle -print0 | xargs -0 rm
