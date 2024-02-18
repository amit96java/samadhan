package com.samadhan.entity;


import com.samadhan.dto.ContactDetails;
import com.samadhan.dto.ServiceCentreDetails;
import com.samadhan.dto.VehicleType;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.samadhan.enums.serviceTypeEnum;
import javax.persistence.*;

@Entity
@Table (name = "service_centre")
@Data
public class ServiceCentre {
    @Id
    private String id;

    @Column
    private String name;

    @Column
    private ContactDetails contact;

    @Column
    private VehicleType vehicleType;
	
	@Column(name="service_centre_name")
	private String serviceCentreName;
	
	@Column(name="contact_number")
	private Long contactNumber;
	
	@Column(name="email")
	private Long email;
	
	@Column(name="active")
	private Boolean active;
	
	@OneToOne
	private Location location;
	
	@OneToOne
	private Payment payment;
	
	@Column(name="service_type")
	private serviceTypeEnum serviceType;

}
