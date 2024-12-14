package com.DigitalNation.GT.service;

import com.DigitalNation.GT.model.Produs;
import com.DigitalNation.GT.repository.ProdusRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CatalogService {

    private final ProdusRepository produsRepository;

    public CatalogService(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    public List<Produs> getAllProducts() {
        return produsRepository.findAll();
    }
}