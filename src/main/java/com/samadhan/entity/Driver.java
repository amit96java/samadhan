package com.samadhan.entity;

import lombok.Data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="driver")
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="driver_name")
	private String driverName;
	
	@Column(name="driver_contact_number")
	private Long driverContactNumber;
	
	@Column(name="driver_email")
	private String driverEmail;
	
	@Column(name="driver_active")
	private boolean driverActive;
	
	@Column(name="driver_city")
	private boolean driverCity;
	
	@Column(name="driver_token")
	private String driverToken;
	
	@OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
	private List<Ride> rides;
	
	@Column(name="driver_latitude")
	private boolean driverLatitude;
	
	@Column(name="driver_longitude")
	private boolean driverLongitude;
	
	@ManyToOne
	@JoinColumn(name = "service_centre_id")
	private ServiceCentre serviceCentre;
	
	
	public boolean isDriverCity() {
		return driverCity;
	}

	public void setDriverCity(boolean driverCity) {
		this.driverCity = driverCity;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}

	public boolean isDriverLatitude() {
		return driverLatitude;
	}

	public void setDriverLatitude(boolean driverLatitude) {
		this.driverLatitude = driverLatitude;
	}

	public boolean isDriverLongitude() {
		return driverLongitude;
	}

	public void setDriverLongitude(boolean driverLongitude) {
		this.driverLongitude = driverLongitude;
	}

	public ServiceCentre getServiceCentre() {
		return serviceCentre;
	}

	public void setServiceCentre(ServiceCentre serviceCentre) {
		this.serviceCentre = serviceCentre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Long getDriverContactNumber() {
		return driverContactNumber;
	}

	public void setDriverContactNumber(Long driverContactNumber) {
		this.driverContactNumber = driverContactNumber;
	}

	public String getDriverEmail() {
		return driverEmail;
	}

	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}

	public boolean isDriverActive() {
		return driverActive;
	}

	public void setDriverActive(boolean driverActive) {
		this.driverActive = driverActive;
	}

	public String getDriverToken() {
		return driverToken;
	}

	public void setDriverToken(String driverToken) {
		this.driverToken = driverToken;
	}

	public List<Ride> getDriverRides() {
		return rides;
	}

	public void setDriverRides(List<Ride> driverRides) {
		this.rides = rides;
	}

	
}
