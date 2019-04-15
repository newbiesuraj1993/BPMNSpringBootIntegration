# BPMNSpringBootIntegration
Integrate Spring Boot with Activiti Version 5 and Version 7 and Camunda Version 7.10

# API End Points for Testing :

============================Camunda 7.10===============================================

localhost:8080/rest/process-definition/key/simpledemo/start

localhost:8080/rest/task?processDefinitionKey=approvalprocess

localhost:8080/rest/task

localhost:8080/rest/task/1f3a2f6d-5d04-11e9-9c47-484520ed7394/complete -> along with list of variables that needs to be set

{"variables":{
		"approval":{"value":"true"}
	}
}



===============================Activiti Version 5==================================

curl -u admin:admin -H "Content-Type: application/json" 
-d '{"name":"Nair Suraj", "email": "nsgarafaite@gmail.com", "phoneNumber":"123456789"}' http://localhost:8080/start-hire-process

curl -u admin:admin -H "Content-Type: application/json" http://localhost:8080/runtime/tasks

curl -u admin:admin -H "Content-Type: application/json" 
-d '{"action" : "complete", "variables": [ {"name":"telephoneInterviewOutcome", "value":true} ]}' http://localhost:8080/runtime/tasks/{taskId}

curl -u admin:admin -H "Content-Type: application/json" 
-d '{"action" : "complete", "variables": [ {"name":"techOk", "value":true} ]}' http://localhost:8080/runtime/tasks/{taskId}



================================Activiti 7===============================================

http://localhost:8080/process-definitions

http://localhost:8080/start-process?processDefinitionKey=sampleproc-e9b76ff9-6f70-42c9-8dee-f6116c533a6d

http://localhost:8080/my-tasks

http://localhost:8080/complete-task?taskId=

