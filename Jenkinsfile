pipeline {
    environment {
        registry = "gustavoapolinario/docker-test"
        registryCredential = ‘dockerhub’
        }
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                git 'https://gitlab.com/groupproject2023/udacity_project4.git'
            }
        }
        stage('Build') {
            steps {
                dir('starter_code') { // Chuyển vào thư mục starter_code
                   sh 'chmod +x mvnw'
                   sh './mvnw clean package'
                }
            }
        }
        stage('Docker Build and Push') {
            steps {
                withDockerRegistry(credentialsId: 'docker-hub', url: 'https://index.docker.io/v1/') {
                    sh 'docker build -t chinhvv/security-and-devops:v1 .'
                    sh 'docker push chinhvv/security-and-devops:v1'
                }
            }
        }
        stage('Deploy') {
            steps {
                sh '''
                docker stop spring_app || true
                docker rm spring_app || true
                docker run -d --name spring_app -p 8080:8080 chinhvv/security-and-devops:v1
                '''
            }
        }
        stage('Remove Unused docker image') {
          steps{
            sh "docker rmi $registry:latest
          }
        }
    }
}
