package com.roopesh.springboot.first.controller;

import com.roopesh.springboot.first.entity.Startups;
import com.roopesh.springboot.first.service.StartupsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StartupsController {

    @Autowired
    private StartupsService startupsService;

    @PostMapping("/startups")
    public Startups saveStartup(@RequestBody Startups startups) {
        return startupsService.saveStartup(startups);
    }

    @GetMapping("/startups")
    public List<Startups> getStartups() {
        return startupsService.getStartups();
    }

    @GetMapping("/startups/{id}")
    public Startups getStartupById(@PathVariable("id") Long startupId) {
        return startupsService.getStartupById(startupId);
    }
}
