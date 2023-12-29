package com.utglobal.ufinswarmapi.domain.swarm.Services.Dto.ServicesDtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class EndpointDto {
    private SpecDto Spec;
    private List<PortDto> Ports;
    private List<VirtualIPDto> VirtualIPs;
}