pipeline {
  agent any

  stages {
    stage ('Build Docker Image') {
      steps {
        script {
          dockerApp = docker.build("esperanca-leonardo/microservice-email")
        }
      }
    }
  }
}