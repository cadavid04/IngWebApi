package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.VentaDetalleDTO;
import co.udea.ingweb.api.service.VentaDetalleServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
    @RequestMapping("/detalleVentas")

public class VentaDetalleController {

    VentaDetalleServiceInt ventaDetalleService;

    public VentaDetalleController(VentaDetalleServiceInt ventaDetalleService) {
        this.ventaDetalleService = ventaDetalleService;
    }

    @PostMapping()
    public ResponseEntity<List<VentaDetalleDTO>>consultarDetalles(@RequestBody VentaDetalleDTO ventaDetalleDTO){
        return ResponseEntity.ok(ventaDetalleService.guardarDetallesPorVenta(ventaDetalleDTO));
    }

    @GetMapping("/{idVenta}")
    public double sumarTotalVenta(@PathVariable("idVenta") int idVenta){
        return ventaDetalleService.sumarTotalVenta(idVenta);
    }

}
