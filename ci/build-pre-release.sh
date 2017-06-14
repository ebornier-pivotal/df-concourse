#!/bin/bash 
cd git-pre-release
ls
tar xvf source.tar.gz --strip 1
export
./mvnw clean package -Dmaven.test.skip=true

mv manifest-qa.yml ../build/
mv target/*.jar ../build/
