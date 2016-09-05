package com.seapeng.BookSystem.model;

public class TPublisher {
    private Integer id;

    private String pubName;

    private String pubTel;

    private String pubLinkMan;

    private String pubIntro;

    private Integer pubStatus;

    public TPublisher(Integer id, String pubName, String pubTel, String pubLinkMan, String pubIntro, Integer pubStatus) {
        this.id = id;
        this.pubName = pubName;
        this.pubTel = pubTel;
        this.pubLinkMan = pubLinkMan;
        this.pubIntro = pubIntro;
        this.pubStatus = pubStatus;
    }

    public TPublisher() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPubName() {
        return pubName;
    }

    public void setPubName(String pubName) {
        this.pubName = pubName == null ? null : pubName.trim();
    }

    public String getPubTel() {
        return pubTel;
    }

    public void setPubTel(String pubTel) {
        this.pubTel = pubTel == null ? null : pubTel.trim();
    }

    public String getPubLinkMan() {
        return pubLinkMan;
    }

    public void setPubLinkMan(String pubLinkMan) {
        this.pubLinkMan = pubLinkMan == null ? null : pubLinkMan.trim();
    }

    public String getPubIntro() {
        return pubIntro;
    }

    public void setPubIntro(String pubIntro) {
        this.pubIntro = pubIntro == null ? null : pubIntro.trim();
    }

    public Integer getPubStatus() {
        return pubStatus;
    }

    public void setPubStatus(Integer pubStatus) {
        this.pubStatus = pubStatus;
    }

    @Override
    public String toString() {
        return "TPublisher{" +
                "id=" + id +
                ", pubName='" + pubName + '\'' +
                ", pubTel='" + pubTel + '\'' +
                ", pubLinkMan='" + pubLinkMan + '\'' +
                ", pubIntro='" + pubIntro + '\'' +
                ", pubStatus=" + pubStatus +
                '}';
    }
}