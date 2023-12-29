package com.utglobal.ufinswarmapi.domain.swarm.Services.Dto.ServicesDtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SpecDto {
    private String Name;
    private LabelsDto Labels;
    private TaskTemplateDto TaskTemplate;
}
