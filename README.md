# 📧 Microservice Email
Microservice Email is a service developed in Java with Spring Boot, designed to simplify email sending through Gmail. This microservice provides an efficient and scalable solution for integrating email sending functionalities into your applications, utilizing the reliable infrastructure of Gmail as the SMTP server.

## 📑 Table of Contents
- [Prerequisites](#-prerequisites)
- [Installation Instructions](#-installation-instructions)
  - [Clone the Repository](#1-clone-the-repository)
  - [Navigate to the Project Directory](#2-navigate-to-the-project-directory)
  - [Setting up Gmail authentication](#3-setting-up-gmail-authentication)
  - [Configuring Environment Variables](#4-configuring-environment-variables)

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
Before launching the application, make sure to set up the following environment variables in your system. Default values are provided for convenience.
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

#### 4.1 Windows
- #### Automatic Setup
  To automate the setup on Windows, use the script below. It will set all the required environment variables
  
  ```bash
  @echo off
  setx SERVER_PORT 8080
  
  setx MAIL_HOST smtp.gmail.com
  setx MAIL_PORT 587
  setx MAIL_USERNAME your_email@gmail.com
  setx MAIL_PASSWORD your_app_password
  
  setx DATABASE_HOST localhost
  setx DATABASE_PORT 5432
  setx DATABASE_NAME microservice_email
  setx DATABASE_USER user
  setx DATABASE_USER_PASSWORD 123
  ```

- #### Running the Script
  1. Create a text file and copy the script above.
  2. Save the file with a `.bat` extension, like `set_environment_variables.bat`.
  3. Run the file by double-clicking on it or running it through the Windows terminal.

This script will automatically set the required environment variables for the application. You only need to run the script once, and the variables will be permanently set on your system.

## Note
Make sure to replace the default values `youremail@gmail.com`, `your_app_password` with the correct values for your environment before running the script.

























### 3. Run the Application
Depending on your operating system, follow the commands below to start the application.

- #### For Windows
  
  ```bash
  .\mvnw.cmd spring-boot:run
  ```

- #### For Linux and macOS
  First, give execute permission to the script

  ```bash
  chmod u+x mvnw
  ```

  Then, run the command to start the application

  ```bash
  ./mvnw spring-boot:run
  ```
