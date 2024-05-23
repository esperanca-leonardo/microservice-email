FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/microservice-email-0.0.1-SNAPSHOT.jar /app/microservice-email-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "microservice-email-0.0.1-SNAPSHOT.jar"]