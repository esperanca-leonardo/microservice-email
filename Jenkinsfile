pipeline {
  agent any

  stages {
    stage('Build Project') {
      steps {
        buildProject()
      }
    }
    stage('Build Docker Image') {
      steps {
        buildDockerImage()
      }
    }
    stage('Push Image') {
      steps {
        pushImage()
      }
    }
  }
}


def buildProject() {
  script {
    bat 'mvn -B -DskipTests clean package'
  }
}

def buildDockerImage() {
  script {
    def branchName = getBranchName()
    def imageTag = "${env.BUILD_ID}-${branchName}"
    dockerImage = docker.build("esperanca98/microservice-email:${imageTag}")
    env.IMAGE_TAG = imageTag
  }
}

def pushImage() {
  script {
    docker.withRegistry('', 'dockerhub') {
      dockerImage.push(env.IMAGE_TAG)
    }
  }
}

def getBranchName() {
  return env.GIT_BRANCH.substring(env.GIT_BRANCH.lastIndexOf('/') + 1)
}