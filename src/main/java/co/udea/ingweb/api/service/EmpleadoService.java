package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.EmpleadoDTO;
import co.udea.ingweb.api.model.Empleado;
import co.udea.ingweb.api.repository.EmpleadoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService implements EmpleadoServiceInt{
    EmpleadoRepository empleadoRepository;
    List<EmpleadoDTO> empleadosDTO;
    List<Empleado> empleados;

    public EmpleadoService(EmpleadoRepository empleadoRepository) {
        this.empleadoRepository = empleadoRepository;
    }

    @Override
    public void actualizarEmpelado(EmpleadoDTO empleadoDTO) {
        Empleado empleado = empleadoRepository.getById(empleadoDTO.getId());
        empleado.setNombre(empleadoDTO.getNombre());
        empleado.setCorreo(empleadoDTO.getCorreo());
        empleado.setDireccion(empleadoDTO.getDireccion());
        empleado.setDocumento(empleadoDTO.getDocumento());
        empleado.setTelefono(empleadoDTO.getTelefono());
        empleado.setId(empleadoDTO.getId());
        empleadoRepository.save(empleado);
    }

    @Override
    public List<EmpleadoDTO> consultarEmpelados(){
        empleados = empleadoRepository.findAll();
        empleadosDTO = new ArrayList<>();
        for (Empleado empleado : empleados){
            EmpleadoDTO empleadoDTO = new EmpleadoDTO();
            empleadoDTO.setDocumento(empleado.getDocumento());
            empleadoDTO.setId(empleado.getId());
            empleadoDTO.setCorreo(empleado.getCorreo());
            empleadoDTO.setDireccion(empleado.getDireccion());
            empleadoDTO.setTelefono(empleado.getTelefono());
            empleadoDTO.setNombre(empleado.getNombre());
            empleadosDTO.add(empleadoDTO);
        }
        return empleadosDTO;
    }

    @Override
    public EmpleadoDTO consultarEmpeladoPorId(int id){
        Empleado empleado = empleadoRepository.getById(id);
        EmpleadoDTO empleadoDTO = new  EmpleadoDTO();
        empleadoDTO.setNombre(empleado.getNombre());
        empleadoDTO.setTelefono(empleado.getTelefono());
        empleadoDTO.setDireccion(empleado.getDireccion());
        empleadoDTO.setId(empleado.getId());
        empleadoDTO.setDocumento(empleado.getDocumento());
        empleadoDTO.setCorreo(empleado.getCorreo());
        return  empleadoDTO;
    }


}
