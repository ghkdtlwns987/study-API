package com.utglobal.ufinswarmapi.domain.swarm.Services.Dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.utglobal.ufinswarmapi.domain.swarm.Services.Dto.ServicesDtos.*;
import lombok.*;


/**
 * Docker Swarm으로부터 데이터를 받아오는 Dto 클래스입니다.
 * @author 황시준
 * @since  1.0
 */
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ServicesDto {
    private String ID;
    private VersionDto Version;
    private String CreatedAt;
    private String UpdatedAt;
    private SpecDto Spec;
    private ModeDto Mode;
    private EndpointSpecDto EndpointSpec;
    private EndpointDto Endpoint;
}
