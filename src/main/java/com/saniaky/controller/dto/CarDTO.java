package com.saniaky.controller.dto;

/**
 * @author saniaky
 * @since 6/17/17
 */
public class CarDTO {

    private Long id;
    private String name;

    public CarDTO() {
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
