# syntax=docker/dockerfile:1
FROM openjdk:11.0.4-jre-slim-buster
RUN mkdir /app
WORKDIR /app
COPY /build/libs/simulateconnectionpooldeadlock-1.0.0-SNAPSHOT.jar /app
COPY debug-network.sh /app
COPY dump-threads.sh /app
COPY nid-translator.pl /app
RUN apt-get update && apt-get install -y procps
RUN apt-get install strace -y