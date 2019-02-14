package com.cases.service;

import com.cases.model.Case;
import com.cases.repository.CaseRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@Slf4j
public class CaseService {


    @Autowired
    private CaseRepository repository;


    public Case createCase(Case caseObj)
    {
        log.info("Entering createCase ");
        Case saveO = new Case(caseObj.getCasePers(), this.createAndGetCaseNumber());
        log.info("Exiting createCase "+saveO.getCaseNumber());
        return repository.saveAndFlush(saveO);


    }

    /**
     * Create a new case number
     * @return
     */
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
