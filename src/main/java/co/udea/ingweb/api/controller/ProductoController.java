package co.udea.ingweb.api.controller;

import co.udea.ingweb.api.DTO.EmpleadoDTO;
import co.udea.ingweb.api.DTO.ProductoDTO;
import co.udea.ingweb.api.service.ProductoServiceInt;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{nombre}")
    public ResponseEntity<ProductoDTO> consultarProductoPorNombre(@PathVariable("nombre")       String nombre){
        return ResponseEntity.ok(productoService.consultarProductoPorNombre(nombre));
    }

}
