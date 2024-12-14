package com.DigitalNation.GT.model;

import java.util.List;

public class Catalog {
    private Long id;
    private String numeCatalog;
    private List<Produs> produse;

    public Catalog() {}

    public Catalog(Long id, String numeCatalog, List<Produs> produse) {
        this.id = id;
        this.numeCatalog = numeCatalog;
        this.produse = produse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeCatalog() {
        return numeCatalog;
    }

    public void setNumeCatalog(String numeCatalog) {
        this.numeCatalog = numeCatalog;
    }

    public List<Produs> getProduse() {
        return produse;
    }

    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "id=" + id +
                ", numeCatalog='" + numeCatalog + '\'' +
                ", produse=" + produse +
                '}';
    }
}