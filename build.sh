#!/bin/sh

apt-get install -y default-jre default-jdk wget unzip
BUILD_DIR=$(pwd)
mkdir /sdk
cd /sdk
wget https://dl.google.com/android/repository/tools_r25.2.3-linux.zip
unzip tools_r25.2.3-linux.zip
./tools/bin/sdkmanager "platform-tools"
./tools/bin/sdkmanager "build-tools;25.0.2"

export LC_CTYPE=C.UTF-8
export ANDROID_HOME=/sdk/

./gradlew
./gradlew assemble


echo "Success?"
