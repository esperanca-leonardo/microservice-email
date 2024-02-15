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
          def branchName = env.GIT_BRANCH.substring(env.GIT_BRANCH.lastIndexOf('/') + 1)
          def imageTag = "${env.BUILD_ID}-${branchName}"
          dockerImage = docker.build("esperanca98/microservice-email:${imageTag}")
          env.IMAGE_TAG = imageTag
        }
      }
    }
    stage('Push Image') {
      steps {
        script {
          docker.withRegistry('', 'dockerhub') {
            dockerImage.push(env.IMAGE_TAG)
          }
        }
      }
    }
  }
}
