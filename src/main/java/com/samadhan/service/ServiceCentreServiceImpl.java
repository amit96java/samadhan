package com.samadhan.service;

import com.samadhan.dto.ServiceCentreDetails;
import com.samadhan.entity.ServiceCentre;
import com.samadhan.exception.ServiceCentreException;
import com.samadhan.repository.ServiceCentreRepo;
import com.samadhan.response.GeneralResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

import com.samadhan.entity.ServiceCentre;
import com.samadhan.enums.serviceTypeEnum;
import com.samadhan.repository.ServiceCentreRepo;


@Service
public class ServiceCentreServiceImpl implements ServiceCentreService{
	@Autowired
	ServiceCentreRepo serviceCentreRepo;

    @Override
    public GeneralResponse initiateRegistration(ServiceCentreDetails details) throws ServiceCentreException {
		ServiceCentre serviceCentre = new ServiceCentre();
		serviceCentre.setName(details.getName());
		serviceCentre.setVehicleType(details.getVehicleType());
		serviceCentre.setContact(details.getContact());
		System.out.println("setting...........");
		serviceCentre.setActive(details.getActive());
		serviceCentre.setId(details.getName() + "-" + details.getContact().getPinCode()/*+"-"+ new Random().nextInt(50)*/);
		Optional.of(serviceCentreRepo.save(serviceCentre)).orElseThrow(() -> new ServiceCentreException("service centre not registered successfully"));
		return new GeneralResponse("service centre " + serviceCentre.getName() + " " + "registered successfully with id " + "[" + serviceCentre.getId() + "]",
				201, " ", null, serviceCentre);


	}
	
	@Override
	public ServiceCentre getAllServiceCentres() {
	ServiceCentre service=(ServiceCentre) serviceCentreRepo.findAll();
		return service;
	}


	@Override
	public ServiceCentre createServiceCentre(ServiceCentre serviceCentre) {
		ServiceCentre service=(ServiceCentre) serviceCentreRepo.save(serviceCentre);
		return service;
	}


	@Override
	public ServiceCentre getAllServiceCentreByfilters(String city, Long pickuplatitude, Long pickuplongitude, Long destinationlatitude, Long destinationlongitude, serviceTypeEnum serviceType) {
		ServiceCentre service=(ServiceCentre) serviceCentreRepo.findByfilters(city);
		return null;
	}


}
