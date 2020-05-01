package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.EmpleadoDTO;
import co.udea.ingweb.api.service.EmpleadoServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empleados")
public class EmpleadoController {
    EmpleadoServiceInt empleadoServiceInt;

    public EmpleadoController(EmpleadoServiceInt empleadoServiceInt) {
        this.empleadoServiceInt = empleadoServiceInt;
    }

    @PutMapping()
    public void actualizarEmpelado(EmpleadoDTO empleadoDTO){
        empleadoServiceInt.actualizarEmpelado(empleadoDTO);
    }

    @GetMapping()
    public ResponseEntity<List<EmpleadoDTO>> consultarEmpelados(){
        return ResponseEntity.ok(empleadoServiceInt.consultarEmpelados());
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpleadoDTO> consultarEmpeladoPorId(@RequestParam int id){
        return ResponseEntity.ok(empleadoServiceInt.consultarEmpeladoPorId(id));
    }
}
