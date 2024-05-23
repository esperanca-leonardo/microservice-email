# Microservice Email
Microservice Email is a service developed in Java with Spring Boot, designed to simplify email sending through Gmail. This microservice provides an efficient and scalable solution for integrating email sending functionalities into your applications, utilizing the reliable infrastructure of Gmail as the SMTP server.

## 📑 Table of Contents

## 📋 Prerequisites
Before running the application, ensure you have the following prerequisites installed:
- [**Git:**](https://git-scm.com/) Widely-used distributed version control system.
- [**Java 17:**](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) A stable version of the Java Development Kit (JDK).
- [**Docker:**](https://www.docker.com/) A platform for developing, shipping, and running applications in containers.

## Setting up Gmail authentication
This project uses Gmail for sending emails. You will need to generate an app password for your Gmail account. Follow the instructions [here](https://support.google.com/accounts/answer/185833?hl=en) to generate an app password.

## Initial setup
Before launching the application, ensure you set up the following environment variables in your environment. Some default values are provided for convenience.
```bash
SERVER_PORT=8080

MAIL_HOST=smtp.gmail.com
MAIL_PORT=587
MAIL_USERNAME=youremail@gmail.com
MAIL_PASSWORD=your_app_password

DATABASE_HOST=localhost
DATABASE_PORT=5432
DATABASE_NAME=microservice_email
DATABASE_USER=user
DATABASE_USER_PASSWORD=123
```
