package com.registration.caseregistration.controller;


import com.registration.caseregistration.model.Case;
import com.registration.caseregistration.repository.CasePersRepository;
import com.registration.caseregistration.repository.CaseRegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("rest/register")
public class CaseRegistrationController {


    @Autowired
    private CaseRegistrationRepository repository;

    @Autowired
    private CasePersRepository casePersRepository;


    @PostMapping("/case")
    public Case createCase(@RequestBody Case caseObj) {

        caseObj.setCaseNumber(this.createAndGetCaseNumber());

        Case cobj = repository.save(caseObj);

        caseObj.getCasePers()
                .stream()
                .forEach(a -> {
                    a.setCaseId(cobj.getId());
                    casePersRepository.save(a);
                }
        );
        return cobj;
    }


    private String createAndGetCaseNumber() {

        Random rnd = new Random();
        int n = 100000 + rnd.nextInt(900000);
        String prefix = "00";

        StringBuilder builder = new StringBuilder();
        builder.append(prefix);
        builder.append(n);
        return builder.toString();
    }


}
