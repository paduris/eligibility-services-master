package com.data.collection.income.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/data-collection/")
public class IncomeController {

    /**
     * This is a test method
     *
     * @return
     */
    @GetMapping("/test")
    public String test() {
        return "Service Testing";
    }

}
