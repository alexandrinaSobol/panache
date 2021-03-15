package org.acme.models;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit extends PanacheEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", columnDefinition = "int")
    private long id;

    @Column(name = "name", columnDefinition = "varchar(50)")
    private String name;

    @Column(name = "color", columnDefinition = "varchar(50)")
    private String color;

    public Fruit() {
    }

    public Fruit(long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }
}
