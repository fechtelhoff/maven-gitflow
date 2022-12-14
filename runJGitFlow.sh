#!/bin/bash

VERSION=$(head -n10 pom.xml | sed -n "/<version>/p" | sed -e "s/.*<version>\(.*\)-SNAPSHOT<\/version>.*/\1/")

echo Version=${VERSION}

./mvnw -B jgitflow:release-start -DreleaseVersion=${VERSION}

./mvnw -B jgitflow:release-finish
