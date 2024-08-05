package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "car_master")
public class CarMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long carId;

    private Long carTypeId;

    private String carDtl;

//    @ManyToOne
//    private Hub_Master hubMaster;

    private Boolean isAvailable;

    private String maintenanceDueDate;

    
    public Long getCarId() { return carId; }
    public void setCarId(Long carId) { this.carId = carId; }

    public Long getCarTypeId() { return carTypeId; }
    public void setCarTypeId(Long carTypeId) { this.carTypeId = carTypeId; }

    public String getCarDtl() { return carDtl; }
    public void setCarDtl(String carDtl) { this.carDtl = carDtl; }

//    public Hub_Master getHubMaster() { return hubMaster; }
//    public void setHubMaster(Hub_Master hubMaster) { this.hubMaster = hubMaster; }

    public Boolean getIsAvailable() { return isAvailable; }
    public void setIsAvailable(Boolean isAvailable) { this.isAvailable = isAvailable; }

    public String getMaintenanceDueDate() { return maintenanceDueDate; }
    public void setMaintenanceDueDate(String maintenanceDueDate) { this.maintenanceDueDate = maintenanceDueDate; }
}

