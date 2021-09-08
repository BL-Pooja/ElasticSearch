package com.leadplatform.service;

import org.springframework.stereotype.Service;

@Service
public class LeadServiceImpl implements ILeadService{

    @Override
    public String getWelcomeMessage() {
        return "Welcome To Ejet Lead App Service";
    }

}
