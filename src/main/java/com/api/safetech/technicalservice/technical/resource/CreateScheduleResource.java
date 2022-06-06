package com.api.safetech.technicalservice.technical.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class CreateScheduleResource {

    @NotNull
    @NotBlank
    private String time;
}
