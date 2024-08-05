package com.example.demo.entities;



import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AddOnMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addonId;

    private String addonName;
    private Double addonDailyRate;
    private String rateValidUpto;

    // Getters and Setters

    public Long getAddonId() {
        return addonId;
    }

    public void setAddonId(Long addonId) {
        this.addonId = addonId;
    }

    public String getAddonName() {
        return addonName;
    }

    public void setAddonName(String addonName) {
        this.addonName = addonName;
    }

    public Double getAddonDailyRate() {
        return addonDailyRate;
    }

    public void setAddonDailyRate(Double addonDailyRate) {
        this.addonDailyRate = addonDailyRate;
    }

    public String getRateValidUpto() {
        return rateValidUpto;
    }

    public void setRateValidUpto(String rateValidUpto) {
        this.rateValidUpto = rateValidUpto;
    }
}
