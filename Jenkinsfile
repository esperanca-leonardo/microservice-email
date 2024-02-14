pipeline {
  agent any

  environment {
     imageTag = "${env.BUILD_ID}-${env.BRANCH_NAME}"
  }
  stages {
    stage('Build Project') {
      steps {
        bat 'mvn -B -DskipTests clean package'
      }
    }
    stage('Build Docker Image') {
      steps {
        script {
          dockerImage = docker.build("esperanca98/microservice-email:${imageTag}")
        }
      }
    }
    stage('Push Image') {
      steps {
        script {
          docker.withRegistry('', 'dockerhub') {
            dockerImage.push(imageTag)
          }
        }
      }
    }
  }
}
