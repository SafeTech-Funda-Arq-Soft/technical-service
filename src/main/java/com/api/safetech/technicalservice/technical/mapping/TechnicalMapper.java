package com.api.safetech.technicalservice.technical.mapping;

import com.api.safetech.technicalservice.shared.mapping.EnhancedModelMapper;
import com.api.safetech.technicalservice.technical.domain.model.entity.Technical;
import com.api.safetech.technicalservice.technical.resource.CreateTechnicalResource;
import com.api.safetech.technicalservice.technical.resource.TechnicalResource;
import com.api.safetech.technicalservice.technical.resource.UpdateTechnicalResource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TechnicalMapper {

    @Autowired
    private EnhancedModelMapper mapper;

    // Object Mapping
    public TechnicalResource toResource(Technical model)
    {
        return mapper.map(model, TechnicalResource.class);
    }

    public List<TechnicalResource> toResource(List<Technical> model)
    {
        return mapper.mapList(model, TechnicalResource.class);
    }

    public Technical toModel(CreateTechnicalResource resource)
    {
        return mapper.map(resource, Technical.class);
    }

    public Technical toModel(UpdateTechnicalResource resource)
    {
        return mapper.map(resource, Technical.class);
    }
}
