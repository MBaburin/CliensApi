package com.example.tt.repository;

import com.example.tt.entity.ClientEntity;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepo extends CrudRepository<ClientEntity, Long> {
    ClientEntity findByName(String name);
    ClientEntity findByAddress(String address);
}
