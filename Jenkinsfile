pipeline {
  agent any

  stages {
    stage('Build Project') {
      steps {
        bat 'mvn -B -DskipTests clean package'
      }
    }
    stage('Build Docker Image') {
      steps {
        script {
          def imageTag = "${env.BUILD_ID}-${env.BRANCH_NAME}"
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
