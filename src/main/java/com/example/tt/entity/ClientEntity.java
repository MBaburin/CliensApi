package com.example.tt.entity;


import javax.persistence.*;
import java.util.List;


@Entity
public class ClientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    private String birthday;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private List<DocumentEntity> documentEntityList;

    public ClientEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DocumentEntity> getDocumentEntityList() {
        return documentEntityList;
    }

    public void setDocumentEntityList(List<DocumentEntity> documentEntityList) {
        this.documentEntityList = documentEntityList;
    }
}
