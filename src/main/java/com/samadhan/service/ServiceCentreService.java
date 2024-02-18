package com.samadhan.service;

import com.samadhan.dto.ServiceCentreDetails;
import com.samadhan.entity.ServiceCentre;
import com.samadhan.enums.serviceTypeEnum;
import com.samadhan.exception.ServiceCentreException;
import com.samadhan.response.GeneralResponse;

public interface ServiceCentreService {
	GeneralResponse initiateRegistration(ServiceCentreDetails details) throws ServiceCentreException;

	ServiceCentre getAllServiceCentres();

	ServiceCentre createServiceCentre(ServiceCentre serviceCentre);

	ServiceCentre getAllServiceCentreByfilters(String city, Long pickuplatitude, Long pickuplongitude, Long destinationlatitude, Long destinationlongitude, serviceTypeEnum serviceType);

}
