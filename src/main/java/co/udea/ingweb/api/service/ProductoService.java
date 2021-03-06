package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.ProductoDTO;
import co.udea.ingweb.api.model.Producto;
import co.udea.ingweb.api.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements ProductoServiceInt{

    ProductoRepository productoRepository;

    public ProductoService(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<ProductoDTO> consultarProductos() {
        return convertirProductosADTO(productoRepository.findAll());
    }

    @Override
    public int consultarProductoPorNombre(String nombre) {
        return convertirProductoADTO(productoRepository.findByNombreEquals(nombre)).
                getPrecioCompra();
    }

    private List<ProductoDTO> convertirProductosADTO(List<Producto> productos){
        List<ProductoDTO> productosDTO = new ArrayList<>();
        for(Producto producto : productos){
            productosDTO.add(convertirProductoADTO(producto));
        }
        return productosDTO;
    }

    private ProductoDTO convertirProductoADTO(Producto producto){
        ProductoDTO productoDTO = new ProductoDTO();
        productoDTO.setCantidad(producto.getCantidad());
        productoDTO.setFechaCreacion(producto.getFechaCreacion());
        productoDTO.setId(producto.getId());
        productoDTO.setIdCategoria(producto.getCategoria().getId());
        productoDTO.setMarca(producto.getMarca());
        productoDTO.setModelo(producto.getModelo());
        productoDTO.setNombre(producto.getNombre());
        productoDTO.setPrecioCompra(producto.getPrecioCompra());
        return productoDTO;
    }

}
