#!/usr/bin/env bash

pushd frontend/AiBlog
hugo
popd

pushd backend/backend-rest
mvn clean package install
popd

pushd k8s
./deploy.sh
popd

pushd frontend/AiBlog
./deploy.sh
popd