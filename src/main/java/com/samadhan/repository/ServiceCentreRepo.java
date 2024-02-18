package com.samadhan.repository;


import com.samadhan.entity.ServiceCentre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.samadhan.entity.*;
@Repository
public interface ServiceCentreRepo extends CrudRepository<ServiceCentre, String> {

    @Override
    <S extends ServiceCentre> S save(S entity);

	
	@Query(value="select * from Service_centre sc where sc.city_name =:city and sc.active=true" ,nativeQuery = true)
	ServiceCentre findByfilters(String city);
}
