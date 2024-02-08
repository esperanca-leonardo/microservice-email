FROM openjdk:17-jdk-alpine
COPY target/email-0.0.1-SNAPSHOT.jar /email-0.0.1-SNAPSHOT.jar
WORKDIR /
CMD ["java", "-jar", "email-0.0.1-SNAPSHOT.jar"]
