package com.example.tt.model;


import com.example.tt.entity.TypeEntity;

public class TypeModel {
    private Long id;
    private String typeName;

    public static TypeModel toModel(TypeEntity entity){
        TypeModel typeModel = new TypeModel();
        typeModel.setId(entity.getId());
        typeModel.setTypeName(entity.getTypeName());
        return typeModel;
    }

    public TypeModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
