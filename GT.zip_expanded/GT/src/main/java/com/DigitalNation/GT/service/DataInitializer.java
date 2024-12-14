package com.DigitalNation.GT.service;

import com.DigitalNation.GT.model.Produs;
import com.DigitalNation.GT.repository.ProdusRepository;

import jakarta.annotation.PreDestroy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProdusRepository produsRepository;

    public DataInitializer(ProdusRepository produsRepository) {
        this.produsRepository = produsRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        

        
        produsRepository.save(new Produs("Tuburi", 100.0, 2, "productA.jpeg"));
        produsRepository.save(new Produs("Crepuri", 200.0, 4, "productB.jpeg"));
        produsRepository.save(new Produs("Constructii beton armat", 1000.0, 10, "productC.jpeg"));

        
        System.out.println("Database has been initialized with sample products.");
    }
        @PreDestroy public void onShutdown() { produsRepository.deleteAll();
    }
}
