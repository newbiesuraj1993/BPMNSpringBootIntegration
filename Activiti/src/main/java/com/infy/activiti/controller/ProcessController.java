package com.infy.activiti.controller;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.infy.activiti.entity.Applicant;
import com.infy.activiti.repository.ApplicantRepositiory;

@RestController
public class ProcessController {
	@Autowired
	private RuntimeService runtimeService;
	
    @Autowired
    private ApplicantRepositiory applicantRepository;
	 
	@GetMapping("/start-process")
	public String startProcess() {
	   
	    runtimeService.startProcessInstanceByKey("hireProcess");
	    return "Process started. Number of currently running"
	      + "process instances = "
	      + runtimeService.createProcessInstanceQuery().count();
 
	}



    @RequestMapping(value="/start-hire-process", method= RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void startHireProcess(@RequestBody Map<String, String> data) {

        Applicant applicant = new Applicant(data.get("name"), data.get("email"), data.get("phoneNumber"));
        applicantRepository.save(applicant);

        Map<String, Object> variables = new HashMap<String, Object>();
        variables.put("applicant", applicant);
        runtimeService.startProcessInstanceByKey("hireProcessWithJpa", variables);
    } 
}
