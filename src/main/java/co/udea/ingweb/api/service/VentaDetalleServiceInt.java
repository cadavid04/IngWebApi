package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.VentaDetalleDTO;

import java.util.List;

public interface VentaDetalleServiceInt {


    List<VentaDetalleDTO> guardarDetallesPorVenta(VentaDetalleDTO detalleDTO);


    double sumarTotalVenta(int idVenta);
}
