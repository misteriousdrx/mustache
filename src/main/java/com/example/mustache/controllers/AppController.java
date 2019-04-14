package com.example.mustache.controllers;

import com.example.mustache.templates.SpringBatchTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class AppController {

    @RequestMapping(method = RequestMethod.GET, path = "/")
    public ResponseEntity<String> setAppTemplate() throws IOException {
        SpringBatchTemplate template = new SpringBatchTemplate("br.com.itau.caps.projeto", "projeto");
        template.generateTemplates();

        return ResponseEntity.ok("It works!");
    }

}
