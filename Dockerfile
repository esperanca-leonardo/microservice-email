FROM openjdk:17-jdk-alpine
WORKDIR /
COPY target/email-0.0.1-SNAPSHOT.jar /email-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "email-0.0.1-SNAPSHOT.jar"]
