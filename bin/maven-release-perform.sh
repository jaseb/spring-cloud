#!/bin/sh

# Maven Release script.

PROJECT_NAME='spring-cloud'

CURRENT_DIR=${PWD##*/}

if [[ ${CURRENT_DIR} != ${PROJECT_NAME} ]]
then
  echo "Must be in '${PROJECT_NAME}' base directory"
  exit
fi

mvn release:clean && mvn release:prepare && mvn release:perform

# Sync the '[maven-release-plugin] prepare for next development iteration' commit
git fetch
