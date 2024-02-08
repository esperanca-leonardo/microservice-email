pipeline {
  agent any

  stages {
    stage('Build') {
      steps {
        bat 'mvn -B -DskipTests clean package'
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
