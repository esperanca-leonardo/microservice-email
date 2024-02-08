pipeline {
  agent any

  stages {
    stage('Build Maven') {
      steps {
        sh 'mvn -B -DskipTests clean package'
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
