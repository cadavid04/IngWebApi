package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.ProductoDTO;

import java.util.List;

public interface ProductoServiceInt {

    List<ProductoDTO> consultarProductos();

    int consultarProductoPorNombre(String nombre);
}
