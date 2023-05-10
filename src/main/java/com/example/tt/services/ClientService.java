package com.example.tt.services;

import com.example.tt.entity.ClientEntity;
import com.example.tt.exeptions.ClientAlreadyExistException;
import com.example.tt.exeptions.ClientNotFoundException;
import com.example.tt.model.ClientModel;
import com.example.tt.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
    @Autowired
    public ClientRepo clientRepo;

    public ClientEntity addClient(ClientEntity client) throws ClientAlreadyExistException {
        if (clientRepo.findByName(client.getName()) != null) {
            if (clientRepo.findByAddress(client.getAddress()) != null) {
                throw new ClientAlreadyExistException("Клиент с такими данными уже есть");
            }
        }
        return clientRepo.save(client);
    }

    public ClientModel getClient(Long id) throws ClientNotFoundException {
        ClientEntity client = clientRepo.findById(id).get();
        if (client == null) {
            throw new ClientNotFoundException("Пользователь с таким именем не найден");
        }
        return ClientModel.toModel(client);
    }

    public Long deleteClient(Long id) {
        clientRepo.deleteById(id);
        return id;
    }

    public ClientEntity editClient(ClientEntity client) throws ClientAlreadyExistException {
        return clientRepo.save(client);
    }

}
