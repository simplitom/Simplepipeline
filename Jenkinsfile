pipeline {
    agent {
        any {
            image 'maven:3.9.6-eclipse-temurin-17-alpine'
            args '-v /root/.m2:/root/.m2'
        }
    }
        tools {
          maven 'MAVEN_HOME'
          jdk 'JAVA_HOME'
        }

    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
    }
}