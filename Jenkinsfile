pipeline {
  agent any

  environment {
      BUILD_ID_DEVELOP = "${env.BUILD_ID}-develop"
      BUILD_ID_PRODUCTION = "${env.BUILD_ID}-production"
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
            dockerImage = docker.build("esperanca98/microservice-email:${env.BUILD_ID_PRODUCTION}")
          }
          else {
            dockerImage = docker.build("esperanca98/microservice-email:${env.BUILD_ID_DEVELOP}")
          }
        }
      }
    }
    stage('Push Image') {
      steps {
        script {
          docker.withRegistry('', 'dockerhub') {
            dockerImage.push()
          }
        }
      }
    }
  }
}
