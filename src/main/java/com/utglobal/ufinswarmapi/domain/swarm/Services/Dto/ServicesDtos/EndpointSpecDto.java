package com.utglobal.ufinswarmapi.domain.swarm.Services.Dto.ServicesDtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class EndpointSpecDto {
    private String Mode;
    private List<PortDto> Ports;
}