package com.example.tt.entity;

import javax.persistence.*;

@Entity
public class DocumentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String identificationCode;

    private String stateEducationalBody;

    @ManyToOne
    @JoinColumn(name = "client.id")
    private ClientEntity owner;

    @ManyToOne
    @JoinColumn(name = "type.id")
    private TypeEntity type;

    public DocumentEntity() {
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

    public ClientEntity getOwner() {
        return owner;
    }

    public void setOwner(ClientEntity owner) {
        this.owner = owner;
    }

    public TypeEntity getType() {
        return type;
    }

    public void setType(TypeEntity type) {
        this.type = type;
    }
}
