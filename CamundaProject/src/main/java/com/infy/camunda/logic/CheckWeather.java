package com.infy.camunda.logic;

import java.util.Random;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class CheckWeather implements JavaDelegate {

	Random rand=new Random();
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		execution.setVariable("name", "suraj");
		execution.setVariable("weather", rand.nextBoolean());

	}

}
