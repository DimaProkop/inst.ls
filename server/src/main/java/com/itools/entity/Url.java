package com.itools.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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

    @ManyToMany
    @JoinTable(name = "url_tag", joinColumns = @JoinColumn(name = "url_id"), inverseJoinColumns = @JoinColumn(name = "tag_id"))
    private List<Tag> tags;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Url() {
    }

    public Url(String fullURL, User user) {
        this.fullURL = fullURL;
        this.shortURL = "";
        this.user = user;
        this.tags = new ArrayList<>();
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

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
