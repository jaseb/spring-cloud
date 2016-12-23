Project Build System
--------------------------------------------------------------------------------

The examples can use Maven or Gradle.

A Spring Boot initialisation script has been included with each module.

Example:
- <MODULE_NAME>/bin/boot-maven.sh
- <MODULE_NAME>/bin/boot-gradle.sh

Maven example:

[example-application/bin/boot-maven.sh](example-application/bin/boot-maven.sh)

Gradle example:

[example-application/bin/boot-gradle.sh](example-application/bin/boot-gradle.sh)

Spring Boot 'actuator' and 'devtools' dependencies have been included where applicable.


Removing a build system from the project (run from project root):

Maven:
[bin/remove-maven.sh](bin/remove-maven.sh)

Gradle:
[bin/remove-gradle.sh](bin/remove-gradle.sh)
