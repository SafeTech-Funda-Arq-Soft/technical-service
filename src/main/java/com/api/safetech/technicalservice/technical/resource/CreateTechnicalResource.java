package com.api.safetech.technicalservice.technical.resource;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateTechnicalResource {

    @NotNull
    @NotBlank
    @Size(max = 40)
    private String firstName;

    @NotNull
    @NotBlank
    @Size(max = 40)
    private String lastName;

    @NotNull
    @NotBlank
    @Size(max = 8)
    private String dni;

    @NotNull
    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    @NotNull
    @NotBlank
    @Size(min=8, max = 20)
    private String password;

    @NotNull
    @NotBlank
    @Size(max = 40)
    private String address;

    @NotNull
    @NotBlank
    @Size(max = 9)
    private String phone;

    @NotNull
    @NotBlank
    @Size(max = 10)
    private String birthday;

    @NotNull
    @NotBlank
    @Size(max = 200)
    private String aboutMe;
}
