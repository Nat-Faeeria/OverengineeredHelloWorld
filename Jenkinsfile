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
        junit 'surefire-report/*.xml'
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
        stash(name: 'binary', includes: 'target/*.jar')
      }
    }
    stage('Run') {
      steps {
        unstash 'binary'
        sh 'java -jar overengineeredhelloworld-1.0-snapshot.jar'
      }
    }
  }
}