# 📧 Microservice Email
Microservice Email is a service developed in Java with Spring Boot, designed to simplify email sending through Gmail. This microservice provides an efficient and scalable solution for integrating email sending functionalities into your applications, utilizing the reliable infrastructure of Gmail as the SMTP server.

## 📑 Table of Contents
- [Prerequisites](#-prerequisites)
- [Installation Instructions](#-installation-instructions)
  - [Clone the Repository](#1-clone-the-repository)
  - [Navigate to the Project Directory](#2-navigate-to-the-project-directory)
  - [Setting up Gmail authentication](#3-setting-up-gmail-authentication)
  - [Configuring Environment Variables](#4-configuring-environment-variables)
  - [Automatic Setup](#5-automatic-setup)
    - [Windows](#51-windows)

## 📋 Prerequisites
Before running the application, ensure you have the following prerequisites installed:
- [**Git:**](https://git-scm.com/) Widely-used distributed version control system.
- [**Java 17:**](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) A stable version of the Java Development Kit (JDK).
- [**Docker:**](https://www.docker.com/) A platform for developing, shipping, and running applications in containers.

## 📝 Installation Instructions
### 1. Clone the Repository
```bash
git clone https://github.com/esperanca-leonardo/microservice-email.git
```

### 2. Navigate to the Project Directory
```bash
cd microservice-email
```

### 3. Setting up Gmail authentication
This project uses Gmail for sending emails. You will need to generate an app password for your Gmail account. Follow the instructions [here](https://support.google.com/accounts/answer/185833?hl=en) to generate an app password.

### 4. Configuring Environment Variables
Before utilizing this project, it's crucial to configure certain environment variables on your system. To simplify this process, default values are provided as follows:
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

### 5. Initializing the Database with Docker
This project is facilitated by a docker-compose.yml file, encapsulating all the essential configurations to bootstrap the database infrastructure. Copy and paste the command below into the terminal to start the database
 ```bash
 docker-compose up -d
 ```

### 6. Run the Application
Depending on your operating system, execute the commands below to start the application.

- #### Windows
  Utilize the Maven Wrapper to run the application on Windows.
  ```bash
  .\mvnw.cmd spring-boot:run
  ```

- #### Linux
  Grant executable permissions to the Maven Wrapper and initiate the application on Linux.
  ```bash
  chmod u+x mvnw && ./mvnw spring-boot:run
  ```



