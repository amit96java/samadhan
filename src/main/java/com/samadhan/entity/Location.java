package com.samadhan.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location")
@Data
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="area")
	private String area;
	
	@Column(name="street_name")
	private String streetName;
	
	@Column(name="shop_number")
	private Long shopNumber;
	
	@Column(name="latitude")
	private Long latitude;
	
	@Column(name="longitude")
	private Long longitude;
	
	
}
