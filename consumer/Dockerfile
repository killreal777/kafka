FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/consumer-0.0.1-SNAPSHOT.jar /app/consumer.jar
ENTRYPOINT ["java", "-jar", "consumer.jar"]
EXPOSE 8080