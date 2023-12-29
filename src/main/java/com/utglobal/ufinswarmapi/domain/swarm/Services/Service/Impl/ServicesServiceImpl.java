package com.utglobal.ufinswarmapi.domain.swarm.Services.Service.Impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class ServicesServiceImpl {
    private final RestTemplate restTemplate;

}
