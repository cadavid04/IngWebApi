package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.ReporteDTO;
import co.udea.ingweb.api.service.ReporteServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

    ReporteServiceInt reporteService;


    public ReporteController(ReporteServiceInt reporteService) {
        this.reporteService = reporteService;
    }

    @GetMapping("/VentasPorFechas")
    public ResponseEntity<List<ReporteDTO>> getReporteVentaPorFechas(@PathVariable Date fechaInicial , @PathVariable Date fechaFinal){
        return ResponseEntity.ok(reporteService.getReporteVentaPorFechas(fechaInicial,fechaFinal));
    }

}
