package co.udea.ingweb.api.repository;

import co.udea.ingweb.api.model.VentaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VentaDetalleRepository extends JpaRepository<VentaDetalle, String> {

    List<VentaDetalle> findAllByVenta_Id(int id_Venta);

}
