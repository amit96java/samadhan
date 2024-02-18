package com.samadhan.entity;

import com.samadhan.dto.ContactDetails;
import com.samadhan.dto.ServiceCentreDetails;
import com.samadhan.dto.VehicleType;
import lombok.Data;

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


}
