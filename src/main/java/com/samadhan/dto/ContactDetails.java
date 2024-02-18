package com.samadhan.dto;

import lombok.Data;
import lombok.ToString;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import java.util.List;

@Data
@ToString
@Embeddable
public class ContactDetails {
    @ElementCollection
    private List<Long> mobileNo;
    private String city;
    private String state;
    private String street;
    private int pinCode;
}
