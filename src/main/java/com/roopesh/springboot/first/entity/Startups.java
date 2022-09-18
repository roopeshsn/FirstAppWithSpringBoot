package com.roopesh.springboot.first.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Startups {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long startupId;
    private String startupName;
    private String startupAddress;

    public Long getStartupId() {
        return startupId;
    }

    public void setStartupId(Long startupId) {
        this.startupId = startupId;
    }

    public String getStartupName() {
        return startupName;
    }

    public void setStartupName(String startupName) {
        this.startupName = startupName;
    }

    public String getStartupAddress() {
        return startupAddress;
    }

    public void setStartupAddress(String startupAddress) {
        this.startupAddress = startupAddress;
    }

    public Startups(Long startupId, String startupName, String startupAddress) {
        this.startupId = startupId;
        this.startupName = startupName;
        this.startupAddress = startupAddress;
    }

    public Startups() {
    }

    @Override
    public String toString() {
        return "Startups{" +
                "startupId=" + startupId +
                ", startupName='" + startupName + '\'' +
                ", startupAddress='" + startupAddress + '\'' +
                '}';
    }
}
