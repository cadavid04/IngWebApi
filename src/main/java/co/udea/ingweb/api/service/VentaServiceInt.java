package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.VentaDTO;

public interface VentaServiceInt {

    int guardarVenta(VentaDTO ventaDTO);

    void actualizarVenta(VentaDTO ventaDTO);
}
