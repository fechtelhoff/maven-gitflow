#!/bin/bash

git init

git checkout -b main

git add .gitignore

git commit -m "Initial Commit"

git checkout -b develop

git add .

git commit -m "Changes"

git log

git status
