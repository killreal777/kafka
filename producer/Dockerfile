FROM openjdk:17-jdk-slim-buster
WORKDIR /app
COPY target/producer-0.0.1-SNAPSHOT.jar /app/producer.jar
ENTRYPOINT ["java", "-jar", "producer.jar"]
EXPOSE 8000