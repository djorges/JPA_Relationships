package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.AddressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepository extends CrudRepository<AddressEntity, Long> {}