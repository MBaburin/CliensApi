package com.example.tt.model;

import com.example.tt.entity.DocumentEntity;

public class DocumentModel {
    private Long id;
    private String identificationCode;
    private String stateEducationalBody;

    private TypeModel typeModel;

    public static DocumentModel toModel(DocumentEntity entity){
        DocumentModel documentModel = new DocumentModel();
        documentModel.setId(entity.getId());
        documentModel.setIdentificationCode(entity.getIdentificationCode());
        documentModel.setStateEducationalBody(entity.getStateEducationalBody());
        return documentModel;
    }

    public DocumentModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getStateEducationalBody() {
        return stateEducationalBody;
    }

    public void setStateEducationalBody(String stateEducationalBody) {
        this.stateEducationalBody = stateEducationalBody;
    }

    public TypeModel getTypeModel() {
        return typeModel;
    }

    public void setTypeModel(TypeModel typeModel) {
        this.typeModel = typeModel;
    }
}
