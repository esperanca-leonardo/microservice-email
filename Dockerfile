FROM openjdk:17-jdk-alpine
COPY target/email-0.0.1-SNAPSHOT.jar /app/email-0.0.1-SNAPSHOT.jar
WORKDIR /app
CMD ["java", "-jar", "email-0.0.1-SNAPSHOT.jar"]
