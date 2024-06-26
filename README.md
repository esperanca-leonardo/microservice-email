# 📧 Microservice Email
Microservice Email is a service developed in Java with Spring Boot, designed to simplify email sending through Gmail. This microservice provides an efficient and scalable solution for integrating email sending functionalities into your applications, utilizing the reliable infrastructure of Gmail as the SMTP server.

## 📑 Table of Contents
- [Prerequisites](#-prerequisites)
- [Installation Instructions](#-installation-instructions)
  - [Clone the Repository](#1-clone-the-repository)
  - [Navigate to the Project Directory](#2-navigate-to-the-project-directory)
  - [Setting up Gmail authentication](#3-setting-up-gmail-authentication)
  - [Configuring Environment Variables](#4-configuring-environment-variables)
	  - [Important Note](#41-important-note)
  	- [Configuring Environment Variables Automatically](#42-configuring-environment-variables-automatically)
    	- [Windows](#421-windows)
     	- [Linux](#422-linux)
	- [Initializing the Database with Docker](#5-initializing-the-database-with-docker)
  - [Run the Application](#6-run-the-application)
  	- [Windows](#windows)
   	- [Linux](#linux)

## 📋 Prerequisites
Before running the application, ensure you have the following prerequisites installed.
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
Before utilizing this project, it's crucial to configure certain environment variables on your system. To simplify this process, default values are provided as follows.
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

- #### 4.1 Important Note 
	Before proceeding with the instructions below, please remember to change the values of the following environment variables according to your credentials: `MAIL_USERNAME`, `MAIL_PASSWORD`.

- #### 4.2 Configuring Environment Variables Automatically
	To make the setup process more easier, you can use a script to automatically configure these environment variables. Below are instructions and scripts for Windows and Linux systems.

	- ##### 4.2.1. Windows
		For Windows, you can use a batch script to set the environment variables. Create a file named `set_env_vars.bat` with the following content.
		```bash
		@echo off
		setx SERVER_PORT 8080
		
		setx MAIL_HOST smtp.gmail.com
		setx MAIL_PORT 587
		setx MAIL_USERNAME your_email@gmail.com
		setx MAIL_PASSWORD "your_app_password"
		
		setx DATABASE_HOST localhost
		setx DATABASE_PORT 5432
		setx DATABASE_NAME microservice_email
		setx DATABASE_USER user
		setx DATABASE_USER_PASSWORD 123
		```
  
		To run the script, double-click the `set_env_vars.bat` file or execute the below command in the terminal.
		```bash
	  .\set_env_vars.bat	
	  ```

	- ##### 4.2.2. Linux
		For Linux, you can use a shell script to set the environment variables. Create a file named `set_env_vars.sh` with the following content.

		```bash
		#!/bin/bash

		if [ -f ~/.bashrc ]; then
		  echo "export SERVER_PORT=8080" >> ~/.bashrc

		  echo "export MAIL_HOST=smtp.gmail.com" >> ~/.bashrc
		  echo "export MAIL_PORT=587" >> ~/.bashrc
		  echo "export MAIL_USERNAME=your_email@gmail.com" >> ~/.bashrc
		  echo "export MAIL_PASSWORD='your_app_password'" >> ~/.bashrc

		  echo "export DATABASE_HOST=localhost" >> ~/.bashrc
		  echo "export DATABASE_PORT=5432" >> ~/.bashrc
		  echo "export DATABASE_NAME=microservice_email" >> ~/.bashrc
		  echo "export DATABASE_USER=user" >> ~/.bashrc
		  echo "export DATABASE_USER_PASSWORD=123" >> ~/.bashrc
		else
		  echo "~/.bashrc file not found. Variables not defined."
		  exit 1
		fi
		```
  
		To execute the script, navigate to the directory containing `set_env_vars.sh` and run the following command.
	 	```bash
	 	chmod u+x set_env_vars.sh && ./set_env_vars.sh
	 	 ```

   		After running the script, remember to apply the changes by executing
		```bash
		source ~/.bashrc
		```

### 5. Initializing the Database with Docker
This project is facilitated by a docker-compose.yml file, encapsulating all the essential configurations to bootstrap the database infrastructure. Copy and paste the command below into the terminal to start the database.
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



