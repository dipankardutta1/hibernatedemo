FROM java:8
FROM maven:alpine

MAINTAINER Dipankar Dutta

WORKDIR /app

COPY . /app

RUN chmod +x ./start.sh
RUN chmod +x ./wait-for-it.sh

RUN mvn -v

RUN mvn clean install -DskipTests

EXPOSE 8080



ADD ./target/MyRestApi-0.0.1-SNAPSHOT.jar MyRestApi-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["./start.sh"]

#ENTRYPOINT ["java","-jar","MyRestApi-0.0.1-SNAPSHOT.jar"]

#From openjdk:8
#copy ./target/MyRestApi-0.0.1-SNAPSHOT.jar MyRestApi-0.0.1-SNAPSHOT.jar

#ENTRYPOINT ["java","-jar","MyRestApi-0.0.1-SNAPSHOT.jar"]