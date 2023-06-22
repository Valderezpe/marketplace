package com.backend.backend.controller;

import java.sql.Date;

import javax.xml.crypto.Data;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Ola {

    @GetMapping("/")
    public String ola() {
        return "bom dia a todos";
    }
}
