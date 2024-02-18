package com.samadhan.service;

import com.samadhan.dto.ServiceCentreDetails;
import com.samadhan.entity.ServiceCentre;
import com.samadhan.exception.ServiceCentreException;
import com.samadhan.repository.ServiceCentreRepo;
import com.samadhan.response.GeneralResponse;
import com.samadhan.trait.ServiceCentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class ServiceCentreServiceImpl implements ServiceCentreService {

    @Autowired
    private ServiceCentreRepo serviceCentreRepo;

    @Override
    public GeneralResponse initiateRegistration(ServiceCentreDetails details) throws ServiceCentreException {
        ServiceCentre serviceCentre = new ServiceCentre();
        serviceCentre.setName(details.getName());
        serviceCentre.setVehicleType(details.getVehicleType());
        serviceCentre.setContact(details.getContact());
        serviceCentre.setId(details.getName()+"-"+details.getContact().getPinCode()/*+"-"+ new Random().nextInt(50)*/);
        Optional.of(serviceCentreRepo.save(serviceCentre)).orElseThrow(() -> new ServiceCentreException("service centre not registered successfully"));
        return new GeneralResponse("service centre "+serviceCentre.getName()+" "+"registered successfully with id "+"["+serviceCentre.getId()+"]",
                201," ", null ,serviceCentre);
    }
}
