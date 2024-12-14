package com.DigitalNation.GT.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Produs {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;

    private Double price;

    @Column(name = "average_completion_time")
    private Integer averageCompletionTime; 

    @Column(name = "image_path")
    private String imagePath;

   
    public Produs() {}

    public Produs(String name, Double price, Integer averageCompletionTime, String imagePath) {
        this.name = name;
        this.price = price;
        this.averageCompletionTime = averageCompletionTime;
        this.imagePath = imagePath;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getAverageCompletionTime() {
        return averageCompletionTime;
    }

    public void setAverageCompletionTime(Integer averageCompletionTime) {
        this.averageCompletionTime = averageCompletionTime;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Produs{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", price=" + price +
               ", averageCompletionTime=" + averageCompletionTime +
               ", imagePath='" + imagePath + '\'' +
               '}';
    }
}