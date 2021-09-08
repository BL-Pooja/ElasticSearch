package com.leadplatform.controller;

import com.leadplatform.service.ILeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lead")
public class LeadController {

    @Autowired
    private ILeadService iLeadService;

    @GetMapping("/welcome")
    public String getWelcome(){
       return iLeadService.getWelcomeMessage();
    }
}
