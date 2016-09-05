package com.seapeng.BookSystem.model;

public class TBookType {
    private Integer id;

    private String typeName;

    private String typeIntro;

    private Integer typeStatus;

    public TBookType(Integer id, String typeName, String typeIntro, Integer typeStatus) {
        this.id = id;
        this.typeName = typeName;
        this.typeIntro = typeIntro;
        this.typeStatus = typeStatus;
    }

    public TBookType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeIntro() {
        return typeIntro;
    }

    public void setTypeIntro(String typeIntro) {
        this.typeIntro = typeIntro == null ? null : typeIntro.trim();
    }

    public Integer getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(Integer typeStatus) {
        this.typeStatus = typeStatus;
    }

    @Override
    public String toString() {
        return "TBookType{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", typeIntro='" + typeIntro + '\'' +
                ", typeStatus=" + typeStatus +
                '}';
    }
}