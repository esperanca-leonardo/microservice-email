pipeline {
  agent any

  environment {
    imageTag = ""
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
          if (env.BRANCH_NAME == 'main') {
            imageTag = "production"
          }
          else {
            imageTag = "develop"
          }
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
