package com.samadhan.repository;

import com.samadhan.entity.ServiceCentre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceCentreRepo extends CrudRepository<ServiceCentre, String> {

    @Override
    <S extends ServiceCentre> S save(S entity);
}
