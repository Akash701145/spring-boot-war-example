pipeline{
    agent any
     tools {
        maven 'Maven' 
    }
    stages{
        stage("Test"){
            steps{
                // mvn test
                sh 'mvn test'
               
            }
        } 
         stage("Build"){
            steps{
                sh 'mvn package'
               
            }
        }
         stage("Deploy on Test"){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcatserverdetails1', path: '', url: 'http://172.31.45.56:8080')], contextPath:'/app',war:'**/*.war'
               
            }
        }
         stage("Deploy on Prod"){
            steps{
                deploy adapters: [tomcat9(credentialsId: 'tomcatserverdetails1', path: '', url: 'http://172.31.36.158:8080')], contextPath:'/app',war:'**/*.war'
               
            }
        }
    }                   
     
    post{
        always{
            echo "========always========"
        }
        success{
            echo "========pipeline executed successfully ========"
        }
        failure{
            echo "========pipeline execution failed========"
        }
    }
}
