pipeline{
 agent any
 stages {
	stage("Clean Stage"){
		steps{
		 bat "mvn clean"
		}
	}
	
	stage("Testing Stage"){
		steps{
		 bat "mvn test"
		}
	}
	
	stage("Packaging Stage"){
		steps{
		 bat "mvn package"
		}
	}
 
 }
}