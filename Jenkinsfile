pipeline {
    agent any
    
    stages {
        stage('Pull from GitHub') {
            steps {
                git branch: 'main', url: 'https://github.com/your-username/ScientificCalculator.git'
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
