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
               deploy adapters: [tomcat9(credentialsId: 'tomcat9details', url: 'http://54.160.130.24:8080')], contextPath: '/app', war: '**/*.war'
                echo "deploy on test"
            }
        } 
        stage("Approval to Deploy on Prod") {
            steps {
               script {
                   input message: "Should we continue?", ok: "Yes, we should"  

                }
            }
        }  

 
        stage("Deploy on Prod"){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcat92details', path: '', url: 'http://13.220.54.101:8080')], contextPath: '/app', war: '**/*.war'
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
    
   