package com.example.demo.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="BookingDetail")
public class BookingDetail {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long booking_dtal_id;


	    // Getters and Setters

	    public Long getId() {
	        return booking_dtal_id;
	    }

	    public void setId(Long id) {
	        this.booking_dtal_id = id;
	    }

	}
	
	