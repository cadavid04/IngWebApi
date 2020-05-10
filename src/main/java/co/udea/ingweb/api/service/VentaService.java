package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.VentaDTO;
import co.udea.ingweb.api.model.Empleado;
import co.udea.ingweb.api.model.Venta;
import co.udea.ingweb.api.model.VentaDetalle;
import co.udea.ingweb.api.repository.EmpleadoRepository;
import co.udea.ingweb.api.repository.VentaDetalleRepository;
import co.udea.ingweb.api.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class VentaService implements VentaServiceInt {

    VentaRepository ventaRepository;
    EmpleadoRepository empleadoRepository;
    VentaDetalleRepository ventaDetalleRepository;

    public VentaService(VentaRepository ventaRepository,
                        EmpleadoRepository empleadoRepository,
                        VentaDetalleRepository ventaDetalleRepository) {
        this.ventaRepository = ventaRepository;
        this.empleadoRepository = empleadoRepository;
        this.ventaDetalleRepository = ventaDetalleRepository;
    }

    @Override
    public int guardarVenta(VentaDTO ventaDTO) {
        ventaDTO.setId(null);
        ventaRepository.save(convertirDTOAVenta(ventaDTO));
        return ventaRepository.findTopByOrderByIdDesc().getId();

    }

    @Override
    public void actualizarVenta(VentaDTO ventaDTO) {
        double valor = 0;
        valor = sumarTotalVenta(ventaDetalleRepository.findAllByVenta_Id(ventaDTO.getId()));
        ventaDTO.setValor(valor);
        ventaRepository.save(convertirDTOAVenta(ventaDTO));
    }

    private Venta convertirDTOAVenta(VentaDTO ventaDTO){
        Venta venta = new Venta();
        Empleado empleado;
        empleado = empleadoRepository.findByNombreEquals(ventaDTO.getEmpleado());
        venta.setEmpleado(empleado);
        venta.setFecha(new Date());
        venta.setIdCliente(ventaDTO.getIdCliente());
        venta.setNombreCliente(ventaDTO.getCliente());
        venta.setValor(ventaDTO.getValor());
        venta.setId(ventaDTO.getId());
        return venta;
    }


    private double sumarTotalVenta(List<VentaDetalle> ventaDetalles){
        double cuenta = 0;
        for(VentaDetalle ventaDetalle : ventaDetalles){
            cuenta = cuenta + (ventaDetalle.getValorUnitario() * ventaDetalle.getCantidad());
        }
        return cuenta;
    }

}
