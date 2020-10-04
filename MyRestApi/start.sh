#! /bin/bash

./wait-for-it.sh mysql-docker:3306 -t 60

java -jar MyRestApi-0.0.1-SNAPSHOT.jar