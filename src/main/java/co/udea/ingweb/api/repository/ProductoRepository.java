package co.udea.ingweb.api.repository;

import co.udea.ingweb.api.model.Ajuste;
import co.udea.ingweb.api.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, String>{

    public Producto findByNombreEquals(String nombre);

}

