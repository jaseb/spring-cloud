#!/bin/sh

# Maven Release Dry Run.

PROJECT_NAME='spring-cloud'

CURRENT_DIR=${PWD##*/}

if [[ ${CURRENT_DIR} != ${PROJECT_NAME} ]]
then
  echo "Must be in '${PROJECT_NAME}' base directory"
  exit
fi

mvn release:prepare -DdryRun -Dresume=false
