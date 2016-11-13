package com.polovnev.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="user")
public class User implements Serializable {

    private int id;
    private String name;
    private List<Realty> realties;


    @Id
    @GeneratedValue(strategy=IDENTITY)
    @Column(name="user_id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="user_name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy="user", cascade=CascadeType.ALL, orphanRemoval=true)
    public List<Realty> getRealties() {
        return realties;
    }

    public void setRealties(List<Realty> realties) {
        this.realties = realties;
    }
}
