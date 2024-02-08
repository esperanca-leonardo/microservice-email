pipeline {
  agent any

  stages {
    stage('Build Maven') {
      steps {
        mvn 'clean package'
      }
    }
    stage('Build Docker Image') {
      steps {
        script {
          dockerImage = docker.build("esperanca-leonardo/microservice-email")
        }
      }
    }
  }
}
