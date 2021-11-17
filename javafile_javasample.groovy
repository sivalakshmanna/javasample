//Declarative pipeline
pipeline{
    agent any
    stages{
        stage("clone code"){
            steps{
                println "Here I'm cloning the code to jenkins machine"
            }
        }
        stage("build code"){
            steps{
                println "Here I,m building the code using --mvn clean package"
            }
        }
        stage("uploading artifacts"){
            steps{
                println "Here I,m uploading artifacts to -S3 bucket"
            }
        }
        stage("deployement"){
            steps{
                println "Here I,m deploying the code to tomcat servers"
            }
        }
    }
}