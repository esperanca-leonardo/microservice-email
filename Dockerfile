FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY target/email-0.0.1-SNAPSHOT.jar /app/email-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD ["java", "-jar", "email-0.0.1-SNAPSHOT.jar"]