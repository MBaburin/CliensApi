package com.example.tt.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class TypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String typeName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "type")
    private List<DocumentEntity> documentEntityList;

    public TypeEntity() {
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

    public List<DocumentEntity> getDocumentEntityList() {
        return documentEntityList;
    }

    public void setDocumentEntityList(List<DocumentEntity> documentEntityList) {
        this.documentEntityList = documentEntityList;
    }
}
