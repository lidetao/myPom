pipeline {
  agent any
  stages {
    stage('stage0') {
      parallel {
        stage('stage0') {
          steps {
            sleep 10
          }
        }

        stage('job0') {
          steps {
            sleep 100
          }
        }

      }
    }

    stage('stage1') {
      steps {
        sleep 20
      }
    }

    stage('stage2') {
      steps {
        sleep 20
      }
    }

  }
}