package com.infy.camunda.logic;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CustomLogic implements JavaDelegate {


	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		String approval=(String) execution.getVariable("approval");
		execution.setVariable("approval",approval);
	}
	
	
}
