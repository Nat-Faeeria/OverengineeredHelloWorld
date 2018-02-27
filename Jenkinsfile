pipeline {
  agent any
  stages {
    stage('Compile') {
      agent {
        docker {
          image 'maven'
        }
        
      }
      steps {
        sh 'mvn compile'
      }
    }
    stage('Test') {
      agent {
        docker {
          image 'maven'
        }
        
      }
      steps {
        sh 'mvn test'
      }
    }
    stage('Package') {
      agent {
        docker {
          image 'maven'
        }
        
      }
      steps {
        sh 'mvn package'
        archiveArtifacts(artifacts: 'target/*.jar', onlyIfSuccessful: true)
      }
    }
  }
}