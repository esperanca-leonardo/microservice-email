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
          dockerImage = docker.build("esperanca-leonardo/microservice-email:${env.BUILD_ID}")
        }
      }
    }
    stage('Push Image') {
      steps {
        script {
          docker.withRegistry('https://registry.hub.docker.com', 'dockerhub') {
            dockerImage.push('latest')
            dockerImage.push('${env.BUILD_ID}')
          }
        }
      }
    }
  }
}
