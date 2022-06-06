package com.api.safetech.technicalservice.technical.mapping;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("technicalMappingConfiguration")
public class MappingConfiguration {

    @Bean
    public TechnicalMapper technicalMapper() {
        return new TechnicalMapper();
    }

    @Bean
    public ScheduleMapper scheduleMapper()
    {
        return new ScheduleMapper();
    }

//    @Bean
//    public ApplianceMapper applianceMapper()
//    {
//        return new ApplianceMapper();
//    }
}
