#!/bin/sh
while ! nc -z config-service 8888 ; do
    echo "Waiting for config-service"
    sleep 2
done
while ! nc -z eureka-service 8761 ; do
    echo "Waiting for eureka-service"
    sleep 2
done
java -Dspring.profiles.active=container -Djava.security.egd=file:/dev/./urandom -jar /opt/spring-cloud/app.jar