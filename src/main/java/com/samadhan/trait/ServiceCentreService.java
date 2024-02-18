package com.samadhan.trait;

import com.samadhan.dto.ServiceCentreDetails;
import com.samadhan.exception.ServiceCentreException;
import com.samadhan.response.GeneralResponse;

public interface ServiceCentreService {

    GeneralResponse initiateRegistration(ServiceCentreDetails details) throws ServiceCentreException;

}
