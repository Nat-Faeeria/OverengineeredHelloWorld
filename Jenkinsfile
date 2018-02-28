pipeline {
  agent any
  stages {
    stage('Test') {
      agent {
        docker {
          image 'maven'
        }
        
      }
      steps {
        sh 'mvn test'
        junit 'target/surefire-reports/*.xml'
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
        stash(name: 'binary', includes: 'target/*.jar')
      }
    }
    stage('Run') {
      agent {
        docker {
          image 'java:8-jdk_alpine'
        }
        
      }
      steps {
        unstash 'binary'
        sh 'java -jar target/overengineeredhelloworld-1.0-SNAPSHOT.jar'
        archiveArtifacts(artifacts: 'target/*.jar', onlyIfSuccessful: true)
      }
    }
  }
}