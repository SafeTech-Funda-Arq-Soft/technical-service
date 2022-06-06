package com.api.safetech.technicalservice.appliance.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("applianceMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public ApplianceMapper applianceMapper(){
        return new ApplianceMapper();
    }
}
