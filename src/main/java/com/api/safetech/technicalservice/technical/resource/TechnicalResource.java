package com.api.safetech.technicalservice.technical.resource;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TechnicalResource {

    private Long id;
    private String firstName;
    private String lastName;
    private String dni;
    private String email;
    private String password;
    private String address;
    private String phone;
    private String birthday;
    private String aboutMe;
}
