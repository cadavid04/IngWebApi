package co.udea.ingweb.api.service;

import co.udea.ingweb.api.DTO.AjusteDTO;
import co.udea.ingweb.api.model.Ajuste;
import co.udea.ingweb.api.model.Producto;
import co.udea.ingweb.api.repository.AjusteRepository;
import co.udea.ingweb.api.repository.ProductoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class AjusteService implements AjusteServiceInt{

    private AjusteRepository ajusteRepository;
    private ProductoRepository productoRepository;
    private final Logger log = LoggerFactory.getLogger(AjusteService.class);


    public AjusteService (AjusteRepository ajusteRepository, ProductoRepository productoRepository) {

        this.ajusteRepository = ajusteRepository;
        this.productoRepository = productoRepository;
    }

    @Override
    public void agregarAjuste(AjusteDTO ajusteDTO) {

        Producto producto = productoRepository.findByNombreEquals(ajusteDTO.getProductoDTO());
        Ajuste ajuste = new Ajuste(

                ajusteDTO.getMotivo(),
                ajusteDTO.getCantidad(),
                producto,
                ajusteDTO.getFecha(),
                ajusteDTO.getTipo()


        );
        ajusteRepository.save(ajuste);
    }
}

