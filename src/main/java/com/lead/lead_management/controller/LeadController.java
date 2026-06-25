package com.lead.lead_management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lead.lead_management.dto.LeadRequest;
import com.lead.lead_management.entity.Lead;
import com.lead.lead_management.service.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadController {

    @Autowired
    private LeadService service;

    // ✅ TEST endpoint (browser ke liye)
    @GetMapping
    public String test() {
        return "Lead Management API is working 🚀";
    }

    // ✅ CREATE lead (Postman / curl ke liye)
    @PostMapping
    public Lead createLead(@RequestBody LeadRequest request) {
        return service.saveLead(request);
    }
}