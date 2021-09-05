package com.example.springthaidevtest;

public class Product {

    private Long id;
    private String name;
    private String catrgory;

    public Product() {
    }

    public Product(Long id, String name, String catrgory) {
        this.id = id;
        this.name = name;
        this.catrgory = catrgory;
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

    public String getCatrgory() {
        return catrgory;
    }

    public void setCatrgory(String catrgory) {
        this.catrgory = catrgory;
    }
}
