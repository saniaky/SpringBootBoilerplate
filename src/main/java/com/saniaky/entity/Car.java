package com.saniaky.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author saniaky
 * @since 6/17/17
 */
@Entity
public class Car {

    @Id
    private Long id;

    private String name;

    public Car() {
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
