package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CityMaster")
public class CityMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cityId")
    private int cityId;

    @Column(name = "cityName")
    private String cityName;

    @ManyToOne(cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
    @JoinColumn(name = "state_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
    private StateMaster stateMaster;

    // Getters and Setters
    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public StateMaster getStateMaster() {
        return stateMaster;
    }

    public void setStateMaster(StateMaster stateMaster) {
        this.stateMaster = stateMaster;
    }

    
}

