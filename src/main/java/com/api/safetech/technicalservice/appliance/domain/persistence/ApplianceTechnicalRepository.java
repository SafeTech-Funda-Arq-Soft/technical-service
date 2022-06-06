package com.api.safetech.technicalservice.appliance.domain.persistence;

import com.api.safetech.technicalservice.appliance.domain.model.entity.ApplianceTechnical;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplianceTechnicalRepository extends JpaRepository<ApplianceTechnical, Long> {}
