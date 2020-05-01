package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.AjusteDTO;

import java.util.List;

public interface AjusteServiceInt {
    public void agregarAjuste(AjusteDTO ajusteDTO);

    List<AjusteDTO> consultarAjustes();
}
