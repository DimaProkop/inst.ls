package com.itools.entity;

import javax.persistence.*;

/**
 * Created by dmitry on 7.2.17.
 */
@Entity
@Table(name = "url")
public class Url {
    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String fullURL;

    @Column
    private String shortURL;

    public Url() {
    }

    public Url(String fullURL, String shortURL) {
        this.fullURL = fullURL;
        this.shortURL = shortURL;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullURL() {
        return fullURL;
    }

    public void setFullURL(String fullURL) {
        this.fullURL = fullURL;
    }

    public String getShortURL() {
        return shortURL;
    }

    public void setShortURL(String shortURL) {
        this.shortURL = shortURL;
    }
}
