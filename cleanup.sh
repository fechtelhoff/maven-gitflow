#!/bin/bash

rm -rf .git .idea 

find . -type d -name "target" -exec rm -rf  {} \;

find . -type f -name "pom.xml" -exec sed -i "s/<version>1.*-SNAPSHOT<\/version>/<version>1.0-SNAPSHOT<\/version>/" {} \;
