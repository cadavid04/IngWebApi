package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.ReporteDTO;

import java.util.Date;
import java.util.List;

public interface ReporteServiceInt {

    List<ReporteDTO> getReporteVentaPorFechas(Date fechaInicial, Date fechaFinal);
}
