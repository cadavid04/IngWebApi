package co.udea.ingweb.api.repository;

import co.udea.ingweb.api.model.Actividad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActividadRepository extends JpaRepository<Actividad, String>{
    //public List<Actividad> findAllById(int idActividad);
    //public List<Actividad> find(int idActividad);
    public Actividad findByNameEquals(String nombre);
}
