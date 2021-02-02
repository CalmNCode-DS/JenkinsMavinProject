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
	
	stage("Consolidate Results"){
		steps{
		 input("Do you want to capture results?")
		 junit '**/target/surefire-reports/TEST-*.xml'
		 archive '/target/*.jar'
		}
	}
	
	stage("Email build status"){
		steps{
		 mail body: '$(env.JOB_NAME) - Build#$(env.BUILD_NUMBER) - $(currentBuild.CurrentResult)\n\nCheck console output at $(env.BUILD_URL)', subject: 'Build status', to: 'dds.dhiraj21@gmail.com'
		}
	}
 
 }
}
