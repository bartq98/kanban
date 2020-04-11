package com.example.kanban.entities.users;

import com.example.kanban.entities.membership.Membership;
import com.example.kanban.entities.task.Task;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(unique = true, nullable = true)
    private String email;

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = true, length = 30)
    private String surname;

    @Column(nullable = true, length = 30)
    private String nick;

    @Column(nullable = false)
    private String password;

    @Column(name = "is_admin", nullable = false) // This will be bit(1) in database
    private boolean is_admin = false;

    @OneToMany(mappedBy = "user")
    private Set<Membership> memberships;

    @OneToMany(mappedBy = "user")
    private Set<Task> tasks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }
}
