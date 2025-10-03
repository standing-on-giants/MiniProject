pipeline {
    agent any
    
    stages {
        stage('Pull from GitHub') {
            steps {
                git branch: 'main', url: 'git@github.com:standing-on-giants/MiniProject.git'
            }
        }
        
        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }
        
        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

	stage('Build Docker Image') {
            steps {
                sh 'docker build -t shashank273/scientific-calculator:latest .'
            }
        }
        
        stage('Login to Docker Hub') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-credentials', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                }
            }
        }
        
        stage('Push to Docker Hub') {
            steps {
                sh 'docker push shashank273/scientific-calculator:latest'
            }
        }

    }    
       
    
    post {
        success {
            echo 'Pipeline executed successfully!'
            // Add email notification here if needed
        }
        failure {
            echo 'Pipeline execution failed!'
            // Add email notification here if needed
        }
    }
    
}
