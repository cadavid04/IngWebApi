package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.ReporteDTO;
import co.udea.ingweb.api.model.Venta;
import co.udea.ingweb.api.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ReporteService implements ReporteServiceInt{
    private VentaRepository ventaRepository;

    public ReporteService(VentaRepository ventaRepository) {
        this.ventaRepository = ventaRepository;
    }

    @Override
    public List<ReporteDTO> getReporteVentaPorFechas(Date fechaInicial, Date fechaFinal) {
        List<Venta> ventas = ventaRepository.findAllByFechaAfterAndFechaBefore(fechaInicial, fechaFinal);
        List<ReporteDTO> reportesDTO = convertirVentasAReportesDTO(ventas);
        return reportesDTO;
    }

    private List<ReporteDTO> convertirVentasAReportesDTO(List<Venta> ventas) {
        List <ReporteDTO> reportesDTO = new ArrayList<>();
        for (Venta venta : ventas){
            ReporteDTO reporteDTO = new ReporteDTO();
            reporteDTO.setVenta(venta.getId());
            reporteDTO.setCliente(venta.getNombreCliente());
            reporteDTO.setEmpleado(venta.getEmpleado().getNombre());
            reporteDTO.setFecha(venta.getFecha());
            reporteDTO.setValorTotal(venta.getValor());
            reportesDTO.add(reporteDTO);
        }
        return reportesDTO;

    }
}
