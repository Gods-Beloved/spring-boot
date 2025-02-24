package com.dev.james.practicespringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/controller/api/v1/")
public class ConfigurationController {

    @Autowired
    private CurrencyServiceConfiguration currencyServiceConfiguration;


    @GetMapping("")
    public CurrencyServiceConfiguration getConfiguration(){


        return currencyServiceConfiguration;
    }



}
