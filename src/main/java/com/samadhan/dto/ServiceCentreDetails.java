package com.samadhan.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ServiceCentreDetails {
    private String name;
    private ContactDetails contact;
    private VehicleType vehicleType;

    public ServiceCentreDetails() {
    }

    public ServiceCentreDetails(String name, ContactDetails contact, VehicleType vehicleType) {
        this.name = name;
        this.contact = contact;
        this.vehicleType = vehicleType;
    }
}
