package com.example.relacionesexample.repository;

import com.example.relacionesexample.entity.LibraryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibraryRepository extends CrudRepository<LibraryEntity, Long> {
    LibraryEntity findByName(String name);
}