package com.api.safetech.technicalservice.appliance.domain.model.entity;

import com.api.safetech.technicalservice.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@With
@Entity
@Table(name="appliance")
public class Appliance extends AuditModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    private  Float cost;

    @OneToMany(mappedBy = "appliance")
    private List<ApplianceTechnical> applianceTechnicals;

}
