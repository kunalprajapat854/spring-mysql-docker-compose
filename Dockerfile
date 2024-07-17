FROM eclipse-temurin:17-jdk-alpine

MAINTAINER Kunal <kunalprajapat221@gmail.com>

WORKDIR /app

COPY target/*  app/Spring-boot-mysql-docker-compose-0.0.1-SNAPSHOT.jar.jar

EXPOSE 9090

ENTRYPOINT [ "java","-jar","Spring-boot-mysql-docker-compose-0.0.1-SNAPSHOT.jar" ]