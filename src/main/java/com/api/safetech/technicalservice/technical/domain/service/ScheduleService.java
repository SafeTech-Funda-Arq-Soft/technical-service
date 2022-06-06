package com.api.safetech.technicalservice.technical.domain.service;

import com.api.safetech.technicalservice.technical.domain.model.entity.Schedule;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ScheduleService {
    List<Schedule> getAll();
    Schedule create(Schedule schedule);
    ResponseEntity<?> delete(Long scheduleId);
    Schedule getById(Long scheduleId);


}
