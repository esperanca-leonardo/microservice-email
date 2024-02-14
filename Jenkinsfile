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
          dockerImage = docker.build("esperanca98/microservice-email:${env.BUILD_ID}")
        }
      }
    }
    stage('Push Image') {
      steps {
        script {
          docker.withRegistry('', 'dockerhub') {
            if (env.BRANCH_NAME == 'main') {
              dockerImage.push('production')
              dockerImage.push("${env.BUILD_ID_PRODUCTION}")
            }
            else {
              dockerImage.push('develop')
              dockerImage.push("${env.BUILD_ID_DEVELOP}")
            }
          }
        }
      }
    }
  }
}
