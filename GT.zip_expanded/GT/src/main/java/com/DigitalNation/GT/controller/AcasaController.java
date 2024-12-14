package com.DigitalNation.GT.controller;

import com.DigitalNation.GT.model.Acasa;
import com.DigitalNation.GT.service.AcasaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AcasaController {
	 @Autowired
    private final AcasaService acasaService;

   
    public AcasaController(AcasaService acasaService) {
        this.acasaService = acasaService;
    }

    @GetMapping("/acasa")
    public String showAcasaPage(Model model) {
        Acasa acasa = acasaService.getAcasaDetails();
        model.addAttribute("welcomeMessage", acasa.getWelcomeMessage());
        model.addAttribute("description", acasa.getDescription());
        return "acasa";
    }
}
