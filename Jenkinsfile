pipeline{
    agent any
    tools {
        maven 'Maven' 
    }
    stages{
        stage("Test"){
            steps{
                sh 'mvn test'
                echo "testing stage hai"
            }
        }
        stage("Build"){
            steps{
                // mvn test
                sh 'mvn install'
                echo "build hoga is stage mai"
            }
        }
        stage("Deploy on Test"){
            steps{
                // mvn package
               deploy adapters: [tomcat9(credentialsId: 'tomcat9details', path: '', url: 'http://3.109.49.229:8080')], contextPath: '/app', war: '**/*.war'
                echo "deploy on test"
            }
        } 
        stage("Deployon Prod"){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcat9details', path: '', url: 'http://43.205.198.121:8080')], contextPath: '/app', war: '**/*.war'
                echo "production par daal dinge "
            }
        }                           
    }
    post{
         always{
                    echo "========always========"
                }
        success{
                    echo "========A executed successfully========"
                }
        failure{
                    echo "========A execution failed========"
                }
            }
        }
    
   
