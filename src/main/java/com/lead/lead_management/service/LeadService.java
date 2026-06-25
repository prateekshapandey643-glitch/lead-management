package com.lead.lead_management.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lead.lead_management.dto.LeadRequest;
import com.lead.lead_management.entity.Lead;
import com.lead.lead_management.repository.LeadRepository;

@Service
public class LeadService {

    @Autowired
    private LeadRepository repository;

    public Lead saveLead(LeadRequest request) {

        Lead lead = new Lead();

        lead.setName(request.getName());
        lead.setEmail(request.getEmail());
        lead.setPhone(request.getPhone());
        lead.setCompany(request.getCompany());
        lead.setRequirement(request.getRequirement());

        lead.setSubmittedAt(LocalDateTime.now());

        return repository.save(lead);
    }
}