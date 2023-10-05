package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.BankEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBankRepository extends CrudRepository<BankEntity, Long> {
}
