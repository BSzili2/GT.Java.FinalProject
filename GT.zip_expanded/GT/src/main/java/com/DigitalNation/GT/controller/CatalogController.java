package com.DigitalNation.GT.controller;

import com.DigitalNation.GT.model.Produs;
import com.DigitalNation.GT.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CatalogController {
	@Autowired
    private final CatalogService catalogService;

    
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @RequestMapping("/catalog")
    public String catalogPage(Model model) {
        List<Produs> products = catalogService.getAllProducts();
        model.addAttribute("products", products);
        return "catalog";
    }
}