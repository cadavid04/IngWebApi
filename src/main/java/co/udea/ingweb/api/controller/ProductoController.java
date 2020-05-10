package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.EmpleadoDTO;
import co.udea.ingweb.api.DTO.ProductoDTO;
import co.udea.ingweb.api.service.ProductoServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")

public class ProductoController {

    ProductoServiceInt productoService;

    public ProductoController(ProductoServiceInt productoService) {
        this.productoService = productoService;
    }

    @GetMapping()
    public ResponseEntity<List<ProductoDTO>> consultarProductos(){
        return ResponseEntity.ok(productoService.consultarProductos());
    }

}
