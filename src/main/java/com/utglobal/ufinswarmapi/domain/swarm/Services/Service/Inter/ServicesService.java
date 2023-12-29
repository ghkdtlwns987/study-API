package com.utglobal.ufinswarmapi.domain.swarm.Services.Service.Inter;

import com.utglobal.ufinswarmapi.domain.swarm.Services.Dto.ServicesDto;

import java.util.List;

public interface ServicesService {
    List<ServicesDto> listServices();

    ServicesDto inspectServices(String Id);

    void deleteServices(String Id);
}
