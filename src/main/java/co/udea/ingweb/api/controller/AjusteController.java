package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.AjusteDTO;
import co.udea.ingweb.api.service.AjusteServiceInt;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/ajuste")
public class AjusteController {

    private AjusteServiceInt ajusteService;


    public AjusteController(AjusteServiceInt ajusteService) {
        this.ajusteService = ajusteService;
    }

    @PostMapping()
    public void agregarAjuste(@RequestBody AjusteDTO ajusteDTO){
        ajusteService.agregarAjuste(ajusteDTO);
    }
}



