package com.cases.controller;


import com.cases.model.Case;
import com.cases.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/register")
public class CaseController {

    @Autowired
    private CaseService service;

    @PostMapping("/case")
    public Case createCase(@RequestBody Case caseObj) {
        return service.createCase(caseObj);
    }

}
