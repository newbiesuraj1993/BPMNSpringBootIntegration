package com.infy.activitinew.connector;

import org.activiti.api.process.model.IntegrationContext;
import org.activiti.api.process.runtime.connector.Connector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service(value = "serviceTask1Impl")
public class CustomServiceTaskConnector implements Connector {
 private Logger logger = LoggerFactory.getLogger(CustomServiceTaskConnector.class);

 public IntegrationContext execute(IntegrationContext integrationContext) {
 logger.info("Some service task logic... [processInstanceId=" + integrationContext.getProcessInstanceId() + "]");

 return integrationContext;
 }
}
