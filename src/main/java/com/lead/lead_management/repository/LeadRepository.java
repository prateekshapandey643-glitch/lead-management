package com.lead.lead_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lead.lead_management.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}