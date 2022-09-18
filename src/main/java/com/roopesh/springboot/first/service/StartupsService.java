package com.roopesh.springboot.first.service;

import com.roopesh.springboot.first.entity.Startups;

import java.util.List;

public interface StartupsService {
    Startups saveStartup(Startups startups);
    List<Startups> getStartups();
    Startups getStartupById(Long startupId);
}
