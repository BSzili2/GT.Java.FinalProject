package com.DigitalNation.GT.service;

import org.springframework.stereotype.Service;

import com.DigitalNation.GT.model.Acasa;

@Service
public class AcasaService {

    public Acasa getAcasaDetails() {
        return new Acasa(
            "Bine ati venit pe pagina noastra, aici gasiti toate informatiile importante despre noi!",
            "Suntem o firma de constructii cu un domeniu de activitate de peste 30 de ani si oferim servicii de cea mai inalta calitate! Ne puteti localiza pe Str. 1 Decembrie 1918 Nr. 142 Rupea, Brasov."
        );
    }
}
