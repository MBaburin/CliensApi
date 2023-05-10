package com.example.tt.repository;

import com.example.tt.entity.ClientEntity;
import com.example.tt.entity.DocumentEntity;
import org.springframework.data.repository.CrudRepository;

public interface DocumentRepo extends CrudRepository<DocumentEntity, Long> {
    ClientEntity findByIdentificationCode (String identificationCode);


}
