package com.person.service;

import com.person.controller.Case;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "case-service")
public interface CaseServiceFeignClient {

    @GetMapping("/api/register/case")
    Case createCase(Case caseObj);


}
