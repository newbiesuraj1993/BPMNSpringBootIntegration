package com.infy.camunda.logic;

import java.util.logging.Logger;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class LoggingDelegate implements JavaDelegate {

	private final Logger LOGGER=Logger.getLogger(LoggingDelegate.class.getName());
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		LOGGER.info(execution.getProcessDefinitionId()+" "+execution.getCurrentActivityName()+" "+execution.getVariable("approval"));
		
	}

}
