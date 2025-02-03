package com.rungroop.web.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> users = new ArrayList<>();

    public Role(Long id, String name, List<UserEntity> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public Role() {
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<UserEntity> getUsers() {
        return this.users;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }
}