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
        sh 'mvn clean build'
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
  }
}