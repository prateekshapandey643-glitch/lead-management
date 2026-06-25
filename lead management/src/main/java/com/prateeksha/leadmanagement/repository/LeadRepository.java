package com.prateeksha.leadmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prateeksha.leadmanagement.entity.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}