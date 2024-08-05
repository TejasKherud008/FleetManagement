package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Table;


@Entity
@Table(name = "hubMaster")
public class Hub_Master {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hub_id")
    private Long hubId;

    public Long getHubId() {
		return hubId;
	}

	public void setHubId(Long hubId) {
		this.hubId = hubId;
	}

	public String getHubName() {
		return hubName;
	}

	public void setHubName(String hubName) {
		this.hubName = hubName;
	}

	public String getHubAddressAndOtherDetails() {
		return hubAddressAndOtherDetails;
	}

	public void setHubAddressAndOtherDetails(String hubAddressAndOtherDetails) {
		this.hubAddressAndOtherDetails = hubAddressAndOtherDetails;
	}

	@Column(name = "hub_name")
    private String hubName;

    @Column(name = "hub_address_and_other_details")
    private String hubAddressAndOtherDetails;
    
   /* @ManyToOne
    @JoinColumn(name = "city_id")
    private CityMaster city;

    @ManyToOne
    @JoinColumn(name = "state_id")
    private StateMaster state;*/

}
 

