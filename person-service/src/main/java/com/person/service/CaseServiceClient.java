package com.person.service;

import com.person.controller.Case;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


/**
 * Case Service Client
 */
@Service
@Slf4j
public class CaseServiceClient {

    private final RestTemplate restTemplate;
    private final CaseServiceFeignClient caseServiceFeignClient;

    //this can moved to spring cloud config
    private static final String CASE_SERVICE = "http://case-service/api/";

    @Autowired
    public CaseServiceClient(RestTemplate restTemplate, CaseServiceFeignClient caseServiceFeignClient) {
        this.restTemplate = restTemplate;
        this.caseServiceFeignClient = caseServiceFeignClient;
    }

    public Case createCase(Case caseObj) {
        return this.caseServiceFeignClient.createCase(caseObj);
    }
}
