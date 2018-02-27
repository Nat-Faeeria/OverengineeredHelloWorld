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
        junit(testResults: 'surefire-report/*.xml', allowEmptyResults: true)
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
        stash 'target/*.jar'
      }
    }
    stage('Run') {
      steps {
        unstash 'target/*.jar'
      }
    }
  }
}