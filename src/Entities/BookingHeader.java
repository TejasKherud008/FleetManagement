package com.example.demo.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking_header")
public class BookingHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private Long bookingId;

    @Column(name = "date", nullable = false)
    private String date;

//    @Column(name = "cust_id", nullable = false)
//    private Long custId;

    @Column(name = "start_date", nullable = false)
    private String startDate;

    @Column(name = "end_date", nullable = false)
    private String endDate;

//    @Column(name = "cartype_id", nullable = false)
//    private Long carTypeId;

    //customer details
    @Column(name = "rate_daily", nullable = false)
    private Double rateDaily;

    @Column(name = "rate_weekly", nullable = false)
    private Double rateWeekly;

    @Column(name = "rate_monthly", nullable = false)
    private Double rateMonthly;

    // Getters and Setters

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

//    public Long getCustId() {
//        return custId;
//    }
//
//    public void setCustId(Long custId) {
//        this.custId = custId;
//    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

//    public Long getCarTypeId() {
//        return carTypeId;
//    }
//
//    public void setCarTypeId(Long carTypeId) {
//        this.carTypeId = carTypeId;
//    }
//
//    public String getCustomerName() {
//        return customerName;
//    }

    
   
    public Double getRateDaily() {
        return rateDaily;
    }

    public void setRateDaily(Double rateDaily) {
        this.rateDaily = rateDaily;
    }

    public Double getRateWeekly() {
        return rateWeekly;
    }

    public void setRateWeekly(Double rateWeekly) {
        this.rateWeekly = rateWeekly;
    }

    public Double getRateMonthly() {
        return rateMonthly;
    }

    public void setRateMonthly(Double rateMonthly) {
        this.rateMonthly = rateMonthly;
    }
}