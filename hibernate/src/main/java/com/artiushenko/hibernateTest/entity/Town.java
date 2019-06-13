package com.artiushenko.hibernateTest.entity;

import javax.persistence.*;

@Entity
@Table(name = "t_table")
public class Town {
    public Town() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "town")
    private String town;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
