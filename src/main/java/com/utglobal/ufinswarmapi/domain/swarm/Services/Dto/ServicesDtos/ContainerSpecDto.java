package com.utglobal.ufinswarmapi.domain.swarm.Services.Dto.ServicesDtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ContainerSpecDto {
    private ImageDto ContainerSpec;
    private boolean Init;
    private List<MountDto> Mounts;
    // other fields
}