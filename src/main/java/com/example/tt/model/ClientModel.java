package com.example.tt.model;

import com.example.tt.entity.ClientEntity;


import java.util.List;
import java.util.stream.Collectors;

public class ClientModel {
    private Long id;
    private String name;
    private String address;
    private String birthday;
    private List<DocumentModel> documentModels;

    public static ClientModel toModel(ClientEntity entity){
        ClientModel clientModel = new ClientModel();
        clientModel.setId(entity.getId());
        clientModel.setName(entity.getName());
        clientModel.setAddress(entity.getAddress());
        clientModel.setBirthday(entity.getBirthday());
        clientModel.setDocumentModels(entity.getDocumentEntityList().stream().map(DocumentModel::toModel).collect(Collectors.toList()));
        return clientModel;
    }

    public ClientModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public List<DocumentModel> getDocumentModels() {
        return documentModels;
    }

    public void setDocumentModels(List<DocumentModel> documentModels) {
        this.documentModels = documentModels;
    }
}
