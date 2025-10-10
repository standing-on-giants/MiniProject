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

	stage('Deploy with Ansible') {
    	    steps {
               // ansiblePlaybook(
            	 //   playbook: 'deploy-playbook.yml',
                   // inventory: 'localhost,',
            	   // credentialsId: 'ansible-ssh-key', // if needed
            	   // extraVars: [
                //	docker_image: "your-dockerhub-username/scientific-calculator:latest"
            	 //   ]
        	//)
		//
		sh 'ansible-playbook -i inventory.ini deploy-playbook.yml'
    	    }
	}

    }    
       
    
    post {
	always {(cleanWs())}

        success {
            echo 'Pipeline executed successfully!'
            // Email notification
		emailext(
			to: "shashankdevarmani@gmail.com",
			subject: "Hi, this works!",
			body: "Build finished successfully, bro"
		)
        }
        failure {
            echo 'Pipeline execution failed!'
            // Email notification
		emailext(
                        to: "shashankdevarmani@gmail.com",
                        subject: "Hi, some error you got!",
                        body: "Build failed, bro. Comeon, debug me"
                )
        }
    }
    
}
