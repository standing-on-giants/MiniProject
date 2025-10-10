
# Scientific Calculator using DevOps

A Java-based scientific calculator demonstrating DevOps practices with automated CI/CD pipeline using Jenkins, Docker, and Ansible.

[![Docker Image](https://img.shields.io/badge/docker-shashank273%2Fscientific--calculator-blue)](https://hub.docker.com/r/shashank273/scientific-calculator)

## Features

### Calculator Operations
- **Square Root (√x)** - Calculate square root of positive numbers
- **Factorial (x!)** - Compute factorial of positive integers
- **Natural Logarithm (ln(x))** - Calculate natural logarithm (base e)
- **Power (x^b)** - Raise x to the power of b

### DevOps Pipeline
- Automated testing with JUnit
- Continuous Integration with Jenkins
- Containerization with Docker
- Automated deployment with Ansible
- Email notifications for build status

## Quick Start

### Run with Docker
```bash
docker pull shashank273/scientific-calculator:latest
docker run -it shashank273/scientific-calculator:latest
java -jar app.jar
```

### Build Locally
```bash
git clone https://github.com/standing-on-giants/MiniProject.git
cd MiniProject
mvn clean package
java -jar target/ScientificCalculator-1.0-SNAPSHOT.jar
```

### Deploy with Ansible
```bash
ansible-playbook -i inventory.ini deploy-playbook.yml
docker exec -it scientific-calculator java -jar app.jar
```

## CI/CD Pipeline Stages

1. **Pull from GitHub** - Clone latest code
2. **Run Tests** - Execute JUnit tests
3. **Build with Maven** - Package JAR file
4. **Build Docker Image** - Containerize application
5. **Push to Docker Hub** - Upload image
6. **Deploy with Ansible** - Deploy container

## Project Structure
```
MiniProject/
├── src/main/java/          # Calculator application
├── src/test/java/          # JUnit tests
├── Dockerfile              # Container definition
├── Jenkinsfile            # CI/CD pipeline
├── deploy-playbook.yml    # Ansible deployment
├── inventory.ini          # Ansible inventory
└── pom.xml               # Maven configuration
```

## Technologies Used
- **Language:** Java 17
- **Build:** Maven
- **Testing:** JUnit 4
- **CI/CD:** Jenkins
- **Containerization:** Docker
- **Deployment:** Ansible
- **Version Control:** Git, GitHub

## Prerequisites
- Java 17+
- Maven 3.6+
- Docker 20.10+
- Ansible 2.9+
- Jenkins 2.3+ (for CI/CD)
