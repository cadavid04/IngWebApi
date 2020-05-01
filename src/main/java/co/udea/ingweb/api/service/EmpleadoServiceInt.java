package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.EmpleadoDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmpleadoServiceInt {

    void actualizarEmpelado(EmpleadoDTO empleadoDTO);

    List<EmpleadoDTO> consultarEmpelados();

    EmpleadoDTO consultarEmpeladoPorId(int id);
}
