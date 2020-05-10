package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.VentaDTO;
import co.udea.ingweb.api.service.VentaServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ventas")

public class VentaController {

    VentaServiceInt ventaService;

    public VentaController(VentaServiceInt ventaService) {
        this.ventaService = ventaService;
    }

    @PostMapping()
    public int guardarVenta(@RequestBody VentaDTO ventaDTO){
        return ventaService.guardarVenta(ventaDTO);
    }

    @PutMapping()
    public void actualizarVenta(@RequestBody VentaDTO ventaDTO){
         ventaService.actualizarVenta(ventaDTO);
    }

}
