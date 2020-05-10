package co.udea.ingweb.api.repository;

import co.udea.ingweb.api.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VentaRepository extends JpaRepository<Venta, String> {

    //Venta findTopByIdOrderByIdIdDesc();
    Venta findTopByOrderByIdDesc();
    Venta findById(int id);

}
