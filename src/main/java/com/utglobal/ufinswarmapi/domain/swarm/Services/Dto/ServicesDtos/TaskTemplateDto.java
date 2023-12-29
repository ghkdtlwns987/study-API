package com.utglobal.ufinswarmapi.domain.swarm.Services.Dto.ServicesDtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskTemplateDto {
    private ContainerSpecDto ContainerSpec;
    private ResourcesDto Resources;
    private PlacementDto Placement;
    // other fields
}