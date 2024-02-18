package com.samadhan.controller;

import com.samadhan.dto.ServiceCentreDetails;
import com.samadhan.exception.ServiceCentreException;
import com.samadhan.response.GeneralResponse;
import com.samadhan.trait.ServiceCentreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("service-centre")
public class ServiceCentreController {

    @Autowired
    private ServiceCentreService serviceCentre;

    @PostMapping("register")
    public GeneralResponse register(@RequestBody ServiceCentreDetails details) throws ServiceCentreException {
        return serviceCentre.initiateRegistration(details);
    }
}
