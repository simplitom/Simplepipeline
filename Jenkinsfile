pipeline {
agent {
   dockerContainer {
   image 'maven:3.9.6-eclipse-temurin-17-alpine'
  }
}
stages {
stage('Build') {
steps {
sh 'mvn -B -DskipTests clean package'
}
}
}
}