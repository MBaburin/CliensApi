package com.example.tt.services;

import com.example.tt.entity.ClientEntity;
import com.example.tt.entity.DocumentEntity;
import com.example.tt.entity.TypeEntity;
import com.example.tt.exeptions.DocumentAlreadyExistException;
import com.example.tt.repository.ClientRepo;
import com.example.tt.repository.DocumentRepo;
import com.example.tt.repository.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepo documentRepo;

    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private TypeRepo typeRepo;

    public DocumentEntity createDocument(DocumentEntity document, Long clientId, Long typeId) throws DocumentAlreadyExistException {
        ClientEntity client = clientRepo.findById(clientId).get();
        TypeEntity type = typeRepo.findById(typeId).get();
        if (documentRepo.findByIdentificationCode(document.getIdentificationCode()) != null) {
                throw new DocumentAlreadyExistException("Клиент с такими данными уже есть");
            }
        document.setOwner(client);
        document.setType(type);
        return documentRepo.save(document);
    }

    public Long deleteDocument(Long id) {
        documentRepo.deleteById(id);
        return id;
    }

}
