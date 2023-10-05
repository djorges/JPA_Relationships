package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.AccountEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends CrudRepository<AccountEntity, Long> {
}
