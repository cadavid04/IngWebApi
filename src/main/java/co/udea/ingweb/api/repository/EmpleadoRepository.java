package co.udea.ingweb.api.repository;

import co.udea.ingweb.api.model.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, String> {

    public Empleado findByNombreEquals(String nombre);
    //public Optional<Empleado> findById(int id);
    public Empleado getById(int id);

}
