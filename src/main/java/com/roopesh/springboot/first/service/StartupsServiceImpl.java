package com.roopesh.springboot.first.service;

import com.roopesh.springboot.first.entity.Startups;
import com.roopesh.springboot.first.repository.StartupsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StartupsServiceImpl implements StartupsService {

    @Autowired
    private StartupsRepository startupsRepository;

    @Override
    public Startups saveStartup(Startups startups) {
        return startupsRepository.save(startups);
    }

    @Override
    public List<Startups> getStartups() {
        return startupsRepository.findAll();
    }

    @Override
    public Startups getStartupById(Long startupId) {
        return startupsRepository.findById(startupId).get();
    }
}
