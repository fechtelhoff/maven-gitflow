#!/bin/bash

# Die einzelne Ausführung von "release-start" und "release-finish" (anstatt von "release")
# führt eher zu einem Commit-Bild wie beim veralteten JGitFlow-Plugin.

# ./mvnw -B gitflow:release-start
# ./mvnw -B gitflow:release-finish

./mvnw -B gitflow:release
