package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.VentaDetalleDTO;
import co.udea.ingweb.api.model.Producto;
import co.udea.ingweb.api.model.Venta;
import co.udea.ingweb.api.model.VentaDetalle;
import co.udea.ingweb.api.repository.ProductoRepository;
import co.udea.ingweb.api.repository.VentaDetalleRepository;
import co.udea.ingweb.api.repository.VentaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VentaDetalleService implements VentaDetalleServiceInt{

    VentaDetalleRepository ventaDetalleRepository;
    ProductoRepository productoRepository;
    VentaRepository ventaRepository;

    public VentaDetalleService(VentaDetalleRepository ventaDetalleRepository, ProductoRepository productoRepository, VentaRepository ventaRepository) {
        this.ventaDetalleRepository = ventaDetalleRepository;
        this.productoRepository = productoRepository;
        this.ventaRepository = ventaRepository;
    }

    @Override
    public List<VentaDetalleDTO> guardarDetallesPorVenta(VentaDetalleDTO ventaDetalleDTO) {
        ventaDetalleRepository.save(convertirDTOADetalleventa(ventaDetalleDTO));
        return convertirDetalleVentaADTO(ventaDetalleRepository.findAllByVenta_Id(ventaDetalleDTO.getIdVenta()));
    }

    private List<VentaDetalleDTO> convertirDetalleVentaADTO(List<VentaDetalle> ventaDetalles){
        List<VentaDetalleDTO> ventaDetalleDTOS = new ArrayList<>();
        for(VentaDetalle ventaDetalle:ventaDetalles){
            VentaDetalleDTO ventaDetalleDTO = new VentaDetalleDTO();
            ventaDetalleDTO.setCantidad(ventaDetalle.getCantidad());
            ventaDetalleDTO.setValorUnitario(ventaDetalle.getValorUnitario());
            ventaDetalleDTO.setProducto(ventaDetalle.getProducto().getNombre());
            ventaDetalleDTO.setIdVenta(ventaDetalle.getVenta().getId());
            ventaDetalleDTOS.add(ventaDetalleDTO);
        }
        return ventaDetalleDTOS;
    }
    private VentaDetalle convertirDTOADetalleventa(VentaDetalleDTO ventaDetalleDTO){
        VentaDetalle ventaDetalle = new VentaDetalle();
        Producto producto = productoRepository.findByNombreEquals(ventaDetalleDTO.getProducto());
        Venta venta = ventaRepository.findById(ventaDetalleDTO.getIdVenta());
        ventaDetalle.setCantidad(ventaDetalleDTO.getCantidad());
        ventaDetalle.setProducto(producto);
        ventaDetalle.setValorUnitario(producto.getPrecioCompra());
        ventaDetalle.setVenta(venta);
        return ventaDetalle;
    }

}
