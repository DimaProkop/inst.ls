package com.itools.entity;

import javax.persistence.*;

/**
 * Created by dmitry on 7.2.17.
 */
@Entity
@Table(name = "tag")
public class Tag {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    public Tag() {
    }

    public Tag(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
