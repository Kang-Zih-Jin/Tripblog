package com.java017.tripblog.entity;

import javax.persistence.*;

/**
 * @author Sandy
 * @date
 */

@Entity
@Table(name = "intro")
public class Intro{

    //主鍵 會員編號外鍵
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //自我介紹標題
    private String introTitle;

    //自我介紹內文
    private String introContent;

    //FB Link
    private String fbLink;

    //Ig Link
    private String igLink;

    //YT Link
    private String ytLink;

    //Email Link
    private String emailLink;

    private boolean hasBanner;

    public boolean hasBanner() {
        return hasBanner;
    }

    public void setHasBanner(boolean hasBanner) {
        this.hasBanner = hasBanner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntroTitle() {
        return introTitle;
    }

    public void setIntroTitle(String introTitle) {
        this.introTitle = introTitle;
    }

    public String getIntroContent() {
        return introContent;
    }

    public void setIntroContent(String introContent) {
        this.introContent = introContent;
    }

    public String getFbLink() {
        return fbLink;
    }

    public void setFbLink(String fbLink) {
        this.fbLink = fbLink;
    }

    public String getIgLink() {
        return igLink;
    }

    public void setIgLink(String igLink) {
        this.igLink = igLink;
    }

    public String getYtLink() {
        return ytLink;
    }

    public void setYtLink(String ytLink) {
        this.ytLink = ytLink;
    }

    public String getEmailLink() {
        return emailLink;
    }

    public void setEmailLink(String emailLink) {
        this.emailLink = emailLink;
    }

    @Override
    public String toString() {
        return "Intro{" +
                "id=" + id +
                ", introTitle='" + introTitle + '\'' +
                ", introContent='" + introContent + '\'' +
                ", fbLink='" + fbLink + '\'' +
                ", igLink='" + igLink + '\'' +
                ", ytLink='" + ytLink + '\'' +
                ", emailLink='" + emailLink + '\'' +
                ", hasBanner=" + hasBanner +
                '}';
    }
}

