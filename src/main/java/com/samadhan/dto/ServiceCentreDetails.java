package com.samadhan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ServiceCentreDetails {
    private String name;
    private ContactDetails contact;
    private VehicleType vehicleType;
    private Boolean active;

    public ServiceCentreDetails() {
    }

    public ServiceCentreDetails(String name, ContactDetails contact, VehicleType vehicleType, boolean active) {
        this.name = name;
        this.contact = contact;
        this.vehicleType = vehicleType;
        this.active = active;
    }
}
