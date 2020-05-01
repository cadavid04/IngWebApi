package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.AjusteDTO;
import co.udea.ingweb.api.service.AjusteServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ajustes")
public class AjusteController {

    private AjusteServiceInt ajusteService;


    public AjusteController(AjusteServiceInt ajusteService) {
        this.ajusteService = ajusteService;
    }

    @PostMapping()
    public void agregarAjuste(@RequestBody AjusteDTO ajusteDTO){
        ajusteService.agregarAjuste(ajusteDTO);
    }

    @GetMapping()
    public ResponseEntity<List<AjusteDTO>> consultarAjustes(){
        return ResponseEntity.ok(ajusteService.consultarAjustes());
    }
}



